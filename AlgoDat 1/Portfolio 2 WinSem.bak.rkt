#lang racket
;Aufgabe 1
(define (zaehleteiler n)
  (define (zähler-iter anzahl hilfe n)
    (if (<= n hilfe)
      anzahl
      (if (= (remainder n hilfe) 0)
      (zähler-iter (+ anzahl 1) (+ hilfe 1) n)
      (zähler-iter anzahl (+ hilfe 1) n))))
  (zähler-iter 0 2 n))

;Aufgabe 2
(define (zahl-umdrehen zahl)
  (define (umdrehen-iter zahl result)
    (if (= zahl 0)
        result
        (umdrehen-iter (quotient zahl 10) (+ (* result 10) (remainder zahl 10)))))
  (umdrehen-iter zahl 0))


(define (linker-index ziffer zahl)
  (define (lindex-iter zahl stelle m r)
       (if (= zahl 0)
        r
        (if (and (= (remainder zahl 10) ziffer) (= m 0))
           
            (lindex-iter (quotient zahl 10) (+ stelle 1) (+ 1 m) stelle)
             (lindex-iter (quotient zahl 10) (+ stelle 1) m r)
            )
        ) 
    )
  (lindex-iter (abs (zahl-umdrehen zahl)) 1 0 0)) 
    
(linker-index 1 -513318615)



;KILL ME PLEASE!

    
   #| (cond 
      ((= zahl 0) #f)
      ((= (modulo zahl (expt 10 position)) (expt 10 (- position 1))) ziffer position)
      (else (linker-index-iter ziffer zahl (+ position 1))))
  (linker-index-iter ziffer zahl 1))) |#


