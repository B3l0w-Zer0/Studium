#lang racket
;Aufgabe 1
(define (loesche liste praedikat)
	(cond
		((null? liste) (list))
		((praedikat (car liste)) (loesche (cdr liste) praedikat))
		(else liste)
	)
)

;Aufgabe 2
(define (drehe liste)
	(define (helper liste result)
		(if (null? liste)
		;(if (eq? (list) liste)
			;(cons result (list))
			result
			(helper
				(cdr liste)
				(cons
					(car liste)
					result
				)
			)
		)
	)
	(helper liste (list))
)

;Aufgabe 3
(define (typ-or typ1 typ2)
	(lambda (x) (or (typ1 x) (typ2 x)))
)
(define paar-oder-liste? (typ-or pair? list?))
(define integer-oder-boolean? (typ-or integer? boolean?))
(integer-oder-boolean? (paar-oder-liste? (cons 1 2)))

;Aufgabe 4
(define (operation ops n)
	(define (get_op count ops stop)
		(if (= count stop)
			(car ops)
			(get_op (+ count 1) (cdr ops) stop)
		)
	)
	(lambda (x) (
		(get_op 1 ops n)
		; get the first element
		(car x)
		; we could not simply use cdr since cdr of a list is the POINTER
		; to the next element so we have to follow the pointer and with car
		; get the actual value at that location in the list .-. ffs
		(car (cdr x))
	))
)
 (define plus (operation (list + - * /) 1))
 (plus (list 1 2))

;Aufgabe 5
(define (caesar_encrypt_list data key)
	; we now could define a seperate function
	; like "get_key" or we could just keep a backup of our key
	; that we set to our key if we've reached the end of key
	(define (helper data key key_backup)
		(if (null? data) (list)
		(let*
			(
				; loop to beginning if we've reached the end
				(key (if (null? key) key_backup key))
				(encrypt_val (remainder (+ (car data) (car key)) 10))
				(data (cdr data))
				(key (cdr key))
			)
			(cons encrypt_val (helper data key key_backup))
		))
	)
	(helper data key key)
)
(caesar_encrypt_list (list 1 2 3 4 5 6) (list 1 3 3 7))
(caesar_encrypt_list '(-11) '(1 2 3 4))