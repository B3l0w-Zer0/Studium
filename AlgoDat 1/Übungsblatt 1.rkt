#lang racket
;Aufgabe 1
(define (x)
  (-(/(+ 9 6)(* (- 3 1) 5))(* (- (/ 7 8) 2) 4)))

;Aufgabe 2
(define (g u v w)
 (+ (/ (- v (* 7 u)) (- u w)) (/ (+ u v) (- (* w 6) v))))

;Aufgabe 3
(define (my-max x y)
  (cond ((> x y) x)
        ((<= x y) y)))

;Aufgabe 4
(define (groesser-zehn? x)
  (cond ((> x 10) (display"größer als 10"))
                  ((<= x 10) (display" ist kleiner als 10"))))

;Aufgabe 5
(define (groesserp? x y z)
  (cond ((> (+ x y) z) #t)
        ((<= (+ x y) z) #f)))

;Aufgabe 6
(define (squared-max x y z)
  (cond ((> (* x x) (* y y) (* z z)) (* x x))
        ((> (* y y) (* z z) (* x x)) (* y y))
        ((> (* z z) (* y y) (* x x)) (* z z))))