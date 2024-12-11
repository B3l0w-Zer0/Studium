#lang racket
;Aufgabe 1
(define (loesche liste praedikat)
  (define (loesche-iter liste praedikat)
    (if (praedikat (car liste))
        (loesche-iter (cdr liste) praedikat)
         liste)
    ) (loesche-iter liste praedikat)
  )

;Aufgabe 2
(define (drehe liste)
  (define (drehe-iter liste result)
    (if (null? liste)
        result
        (drehe-iter (cdr liste) (cons (car liste) result)))) (drehe-iter liste (list)))

;Aufgabe 3
(define (typ-or typ1 typ2)
  (lambda (x) (or (typ1 x) (typ2 x)))
  )

;Aufgabe 4
(define (operation operatoren n)
  (define (zaehler-iter operatoren n helper)
    (if (= helper n)
        (car operatoren)
        (zaehler-iter (cdr operatoren) n (+ helper 1)
        )
    ))
  (lambda (x) (
  (zaehler-iter operatoren n 1)
  (car x)
  (car (cdr x))
  ))
  )

;Aufgabe 5
