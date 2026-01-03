|Gute Messages|Schlechte Messages|
|-|-|
|Add login validation|Update|
|Refactor Calculator for readability|Fix bug|
|Remove unused imports|stuff|
|Improve performance|Changes in app|
|Fix issue #23|final version|
|Add null check|Refactor code|
|Cleanup|Update Calculator|
|Handle edge cases|Small fixes|
|Rename variables|Adjust logic|
|Improve readability|Temporary fix|

**Cleanup** referenziert zwar keine konkreten Dateien, nachdem es sich aber nur um kleine Änderungen handelt, die den Code übersichtlicher machen, ist das kein Problem.

**Fix issue #23** ist, solange die *issues* alle klar dokumentiert worden sind, eindeutig und nachvollziehbar.

**Rename variables** ist wie *Cleanup* nur eine Änderung, die den Code oberflächlich veändert.


**Adjust logic** sollte anführen, welche Logik angepasst wurde, aber auch wie sie angepasst wurde. Es müsste nur eine einzige wirkliche Berechnung geben, die leicht angepasst wurde, damit diese Message Sinn macht. Wenn die Änderung beispielsweise die Berechnung von Summen in *Calculator* betrifft, könnte man spezifizieren: z.B. **Adjust summation logic**

**Temporary fix** bezieht sich auf keine konkrete Datei, was wahrscheinlich auch in Ordnung wäre, wenn es in einer eigenen Branch auftritt, aber im Normalfall sollte klar die Datei und/oder das Feature spezifiziert werden: z.B. **Temporary fix for login**

**Changes in app** könnte sich auf so ziemlich jedes Feature in der App beziehen. Außerdem wäre es besser, wenn die Message mit einem Verb beginnt, das zumindest ein bisschen genauer beschreibt, welche Art von Änderung passiert ist: z.B. **Fix start button**

**Refactor code** gibt weder an, welcher Code geändert wurde, noch, auf welche Weise er geändert wurde. Das sollte klarer spezifiziert werden: z.B. **Add exception handling**


**Regeln für Projektarbeit**

**1. Beginne mit einem Verb**

**2. Erster Buchstabe ist immer groß**

**3. Sprache: Englisch**

**4. Das Verb ist im Präsens**

**5. Mindestens zwei Wörter pro Message**