

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SpielTest
{
    @Test
    public void spieler_anzahl_test()
    {
        Spiel minecraft;
        minecraft = new Spiel("Mincraft", 7, true);
        assertTrue (minecraft.getSpieler() >= 1 && minecraft.getSpieler() <= 100);
    }
    
}