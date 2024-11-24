#lang racket
;Aufgabe 1
(define (ganzzahlige-wurzel? n)
  (cond ((integer? (sqrt n)) #t)
        (else #f)))

;Aufgabe 2
(define (fakt n)
  (if (even? n)
      2
      (let* ((a (ceiling (sqrt n))))
        (fakt-iter a n)))
  )

(define (fakt-iter a n)
    (let ((b (sqrt (- (* a a) n))))
      (if (integer? (sqrt (* b b)))
        (- a (sqrt (* b b)))
        (fakt-iter (+ a 1) n)))
  )


;Aufgabe 3
(define (primzahl? n)
	(if (= n 2)
		#t
		(= (fakt n) 1)
	)
)

;Aufgabe 4
(define (kubiksumme n)
	(define (cross_sum n sum)
		(if (= n 0)
			sum
			(cross_sum
				(quotient n 10)
				(+ sum (remainder n 10))
			)
		)
	)
	(define (cubic n)
		(* n n n)
	)
	(cubic(cross_sum n 0))
)

;Aufgabe 5
define (caesar_encrypt n k)
    (define (caesar_stelle char k)
        (remainder (+ char k) 10))
    (define (caesar_summierung n k res i)
        (if (= n 0)
            res
            (caesar_summierung
                (quotient n 10)
                k
                (+
                    res
                    (* (caesar_stelle
                            (remainder n 10) k)
                        (expt 10 i)
                    )
                )
                (+ i 1)
            )
        )
    )
    (caesar_summierung n k 0 0)
)
