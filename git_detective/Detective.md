# 🕵️ Git Detective – Ermittlungsprotokoll

Ausgearbeitet von: Martin Rammerstorfer

## #1 -  Überblick über die Git-History
"Update" und "update more" fallen sehr negativ auf, da diese überhaupt nichts darüber aussagen, welche Änderungen woran vorgenommen wurden

## #2 - Ab welchem Commit ist das Projekt nicht mehr stabil?

50da5b1caf09339b68ce5d4ace7368a7b99f013e; "Update"; mit dem Befehl "git show 50da" kann werden die Änderungen im Commit angezeigt und man sieht, dass die Variable a nicht mehr durch b, sondern durch 0 dividiert wird, was eine ungültige Operation ist

## #3 - Welche Datei wurde dabei verändert?

Calculator.java und CalculatorText.java wurden in Directories verschoben, Calculator.java wurde zusätzlich umgeschrieben; das lässt sich mit demselben Befehl herausfinden wie oben, da bei der Ausgabe auch die Namen der veränderten Dateien dabei sind

## #4 - Wer hat die entscheidende Stelle verändert?

In der Ausgabe von "git show" steht außerdem, dass der relevante Commit von Natascha Rammelmüller durchgeführt worden ist

## #5: Vergleich vor und nach der Änderung

Vor der Änderung hat die Mathode divide(int a, int b) den Inhalt "return a / b", nach der Änderung wurde der Kommentar "// BUG: falscher Divisor -> Division durch 0" hinzugefügt und der Inhalt der Methode ist "return a / 0"
