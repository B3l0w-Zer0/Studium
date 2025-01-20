#lang racket
;Aufgabe 1
(define (werte-aus term zuweisung)
#|  (define (operator1 term zuweisung counter1)
    (if (= counter1 0)
    (if (number? (cadr term))
         (cadr term)
         ((let ([operand1 (cdr (car zuweisung))]
                [op (car term)]
           )) operator1 term zuweisung 1)
         )
    operand1
    )
    ) (operator1 term 0 zuweisung '() 0)
  )|#

#|(define (convert-to-procedure term)
  (if (and (list? term) (symbol? (car term)))
      (eval (car term))
      'not-a-procedure)) (convert-to-procedure term)|#
                          
 (define (iter1 term operand1 operand2 zuweisung op result counter1 counter2)
    (if (= counter1 0)    
        (iter1 term (if (number? (cadr term))
                        (cadr term)
                        (car (cdr (car zuweisung))))  (if (number? (caddr term))
                                                                    (caddr term)
                                                                    (car (cdr (car (cdr zuweisung)))))
                        zuweisung (eval (car term)) result 1 0)
        (if (= counter2 0)
            (iter1 term operand1 operand2 zuweisung op (op operand1 operand2) 1 1)
             result
        )
        )
          
        )(iter1 term 0 0 zuweisung (eval (car term)) 0 0 0)
  
  )

;Aufgabe2
(define (deep-memq element liste)
  (define (process-nested-list lst)
  (if (empty? lst)
      '() 
      (if (list? (first lst))
          (append (process-nested-list (first lst))
                  (process-nested-list (rest lst)))
          (cons (first lst) (process-nested-list (rest lst))))))
  
 (define (suchen-iter element liste result)
    (if (null? liste)
        result
        (if (eq? (car liste) element)
            (suchen-iter element (cdr liste) #t)
            (suchen-iter element (cdr liste) (if (eq? result #t)
                                                 #t
                                                 #f))
            )
        )
    ) (suchen-iter element (process-nested-list liste) #f)
  )
          
(deep-memq 2 '(1 2 3))
(deep-memq 3 '(1 (2 (4 5) 3)))
(deep-memq 3 '((1 5) (2 (7 2 6 4 (4 5) (2 4)))))

;Aufgabe 3
(define (alle-kleineren grenze liste)
  (define (zerlege-liste liste)
    (if (empty? liste)
      '() 
      (if (list? (first liste))
          (append (zerlege-liste (first liste))
                  (zerlege-liste (rest liste)))
          (cons (first liste) (zerlege-liste (rest liste))))))
  
  (define (iter grenze liste result)
    (if (null? liste)
        result
        (if (> grenze (car liste))
            (iter grenze (cdr liste) (append result (cons (car liste) '())))
            (iter grenze (cdr liste) result))
        )
    ) (iter grenze (zerlege-liste liste) '())
  ) 
        
 (alle-kleineren 4 '((7 2 (3 40)) (3 4 (2 3 (9)))))
 (alle-kleineren 3 '((3 4 (6 3 (9)) 8)))
(alle-kleineren 22 '((19 20) (21 22) (23 24)))

;Aufgabe 4
(define (suche-schrittzahl n)
 (define (suche-iter n count result currentnum currenttemp counter1 counter2 counter3)
   (if (= count n)
       result
       (if (= counter1 0)
           (suche-iter n count result (+ currentnum 1) (+ currentnum 1) 1 counter2 counter3)
           (if (= counter2 0)
               (suche-iter n count result (number->string currentnum) currenttemp 1 1 counter3)
               (if (= counter3 0)
                   (suche-iter n count result (string->list currentnum) currenttemp 1 1 1)
                   
           
