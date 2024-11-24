#lang racket
;Aufgabe 1
(require math/number-theory)
(define (f2 n) (+ (* n n) n 41))
(define (f3 n) (+ (- (* n n) (* 79 n)) 1601))
(define (primzahlen f)
  (define (prime-iter f n)
    (if ( not (prime? (f 0)))
        #f 
        (if (not (prime? (f n)))
             (- n 1)
             (prime-iter f (+ n 1)))))
(prime-iter f 0))
  
(primzahlen f2)
(primzahlen f3)

;KILL ME PLEASE!

;Aufgabe 2
(define (binaer-umrechner bin)
  (define (bin-iter bin stelle dez)
    (if (= bin 0)
        dez
        (if ( = (remainder bin 10) 1 )
            (bin-iter (quotient bin 10) (* stelle 2) (+ dez (* stelle (remainder bin 10))))
            (bin-iter (quotient bin 10) (* stelle 2) dez)))) 
  (bin-iter bin 1 0)
  ) 