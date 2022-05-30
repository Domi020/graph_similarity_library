#Tool für metrikbasierte Graphvergleiche
Entwickelt von Dominik Sauerer im Rahmen einer Studienarbeit an der DHBW Stuttgart Campus Horb.

Implementierung des vorgeschlagenen Vergleichsalgorithmus in Java.

## Projektaufbau
`src`: Enthält den implementierten Vergleichsalgorithmus sowie zusätzliche JUnit-Tests für einzelne Komponenten des Algorithmus.
main-Ordner besteht wiederum aus folgenden Unterordnern:
- `components`: Die Komponenten des Algorithmus. Der Algorithmus selbst ist hier im Ordner `compare` zu finden.
- `tests`: Enthält die in der Studienarbeit durchgeführten Tests (ohne Performancetests).
- `performance`: Enthält die in der Studienarbeit durchgeführten Performancetests.

`res`: Output-Ordner für generierte Python-Skripte (z.B. zur Visualisierung von einzelnen Graphen)

`lib`: Enthält die benutzte Graphmetrik-Bibliothek von Benedict Weichselbaum als jar-Artefakt
