#lang racket
;Aufgabe 1
(define (zaehlen start ende n)
  (define (hilfsfunktion start ende n zaehler)
    (if (> start ende)
        0
        (if (and (= (modulo start 3) 0)
            (= (modulo start 7) 0))
            (if (= zaehler n)
             start
             (hilfsfunktion (+ start 1) ende n (+ zaehler 1)))
             (hilfsfunktion (+ start 1) ende n zaehler))))
  (hilfsfunktion start ende n 1))

;Aufgabe 2
(define (gleiche-ziffern zahl)
  (define (erste-ziffer zahl1)
    (if (< zahl1 10)
        zahl1
        (erste-ziffer (quotient zahl1 10))))
  (erste-ziffer zahl)

  (define (letzte-ziffer zahl2)
    (remainder zahl2 10))
  (letzte-ziffer zahl)
  
  (define (gleiche-ziffern-iter zahl)
    (if (= (erste-ziffer zahl) (letzte-ziffer zahl))
        zahl
        (gleiche-ziffern-iter (+ zahl 1))
  )
 )
  (gleiche-ziffern-iter zahl)
)
    