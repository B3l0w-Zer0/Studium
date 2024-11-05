#lang racket

;Aufgabe 1
;(define (regenmesser durchmesser hoehe menge) flaeche = (* 3.1415926535897 (* (/ durchmesser 2) (/ durchmesser 2))))(Volumen = (*flaeche hoehe))
   

;Aufgabe 2
(define (f a b c d e)
  (or (and a b d e) (and c a not d) (or a c)))

;Aufgabe 3
(define (note vortrag hausarbeit kolloquium)
  (note = (/ (+ (* 0.25 vortrag) (* 0.25 hausarbeit) (* 0.5 kolloquium)) 3))
  (if (
)