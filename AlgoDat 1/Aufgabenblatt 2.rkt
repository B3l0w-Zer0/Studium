#lang racket
;Aufgabe 1
(define (nat-wurzel x)
  (define (wurzel-iter summe zähler ergebnis)
    (if (= summe x) ergebnis
        (wurzel-iter (+ summe zähler) (+ zähler 2) (+ ergebnis 1)
   )
  )
 )
  (wurzel-iter 0 1 0)
)

;Aufgabe 2
(define (zahl-umdrehen x)
  (define (umdrehen-iter n result)
    (if (= n 0)
        result
        (umdrehen-iter (quotient n 10) (+ (* result 10) (remainder n 10)))))
  (umdrehen-iter x 0))


;Das result in der Prozedur umdrehen-iter ist eine Variable, die verwendet wird, um die umgedrehte Zahl schrittweise aufzubauen. Hier ist eine detaillierte Erklärung, wie result funktioniert:
;Initialisierung: Die Prozedur umdrehen-iter wird mit result gleich 0 gestartet. Das bedeutet, dass wir mit einer leeren Zahl beginnen.
;Rekursive Verarbeitung: In jeder Iteration der rekursiven Funktion wird die letzte Ziffer von n (durch remainder n 10 erhalten) zu result hinzugefügt. Gleichzeitig wird n durch 10 geteilt (durch quotient n 10), um die letzte Ziffer zu entfernen.
;Aufbau der umgedrehten Zahl: Die neue Ziffer wird zu result hinzugefügt, indem result mit 10 multipliziert und die Ziffer hinzugefügt wird. Dies verschiebt die Ziffern in result nach links und fügt die neue Ziffer an der rechten Seite hinzu.
;Hier ist ein Beispiel, um den Prozess zu veranschaulichen:

;Angenommen, x ist 123.
;In der ersten Iteration: n ist 123, result ist 0.
;remainder 123 10 ist 3, also wird result zu 0 * 10 + 3 = 3.
;quotient 123 10 ist 12, also wird n zu 12.
;In der zweiten Iteration: n ist 12, result ist 3.
;remainder 12 10 ist 2, also wird result zu 3 * 10 + 2 = 32.
;quotient 12 10 ist 1, also wird n zu 1.
;In der dritten Iteration: n ist 1, result ist 32.
;remainder 1 10 ist 1, also wird result zu 32 * 10 + 1 = 321.
;quotient 1 10 ist 0, also wird n zu 0.
;Wenn n schließlich 0 erreicht, ist result die umgedrehte Zahl 321.



;Aufgabe 3
;(define (aufsteigendes-produkt? a b c d)
 ; (if (> a b) (#f)
    ;  (if (> b c) (#f)
    ;   (if (> c d) (#f)
     ;   #t))))
      
(define (aufsteigendes-produkt? a b c d)
  (and (< a b c) (= (* a b c) d)))

;Aufgabe 4
(define (f1 a b)
  (and (or a b) (or a b) a b))

(define (f2 a b c)
  (and a (or a b c) (or a c)))

(define (f3 a b c d)
  (and (or a b) a b c (or a b c) (or d c b a)))