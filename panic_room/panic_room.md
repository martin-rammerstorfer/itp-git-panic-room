# Panic Room

**Team:** Last Minute Recycling | Yionees Lacle, Adnan Muzaferovic, Martin Rammerstorfer

**Ziel:** Das Programm fehlerfrei machen


## Problem 1 | Tests sind rot

**Lösung:**

- "return a/0" in Zeile 10 mit "return a/b" ersetzen

- Test "divide_decimal_works" hinzufügen


## Problem 2 | schlechte Commit Message

**Commit Message:** Update

**Commit-ID:** 50da5b1caf09339b68ce5d4ace7368a7b99f013e

**Begründung:** Die Commit Message sagt nahezu nichts über die durchgeführten Änderungen aus. Man weiß nicht was wie geändert wurde.

**Alternative:** "Update divisor in divide method"


## Problem 3 | Repository aufräumen

**Datei:** debug.log

**Begründung:** Die Datei enthält keine Debug-Informationen, die relevant sein könnten und auch der Begriff "noisy log" weist darauf hin, dass die Datei nur unnötig Platz einnimmt.


## Problem 4 | Datei wiederherstellen

**Commit-ID:** a0bc0e2d05936e41434c38e2d2cf718c29a1ddc4

**Befehl:** git checkout a0bc0e -- docs/usage.md

**Lösungsweg:** Mit dem Command "git restore" die Datei "usage.md" wiederherstellen.

**Quelle:** https://stackoverflow.com/questions/6624036/restore-file-from-old-commit-in-git

**ANMERKUNG:** Ich weiß nicht warum, aber bei mir wird auf der Command Line "error: pathspec 'docs/usage.md' did not match any file(s) known to git" ausgegeben, weshalb ich diesen Schritt nicht durchführen konnte.


## Fazit

Wir haben gelernt, wie wir mit Git effektiv Probleme bzw. Bugs lösen und eine saubere Struktur aufbauen können.
