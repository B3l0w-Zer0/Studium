#lang racket
;Aufgabe 1
(define (removeFirstLast string)
  (substring string 1 (- (string-length string) 1))
  )

;Aufgabe 2
(define (sicheresPasswort passwort)
  (define (passwordLength length)
    (if (>= (string-length passwort) 8)
        #t
        #f
       )
    )
  (define (countSpecial passwort)
    (define (countSpecial-iter passwort count)
    (if (null? passwort)
        count
        (if (or (not (char-alphabetic? (car passwort))) (char-numeric? (car passwort)))
            (countSpecial-iter (cdr passwort) (+ count 1))
            (countSpecial-iter (cdr passwort) count))
        )
    ) (countSpecial-iter (string->list passwort) 0))
  
  (define (countLetters passwort)
    (define (letterHelper passwort hasUpper hasLower)
      (if (null? passwort)
          (and hasUpper hasLower)
          (letterHelper (cdr passwort)
                        (or hasUpper (char-upper-case? (car passwort)))
                        (or hasLower (char-lower-case? (car passwort)))
                        )
          )
      ) (letterHelper (string->list passwort) #f #f))
  (and (passwordLength passwort)
       (countLetters passwort)
       (>= (countSpecial passwort) 2))
  )

(define (vector-add . vecs)
	(define (helper in out)
		(if (null? in) out
			(helper (cdr in) (map + out (car in)))
		)
	)
	(helper (cdr vecs) (car vecs))
)
(vector-add '(1 2 ) '(1 2) '(1 2))
(vector-add '(1 2 3) '(4 5 6) '(7 8 9))