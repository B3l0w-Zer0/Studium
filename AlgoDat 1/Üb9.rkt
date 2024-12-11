#lang racket
;Aufgabe 1


;Aufgabe 2
(define (liste-teilen eingabe)
  (define (liste-teilen-iter eingabe counter resultleft resultright)
    (if (empty? eingabe)
        (list  resultleft resultright)
        (if (odd? counter)
            (liste-teilen-iter (cdr eingabe) (+ counter 1) (append resultleft (cons (car eingabe) '())) resultright)
            (liste-teilen-iter (cdr eingabe) (+ counter 1) resultleft (append resultright (cons (car eingabe) '())))
            )
        )
    ) (liste-teilen-iter eingabe 1 '() '())
  )

;Aufgabe 3
(define (liste-verschmelzen eingabe)
  (define (liste-verschmelzen-iter links rechts)
    (if (null? rechts)
        (if (null? links)
            '()
            (list (car links)))
       (cons (car links) (cons (car rechts) (liste-verschmelzen-iter (cdr links) (cdr rechts))))
       )
    ) (liste-verschmelzen-iter (car eingabe) (cadr eingabe))
  )

;Aufgabe 4
(define (hamming ziffer1 ziffer2)
  (define (hamming-iter ziffer1 ziffer2 dist)
    (if (null? ziffer1)
        dist
        (if (equal? (car ziffer1) (car ziffer2))
            (hamming-iter (cdr ziffer1) (cdr ziffer2) dist)
            (hamming-iter (cdr ziffer1) (cdr ziffer2) (+ dist 1))
            )
        )
    )   
  (hamming-iter ziffer1 ziffer2 0)
  )


           ;EXMATRIKULATION IS RAUS PLS KILL ME