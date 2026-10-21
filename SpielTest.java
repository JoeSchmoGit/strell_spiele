

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SpielTest
{
    @Test
    public void spieler_anzahl_minecraft_test()
    {
        Spiel minecraft;
        minecraft = new Spiel("Mincraft", 8, true);
        assertTrue (minecraft.getSpieler() > 1 && minecraft.getSpieler() < 100);
    }
    
    @Test
    public void spieler_anzahl_schach_test()
    {
        Spiel schach;
        schach = new Spiel("Schach", 2, true);
        assertTrue (schach.getSpieler() > 1 && schach.getSpieler() < 100);
    }
    
    @Test
    public void spieler_anzahl_fortnite_test()
    {
        Spiel fortnite;
        fortnite = new Spiel("Fortnite", 2, true);
        assertTrue (fortnite.getSpieler() > 1 && fortnite.getSpieler() < 100);
    }
}