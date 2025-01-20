#lang racket
;Aufgabe 1
#|(define (removeFirstLast string)
  
    (char-list (string->list string))
  (define (removeFirstLast-iter string helper end counter result)
    (if (null? string)
        result
        (if (= counter 1)
            (removeFirstLast-iter (cdr string) (+ helper 1) end counter (append result (cons (cdr string) '())))
            (if (= helper end)
                (removeFirstLast-iter (cdr string) helper end counter (append result (cons (car string) '())))
                (removeFirstLast-iter (cdr string) (+ helper 1) end counter (append result (cons (cdr string) '())))
                )
            )
        )
    )
  (removeFirstLast-iter char-list 0 (string-length string) 1 '())
  ) |#

(define (removeFirstLast string)
  (substring string 1 (- (string-length string) 1)))

;Aufgabe 2
#|(define (sicheresPasswort passwort)
  (define (laenge? passwort)
    (if (>= list-length 8))

  (define (Capital
           
    ) (sicheresPasswort-iter (string->list passwort) 0 0 0) |#

(define (sicheresPasswort passwort)
  (define (has-min-length? passwort)
    (>= (string-length passwort) 8))
  
  (define (count-special-chars passwort)
    (define (iter lst count)
      (if (null? lst)
          count
          (if (or (char-alphabetic? (car lst)) (char-numeric? (car lst)))
              (iter (cdr lst) (+ count 1))
              (iter (cdr lst) count ))))
    (iter (string->list passwort) 0))
  
  (define (has-upper-and-lower? passwort)
    (define (iter lst has-upper has-lower)
      (if (null? lst)
          (and has-upper has-lower)
          (iter (cdr lst)
                (or has-upper (char-upper-case? (car lst)))
                (or has-lower (char-lower-case? (car lst))))))
    (iter (string->list passwort) #f #f))
  
  (and (has-min-length? passwort)
       (>= (count-special-chars passwort) 2)
       (has-upper-and-lower? passwort)))















      
  #|    (define (sicheresPasswort passwort)
  (define (has-min-length? passwort)
    (>= (string-length passwort) 8))
  
  (define (count-special-chars passwort)
    (define (iter lst count)
      (if (null? lst)
          count
          (let ((ch (car lst)))
            (if (or (char-alphabetic? ch) (char-numeric? ch))
                (iter (cdr lst) count)
                (iter (cdr lst) (+ count 1))))))
    (iter (string->list passwort) 0))
  
  (define (has-upper-and-lower? passwort)
    (define (iter lst has-upper has-lower)
      (if (null? lst)
          (and has-upper has-lower)
          (let ((ch (car lst)))
            (iter (cdr lst)
                  (or has-upper (char-upper-case? ch))
                  (or has-lower (char-lower-case? ch))))))
    (iter (string->list passwort) #f #f))
  
  (and (has-min-length? passwort)
       (>= (count-special-chars passwort) 2)
       (has-upper-and-lower? passwort)))
|#