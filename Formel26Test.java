

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

public class Formel26Test
{
    //test 1,3,5
    @Test
    public void formel26_erster_test()
    {
        Formel26 test1;
        test1 = new Formel26();
        assertEquals(29, test1.berechne(1, 3, 5));
    }
    
    //test 2,-1,3
    @Test
    public void formel26_zweiter_test()
    {
        Formel26 test2;
        test2 = new Formel26();
        assertEquals(19, test2.berechne(2, -1, 3));
    }
    
    
    
    //test von ChatGPT
    @Test
    public void testBerechneMitZweiParametern()
    {
        Formel26 f = new Formel26();

        assertEquals(9, f.berechne(1, 3));
        assertEquals(11, f.berechne(5, 2));
        assertEquals(5, f.berechne(2, -1));
    }

    @Test
    public void testBerechneMitDreiParametern()
    {
        Formel26 f = new Formel26();

        assertEquals(29, f.berechne(1, 3, 5));
        assertEquals(19, f.berechne(2, -1, 3));
    }
    
}