#lang racket
(define (machen . strings)
  (define (machen-iter strings ausgabe counter)
    (if (null? strings)
        ausgabe
        (if (= counter 3)
            (if (or(eq? (car string->list (car strings))#\x)(eq? (car string->list (car strings))#\X))
                (machen-iter (cdr strings) (append (car strings) ausgabe) 0)
                (machen-iter (cdr string->list (cdr strings)) ausgabe 0))
            (machen-iter (cdr (string->list (cadr strings))) ausgabe (+ counter 1)))))
  (machen-iter strings '() 0))




      (machen "ein" "satz" "mit" "nix" "ausser" "xxx")