#lang racket
;Aufgabe 1

;Aufgabe 2
(define (teilen text trennzeichen)
  (define (teilen-iter list trennzeichen result current)
    (if (null? trennzeichen)
       (if (null? list)
           (cons result current)
           (if (eq? (car list) #\ )
               (if (null? current)
                   (teilen-iter (cdr list) trennzeichen result '())
                   (teilen-iter (cdr list) trennzeichen (append result (cons (list->string current) '())) '())
                   )
               (teilen-iter (cdr list) trennzeichen result (append current (cons (car list) '())))
               )
               
           )
       (if (null? list)
           (teilen-iter result (cdr trennzeichen) list current)
           (if (eq? (car list) (car trennzeichen))
               (teilen-iter (cdr list) trennzeichen (append result (cons #\ '())) current)
               (teilen-iter (cdr list) trennzeichen (append result (cons (car list) '())) current)
                )
            )
        )
    ) (teilen-iter (string->list text) (string->list trennzeichen) '() '())
)
(teilen "nach, den, Abschluss-Prüfungen," ",-")

#|(define (teilen text trennzeichen)
  (define (teilen-iter list trennzeichen result)
    (if (and (null? list) (null? trennzeichen))
        (list->string result)
         (cond ((eq? (car list) (car trennzeichen))(teilen-iter (cdr list) trennzeichen result))
               ((not (eq? (car list) (car trennzeichen)))  (teilen-iter (cdr list) trennzeichen (append result (cons (car list) '()))))
              
               )   
         )
    )(teilen-iter (string->list text) (string->list trennzeichen) '()))|#

;Aufgabe 3
(define (ersetzen v pos . data)
  (define (ersetzen-iter v end result counter data)
    (if (= end counter)
        (if (null? data)
            (if (null? v)
                result
               (ersetzen-iter (cdr v) end (append result (list (car v))) counter '())
                )
            (ersetzen-iter (cdr v) end (append result (list (car data))) counter (cdr data)))
             
        (ersetzen-iter (cdr v) end (append result (cons (car v) '())) (+ counter 1) data)
        )
    ) (ersetzen-iter (vector->list v) pos '() 0 data)
  )

(ersetzen (vector 0 1 2 3 4 5) 2 42 #t sin)