

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//
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
    
    @Test
    public void spiele_genre_schach_test()
    {
        Spiel schach;
        schach = new Spiel("Strategie Schach", 2, false);
        assertEquals ("Strategie", schach.getGenre());
        assertEquals ("Schach", schach.getTitel());
    }
    
    @Test
    public void spiele_genre_mincraft_test()
    {
        Spiel mincraft;
        mincraft = new Spiel("Action Minecraft", 8, true);
        assertEquals ("Action", mincraft.getGenre());
        assertEquals ("Minecraft", mincraft.getTitel());
    }
    
    @Test
    public void spiele_genre_mariokart_test()
    {
        Spiel mariokart;
        mariokart = new Spiel("Rennen MarioKart", 12, true);
        assertEquals ("Rennen MarioKart", mariokart.getGenre());
        assertEquals ("Rennen MarioKart", mariokart.getTitel());
    }
}