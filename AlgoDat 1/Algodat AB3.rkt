#lang racket
;Aufgabe 1
(define (sinus-approx x)
  (if (< (abs x) 0.1)
      x
      (* 3 (sinus-approx (/ x 3)) - 4 (expt (sinus-approx (/ x 3)) 3))))

;Aufgabe 2
(define (count-perm x)
  (define (iter n result)
    (if (= n 1)
        result
        (iter (- n 1) (* n result))))
  (iter x 1))

;Aufgabe 3 ?!
 (define (isbn-test isbn)
  (define (summe-iter ergebnis z mul)
    (if (= mul 0)
        ergebnis
        (summe-iter (+ ergebnis (* mul (remainder z 10))) (quotient z 10) (- mul 1))))
  (define s (remainder (summe-iter 0 isbn 9) 11))
  (if (= s 10)
      "X"
      s))

;Aufgabe 4
(define (zylinder-kegel radius-zylinder hoehe-zylinder radius-kegel hoehe-kegel)
  (define pi 3.1415926535897)
  (define (volumen-zylinder)
   (* pi (expt radius-zylinder 2) hoehe-zylinder))
  (define (volumen-kegel)
   (* (/ 1 3) pi (expt radius-kegel 2) hoehe-kegel))
  (/ (volumen-zylinder) (volumen-kegel)))