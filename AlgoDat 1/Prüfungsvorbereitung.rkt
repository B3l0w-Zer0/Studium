#lang racket/base
;Prüfungsvorbereitung

;Blatt 7
;Aufgabe 1
(define (loesche liste praedikat)
  (define (loesche-iter liste praedikat result)
    (if (null? liste)
        result
        (if (praedikat (car liste))
            (loesche-iter (cdr liste) praedikat result)
            (loesche-iter '() praedikat (cons (car liste) (cdr liste)))
            )
        )
    ) (loesche-iter liste praedikat '())
  )

(loesche (list 4 6 8 3 2 4 5) even?)
(loesche (list 9 7 8 3 2 4 5) odd?)

;Aufgabe 2
(define (drehe liste)
; (reverse liste))

  (define (drehe-iter liste result)
    (if (null? liste)
        result
        (drehe-iter (cdr liste) (cons (car liste) result))
        )
    ) (drehe-iter liste '())
  )

(drehe (list 1 2 3))
(drehe (list 1 2 (list 3)))
(drehe (list 1 (list 5 6) 2 (list 3 4)))

;Aufgabe 3
(define (typ-or typ1 typ2)
  (lambda (x) (or (typ1 x) (typ2 x)))
  )

(define paar-oder-liste? (typ-or pair? list?))
 (define integer-oder-boolean? (typ-or integer? boolean?))
 (integer-oder-boolean? (paar-oder-liste? (cons 1 2)))

;Aufgabe 4
(define (operation operatoren n)
  (define (operation-iter operatoren n counter)
        (if (= counter n)
            (car operatoren)
            (operation-iter (cdr operatoren) n (+ counter 1))
            )
            )
    (lambda (x) ((operation-iter operatoren n 1)
      (car x)
      (cadr x)
      )
    )
  )
 (define plus (operation (list + - * /) 1))
 (plus (list 1 2))
  
;Aufgabe 5
(define (caesar_encrypt_list data key)
  (define (caesar-iter data key helper result)
    (if (null? data)
        result
        (if (null? key)
            (caesar-iter data helper helper result)
            (caesar-iter (cdr data) (cdr key) helper (if ( >= (+ (car data) (car key)) 10)
                                                         (append result (cons (remainder (+ (car data) (car key)) 10) '()))
                                                         (append result (cons (+ (car data) (car key)) '()))
                                                         )
                         )
            )
        )
    ) (caesar-iter data key key '())
  )

 (caesar_encrypt_list (list 1 2 3 4 5 6) (list 1 3 3 7))

;Blatt 8
;Aufgabe 1
(define (compress liste)
  (define (compress-iter liste currentchar counter result)
    (if (null? liste)
        result
        (if (null? (cdr liste))
                (compress-iter (cdr liste) '() 1 (if (= counter 1)
                                                         (append result (cons currentchar '()))
                                                         (append result (list counter currentchar ))
                                                         )
                               )
                (if (eq? (car liste) (cadr liste))
                    (compress-iter (cdr liste) (car liste) (+ counter 1) result)
            
                    (compress-iter (cdr liste) (cadr liste) 1 (if (= counter 1)
                                                         (append result (cons currentchar '()))
                                                         (append result (list counter currentchar)))
            )
        )
    )
    )
    )(compress-iter liste (car liste) 1 '())
  )

(compress '(a b c))
(compress '(a b b c c c))
(compress '(a b b c c c a b c))
(compress '(a a a a a a a a a a))

;Aufgabe 2
(define (expandiere sym-liste)
  (define (expandiere-iter liste currentchar counter finalcount result counter2)
    (if (null? liste)
        result
        (if (null? (cdr liste))
            (if (= counter2 1)
            (if (= counter finalcount)
                (expandiere-iter (cdr liste) '() (+ counter 1) finalcount (append result (cons currentchar '())) 0)
                (expandiere-iter liste currentchar (+ counter 1) finalcount (append result (cons currentchar '())) 1))
            (if (number? currentchar)
                (expandiere-iter liste '() 1 (car liste) result 1)
                (expandiere-iter (cdr liste) '() 1 1 (append result (cons currentchar '())) 0)
            )
               )
                   
        (if (= counter2 1)
            (if (= counter finalcount)
                (expandiere-iter (cdr liste) (cadr liste) (+ counter 1) finalcount (append result (cons currentchar '())) 0)
                (expandiere-iter liste currentchar (+ counter 1) finalcount (append result (cons currentchar '())) 1))
            (if (number? currentchar)
                (expandiere-iter (cdr liste) (cadr liste) 1 (car liste) result 1)
                (expandiere-iter (cdr liste) (cadr liste) 1 1 (append result (cons currentchar '())) 0)
            )
               )
            
            )
        )
    ) (expandiere-iter sym-liste (car sym-liste) 1 0 '() 0)
  )

(expandiere '(7 b a 3 c))
(expandiere '(2 b 2 b c))

;Aufgabe 3
(define (loeschen liste n)
  (define (loeschen-iter counter liste n)
    (if (= counter n)
        liste
        (loeschen-iter (+ counter 1) (cdr liste) n)
        )
    ) (loeschen-iter 0 liste n)
  )

(loeschen '(2 3 4 5 6 7) 3)

;Blatt 9
;Aufgabe 1
;Haha dachtest du wirklich?! XD Nope you are on your own with these fucking towers :3

;Aufgabe 2
(define (liste-teilen eingabe)
  (define (teilen-iter eingabe left right counter)
    (if (null? eingabe)
        (list left right)
        (if (odd? counter)
            (teilen-iter (cdr eingabe) (append left (cons (car eingabe) '())) right (+ counter 1))
            (teilen-iter (cdr eingabe) left (append right (cons (car eingabe) '())) (+ counter 1))
            )
        )
    ) (teilen-iter eingabe '() '() 0)
  )

(liste-teilen '(1 2 3 4 5 6 7 8 9))
(liste-teilen '(1 2 3 4 5 6 7 8 9 10))
(liste-teilen '())

;Aufgabe 3
(define (listen-verschmelzen eingabe)
  (define (verschmelzen-iter left right counter result)
  (if (and (null? left) (null? right))
      result
      (if (odd? counter)
          (if (null? left)
              (verschmelzen-iter '() right (+ counter 1) result)
              (verschmelzen-iter (cdr left) right (+ counter 1) (append result (cons (car left) '())))
          )                 
          (if (null? right)
              (verschmelzen-iter left '() (+ counter 1) result)
              (verschmelzen-iter left (cdr right) (+ counter 1) (append result (cons (car right) '())))
              )
      )
      )
    ) (verschmelzen-iter (car eingabe) (cadr eingabe) 1 '())
  )

(listen-verschmelzen '((1 3 5 7 9) (2 4 6 8)))
(listen-verschmelzen '((1 3 5 7 9) (2 4 6 8 10)))
(listen-verschmelzen '(() (2 4 6 8 10)))
(listen-verschmelzen '((1 3 5 7 9) ()))
(listen-verschmelzen '(() ()))

;Aufgabe 4
(define (hamming left right)
  (define (hamming-iter left right counter)
    (if (and (null? left) (null? right))
        counter
        (if (eq? (car left) (car right))
            (hamming-iter (cdr left) (cdr right) counter)
            (hamming-iter (cdr left) (cdr right) (+ counter 1)))
        )
    ) (hamming-iter left right 0)
  )

(hamming '(1 0 1 1 0 1 0 1) '(0 1 1 1 0 1 0 0))
(hamming '(1 0 1) '(1 0 1))

;Blatt 10
;Aufgabe 1
(define (removeFirstLast string)
  (substring string 1 (- (string-length string) 1))
  )

(removeFirstLast "Hallo Welt")
(removeFirstLast "Algorithmik")

;Aufgabe 2
(define (sicheresPasswort passwort)
  (define (passwort-iter passwort counter uppercase lowercase specialchars boolean)
    (if (null? passwort)
        #|(if (and (>= counter 8) (>= uppercase 1) (>= lowercase 1) (>= specialchars 2))
            (passwort-iter passwort counter uppercase lowercase specialchars #t)
            (passwort-iter passwort counter uppercase lowercase specialchars #f)
            )|#
        (and (>= counter 8) (>= uppercase 1) (>= lowercase 1) (>= specialchars 2))
        (if (char-upper-case? (car passwort))
            (passwort-iter (cdr passwort) (+ counter 1) (+ uppercase 1) lowercase specialchars #f)
            (if (char-lower-case? (car passwort))
                (passwort-iter (cdr passwort) (+ counter 1) uppercase (+ lowercase 1) specialchars #f)
                (if (or (not (char-numeric? (car passwort))) (char-numeric? (car passwort)))
                    (passwort-iter (cdr passwort) (+ counter 1) uppercase lowercase (+ specialchars 1) #f)
                    (passwort-iter (cdr passwort) (+ counter 1) uppercase lowercase specialchars #f)
                    )
                )
            )
        )
    ) (passwort-iter (string->list passwort) 0 0 0 0 #f)
  )

(sicheresPasswort "aUljsb!f/KasDhf")
(sicheresPasswort "ABC123")

;Aufgabe 3
;FUUUUUUUCK
(define (isAnagramm anagramm string2)
 (define (anagramm-iter anagramm string2 counter1 counter2 counter3)
   (if (= counter1 0)
       (anagramm-iter (string->list anagramm) (string->list string2) 1 0 0)
       (if (= counter2 0)
           (anagramm-iter (filter char-alphabetic? anagramm) (filter char-alphabetic? string2) 1 1 0)
           (if (= counter3 0)
               (anagramm-iter (sort anagramm char<?)(sort string2 char<?) 1 1 1)
               (if (equal? anagramm string2)
                   #t
                   #f
               )
           )
           )
       )
   ) (anagramm-iter (string-downcase anagramm) (string-downcase string2) 0 0 0)
  )

(isAnagramm "Desperation" "A rope ends it")
(isAnagramm "Eleven plus two" "Twelve plus one")
(isAnagramm "Test" "Hallo")

;Aufgabe 4
(define (vector-add . vektoren)
  (define (add-iter in out)
    (if (null? in)
        out
        (add-iter (cdr in) (map + out (car in)))
        )
    ) (add-iter (cdr vektoren) (car vektoren))
  )
(vector-add '(1 2 ) '(1 2) '(1 2))
(vector-add '(1 2 3) '(4 5 6) '(7 8 9))

;Blatt 11
;Aufgabe 1
(define (werte-aus term zuweisung)
 (define (iter1 term operand1 operand2 zuweisung op result counter1 counter2)
    (if (= counter1 0)    
        (iter1 term (if (number? (cadr term))
                        (cadr term)
                        (car (cdr (car zuweisung))))  (if (number? (caddr term))
                                                                    (caddr term)
                                                                    (car (cdr (car (cdr zuweisung)))))
                        zuweisung  (eval (car term)) result 1 0)
        (if (= counter2 0)
            (iter1 term operand1 operand2 zuweisung op (op operand1 operand2) 1 1)
             result
        )
        )
          
        )(iter1 term 0 0 zuweisung (eval (car term)) 0 0 0)
  )

;(werte-aus '(+ x 2) '((x 7)))
;(werte-aus '(* x y) '((x 3) (y 5)))
;(werte-aus '(/ a b) '((a 6) (b 3)))

;Aufgabe 2
(define (deep-memq element liste)
  
  (define (liste-auflösen liste)
    (if (null? liste)
        '()
        (if (list? (car liste))
            (append (liste-auflösen (car liste)) (liste-auflösen (cdr liste)))
            (cons (car liste) (liste-auflösen (cdr liste)))
            )
        )
    ) (liste-auflösen liste)

  (define (memq element liste result)
    (if (null? liste)
        result
        (if (eq? element (car liste))
            (memq element '() #t)
            (memq element (cdr liste) #f)
            )
        )
    ) (memq element (liste-auflösen liste) #f)
  )

(deep-memq 2 '(1 2 3))
(deep-memq 3 '(1 (2 (4 5) 3)))
(deep-memq 3 '((1 5) (2 (7 2 6 4 (4 5) (2 4)))))

;Aufgabe 3
(define (alle-kleineren grenze liste)

  (define (liste-auflösen liste)
    (if (null? liste)
        '()
        (if (list? (car liste))
            (append (liste-auflösen (car liste)) (liste-auflösen (cdr liste)))
            (cons (car liste) (liste-auflösen (cdr liste)))
            )
        )
    ) (liste-auflösen liste)
  
  (define (iter grenze liste result)
    (if (null? liste)
        result
        (if (< (car liste) grenze)
            (iter grenze (cdr liste) (append result (cons (car liste) '())))
            (iter grenze (cdr liste) result)
            )
        )
    ) (iter grenze (liste-auflösen liste) '())
  )

(alle-kleineren 4 '((7 2 (3 40)) (3 4 (2 3 (9)))))
(alle-kleineren 3 '((3 4 (6 3 (9)) 8)))
(alle-kleineren 22 '((19 20) (21 22) (23 24)))

;Blatt 12
;Aufgabe 1
(define (wort-sortieren wort)
  (list->string (sort (string->list wort) char-ci<?))
  )

(wort-sortieren "Guten Tag")

;Aufgabe 2
(define (string-enthalten satz wort)
  (define (enthalten-iter satz wort tempwort result)
    (if (null? satz)
        result
        (if (null? wort)
            (enthalten-iter '() '() tempwort #t)
            (if (eq? (car satz) (car wort))
                (enthalten-iter (cdr satz) (cdr wort) tempwort #f)
                (enthalten-iter (cdr satz) tempwort tempwort #f)
                )
            )
        )
    ) (enthalten-iter (string->list satz) (string->list wort) (string->list wort) #f)
  )
                          
(string-enthalten "Heute ist Dienstag" "Dienst")
(string-enthalten "Heute ist Dienstag" "Dienstags")

;Aufgabe 3
(define (tokenizer satz token)
  (define (token-iter satz token current result)
    (if (null? satz)
        (append result (cons (list->string current) '()))
        (if (eq? (car token) (car satz))
            (token-iter (cdr satz) token '() (append result (cons (list->string current) '())))
            (token-iter (cdr satz) token (append current (cons (car satz) '())) result)
            )
        )
    ) (token-iter (string->list satz) (string->list token) '() '())
  )

(tokenizer "Happy new year!" "e")
(tokenizer "eeeeeeeee" "e") ;XD

;Aufgabe 4
;(define (

;Portfolio 4
;Sommersemester
(define (machen . strings)
  (define (machen-iter strings currentword currentwordtemp currentchar charcounter result counter1)
    (if (null? strings)
        (list->string result)
        (if (= counter1 1)
            (machen-iter strings (string->list (car strings)) (string->list (car strings)) (car (string->list (car strings))) 0 result 0)
            (if (< (length currentwordtemp) 3)
                (machen-iter (cdr strings) currentword currentwordtemp currentchar 0 result 1)
                (if (= charcounter 3)
                    (if (or (eq? currentchar #\x) (eq? currentchar #\X))
                        (machen-iter (cdr strings) currentword currentwordtemp currentchar 0 (append result currentwordtemp) 1)
                        (machen-iter (cdr strings) currentword currentwordtemp currentchar 0 result 1)
                        )
                    (machen-iter strings (cdr currentword) currentwordtemp (car currentword) (+ charcounter 1) result 0)
                    )
                )
            )
        )
    ) (machen-iter strings '() '() '() 0 '() 1)
  )

(machen "x" "nixx" "xxx")
            
        