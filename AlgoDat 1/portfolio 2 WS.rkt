#lang racket
;Aufgabe 1
(

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