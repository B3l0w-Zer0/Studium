#lang racket
;Aufgabe 1
#|(define (werte-aus term zuweisung)
  (define (werte-aus-iter term zuweisung operator result)
    (if (eq? (car term) (or + - / *))
        (if ((empty? term)
            result
            (if (null? result) 
                (werte-aus-iter operator (cdr term) 
        "Es wurde kein Operator eingegeben"
        )
        )
  (werte-aus-iter term (cdr zuweisung) (car term) 0)
    )|#

(define (werte-aus term zuweisung)
  (define (prozedur term)
    (cond ((equal? (car term) '+) +)
          ((equal? (car term) '-) -)
          ((equal? (car term) '*) *)
          ((equal? (car term) '/) /)
          )
    )

  (define (getValue var zuweisung)
    (if (number? var)
      var
      (if (equal? var (car (car zuweisung)))
        (cadr (car zuweisung))
        (getValue var (cdr zuweisung))
        )
      )
    )

  (define (werte-aus-iter operator term zuweisung result)
    (if (empty? term)
      result
      (if (null? result)
        (werte-aus-iter operator (cdr term) zuweisung (getValue (car term) zuweisung))
        (werte-aus-iter operator (cdr term) zuweisung (operator result (getValue (car term) zuweisung)))
        )
      )
    )

  (werte-aus-iter (prozedur term) (cdr term) zuweisung '())
  )

;Aufgabe 2
(define (deep-memq element liste)
  (if (empty? liste)
    false
    (if (list? liste)
      (or (deep-memq element (car liste)) (deep-memq element (cdr liste)))
      (if (eq? element liste)
        true
        false
        )
      )
    )
  )