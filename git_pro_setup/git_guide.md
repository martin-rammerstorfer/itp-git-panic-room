# Git Guide

Dieser Guide umfasst alle wichtigen Regeln und Strategien, um Fehler vorzubeugen.

## Branch Strategie
### Branch-Benennung
Die folgenden Regelungen betreffen die Benennung von Branches:

**Hauptbranch:** "Main" (nicht umbenennen!)  
**Feature branches:** "feature-*TITLE*" (*TITLE* mit einem kurzen Titel ersetzen, welcher beschreibt, woran in dem jeweiligen Branch gearbeitet wird). Beispiel: "feature-hauptseite"

### Arbeiten mit Branches

Die folgenden Regeln betreffen das arbeiten mit Branches:  
- Nicht am main-Branch arbeiten.
- Für jedes neue Feature bzw. für Bug fixes einen neuen Branch anlegen, um Verwirrungen zu verhindern.
- Das Löschen eines Branches davor klar mit den anderen Teammitgliedern kommunizieren, um Fehler zu verhindern.
- Branches nur wenn nötig löschen, um Wiederherstellungen ermöglichen zu können.

## Commit & Merge
### Regelwerk

Die folgenden Regeln betreffen Commits und Merges:
- Ein Commit muss mindestens eine Änderung beinhalten
- Jeder Commit muss eine Commit Message haben
- Die Commit Message muss kurz klar ausdrücken, welche Änderungen wo unternommen wurden.
- Commit Messages müssen mindestens 2 Wörter lang sein.
- Commit Messages dürfen keine Wörter wie z.B. Stuff, Update usw. beinhalten.

### Merge Regel

Grundsätzlich werden Konflikte vom Teamleader verwaltet. Jede Person sollte trotzdem versuchen, Konflikte (wenn möglich) zu vermeiden. 

Vor dem Commit bzw. Merge sollte immer auf Fehler geprüft werden. Falls Fehler enthalten sind, sollten sie entweder ausgebessert werden oder vor dem Merge mit den anderen Teammitgliedern kommuniziert werden.