

public class Formel26
{
    public int berechne(int x, int y)
    {
        int z = 3 * (x + y) - x * y;
        return z;
    }

    public int berechne(int a, int b, int c)
    {
        int e = berechne(a, b)
              + berechne(c, 2)
              + berechne(b, a);
        return e;
    }
}


/*
Erstellen Sie die Klasse Formel26.

Die Methode berechne ermittelt das Ergebnis folgender Formel:

z = 3*(x + y) - x*y;
Copy
Das Ergebnis z soll zurückgegeben werden.

Die Methode berechne mit drei Parametern ermittelt die Summe:

e = berechne(a, b) + berechne(c, 2) + berechne(b, a);
Copy
Das Ergebnis e soll zurückgegeben werden.

Ermitteln Sie am Zettel! Welches Ergebnis liefern die Aufrufe?

berechne(1, 3, 5)
berechne(2, -1, 3)
Verwenden Sie den Debugger zum schrittweisen Durcharbeiten des Programms!
*/