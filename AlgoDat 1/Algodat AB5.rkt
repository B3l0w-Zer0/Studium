#lang racket
;Aufgabe 1
(define (euler-n n)
  (euler-n-iter n 0 0)
  )


(define (euler-n-iter n i euler)
  (if (> i n)
      euler
      (+ euler (/ 1 (fac i))
         (euler-n-iter n (+ i 1) euler)))
  )

(define (fac n)
  (define (fac-iter n fac i)
    (if (> i n)
        fac
        (* fac i
           (fac-iter n fac (+ i 1))))
    )
  (fac-iter n 1 1)
  )

;Aufgabe 2
(define (ackermann n m)
  (cond ((= n 0) (+ m 1))
        ((= m 0) (ackermann (- n 1) 1))
        (else (ackermann (- n 1) (ackermann n (- m 1)))))
  )

;Aufgabe 3
(define (osterformel j)
  (let ((a (remainder j 19)))
    (let ((b (remainder j 4)))
      (let ((c (remainder j 7)))
        (let ((k (floor (/ j 100))))
          (let ((p (floor (/ (+ (* 8 k) 13) 25))))
            (let ((q (floor (/ k 4))))
              (let ((M (remainder (- (+ 15 k) p q) 30)))
                (let ((N (remainder (- (+ 4 k) q) 7)))
                  (let ((d (remainder (+ (* 19 a) M) 30)))
                    (let ((e (remainder (+ (* 2 b) (* 4 c) (* 6 d) N) 7)))
                      (let ((o (+ 22 d e))) o)))))))))))
  )

;Aufgabe 4
  (define (maxziffer n)
  (maxziffer-iter n 0)
  )

(define (maxziffer-iter n max)
  (if (< n 9)
      max
      (if (> (remainder n 10) max)
          (maxziffer-iter (quotient n 10) (remainder n 10))
          (maxziffer-iter (quotient n 10) max)))
  )

;Aufgabe 5
(define (sum x y)
	(define (n x) (+ x 1))
	(define (helper x y)
		(if (= y 0)
			x
			(n (helper x (- y 1)))
		)
	)
	(helper x y)
)

;Aufgabe 6
(define (sum x y)
	(define (n x) (+ x 1))
	(define (helper x y)
		(if (= y 0)
			x
			(n (helper x (- y 1)))
		)
	)
	(helper x y)
)
(define (mul x y)
	(if (= y 0)
		0
		(sum x (mul x (- y 1)))
	)
)

;Aufgabe 7
(define (q n)
	(cond
		((= n 1) 1)
		((= n 2) 1)
		(else (+
			(q (- n (q (- n 1))))
			(q (- n (q (- n 2))))
		))
	)
)