#lang racket
;Aufgabe 2
(define (liste-teilen eingabe)
  (define (teilen-iter eingabe left right counter)
    (if (null? eingabe)
        (list left right)
        (if (even? counter)
            (teilen-iter (cdr eingabe) left (append right (cons (car eingabe) '())) (+ counter 1))
            (teilen-iter (cdr eingabe) (append left (cons (car eingabe) '())) right (+ counter 1))
            )
        )
    ) (teilen-iter eingabe '() '() 1)
)

 (liste-teilen '(1 2 3 4 5 6 7 8 9))

;Aufgabe 2
(define (listen-verschmelzen eingabe)
  (define (helper left right counter out)
		(cond
			((null? left) (append out right))
			((null? right) (append out left))
			((odd? counter)
				(helper
					(cdr left)
					right
					(+ counter 1)
					(append out (list (car left)))
				)
			)
			((even? counter)
				(helper
					left
					(cdr right)
					(+ counter 1)
					(append out (list(car right)))
				)
			)
		)
	)
	(helper (car eingabe) (cadr eingabe) 1 '()))

 (listen-verschmelzen '((1 3) (2 4 6 8)))