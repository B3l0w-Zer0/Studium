#lang racket
;Aufgabe 1
(define (anpassen liste)
  (define (anpassen-iter liste result)
    (if (empty? liste)
        result
        (if (even? (car liste))
            (if (= (remainder (car liste) 10) 0)
              (anpassen-iter (cdr liste) (append result (cons (* (car liste) (car liste)) '())))
              (anpassen-iter (cdr liste) (append result (cons (car liste) '()))))
            (anpassen-iter (cdr liste) result))
                        
        )
    )
  (anpassen-iter liste '()))

;Aufgabe 2
(define (gleich? liste)
  (define (gleich-iter liste counter-neg counter-pos)
    (if (null? liste)
        (if (= counter-neg counter-pos)
            #t
            #f
           )
        (if (positive? (car liste))
            (gleich-iter (cdr liste) counter-neg (+ counter-pos 1))
            (gleich-iter (cdr liste) (+ counter-neg 1) counter-pos)
            )
        )
    ) (gleich-iter liste 0 0)
)

;Aufgabe 3
(define (sortieren liste praedikat)
  (define (sortieren-iter liste praedikat praed-helper notimportant-helper)
    (if (null? liste)
        (append praed-helper notimportant-helper)
        (if (praedikat (car liste))
            (sortieren-iter (cdr liste) praedikat (append praed-helper (cons (car liste) '())) notimportant-helper )
            (sortieren-iter (cdr liste) praedikat praed-helper (append notimportant-helper (cons (car liste) '())) )
            )
        )
    )(sortieren-iter liste praedikat '() '())
  )