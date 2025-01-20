#lang racket
(define(einstellige-quersumme zahl)
  (define (quer-iter zahl summe)
    (if ( and (not(= zahl 0)) (not(> summe 10)))
        (quer-iter (quotient zahl 10) (+ (remainder zahl 10) summe))
          (if (>= summe 10)
            (quer-iter (quotient summe 10) (+ (remainder summe 10) 0))
            summe
        )))
    
  (quer-iter (abs zahl) 0))

(define(einstellige-quersumme1 zahl)
  (define (quer-iter zahl summe)
    (if  (= zahl 0) 
        
          (if (>= summe 10)
            (quer-iter (quotient summe 10) (+ (remainder summe 10) 0))
            summe)
   (quer-iter (quotient zahl 10) (+ (remainder zahl 10) summe))
        ))
    
  (quer-iter (abs zahl) 0))

;Aufgabe 2
(define (vergleich zahl op)
  (define (vergleich-iter zahl op count)
    (if (< zahl 10)
        count
        (if (op (remainder (quotient zahl 10) 10) (remainder zahl 10))
            (vergleich-iter (quotient zahl 10) op (+ count 1))
            (vergleich-iter (quotient zahl 10) op count))))
  (vergleich-iter zahl op 0))