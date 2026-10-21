
public class Spiel
{
    private String titel;
    private boolean online;
    private boolean mehrspieler;
    private int spieler;
    private int preis;
    
    
    public Spiel(String titel, int spieler, boolean online)
    {
        setTitel(titel);
        setSpieler(spieler);
        setOnline(online);
        
    }
    
    public Spiel(String titel, boolean online, boolean mehrspieler, int spieler, int preis)
    {
        setTitel(titel);
        setOnline(online);
        setMehrspieler(mehrspieler);
        setSpieler(spieler);
        setPreis(preis);
    }
    
    public Spiel(String titel, boolean online, int spieler)
    {
        setTitel(titel);
        setOnline(online);
        setSpieler(spieler);
    }
    
    public Spiel(String titel, boolean online)
    {
        setTitel(titel);
        setOnline(online);
    }
    
    /* Signatur bereits vorhanden
    public Spiel(String neuTitel, boolean neuMehrspieler, int Spieler)
    {
        setTitel(neuTitel);
        setMehrspieler(neuMehrspieler);
        setSpieler(neuSpieler);
    }
        
    public Spiel(String neuSpiel, int neuSpieler, boolean neuMehrspieler)
    {
        setTitel(neuTitel);
        setSpieler(neuSpieler);
        setMehrspieler(neuMehrspieler);
    }
    */
   
    public Spiel(String neuTitel)
    {
        setTitel(titel);
    }
    
    public String getTitel()
    {
        return titel;
    }
    
    public int getSpieler()
    {
        return spieler;
    }
    
    public boolean getOnline()
    {
        return online;
    }
    
    public boolean getMehrspieler()
    {
        return mehrspieler;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public void setTitel(String titel)
    {
        this.titel = titel;
    }
    
    /* wurde ersetzt
    public void setSpieler(int spieler)
    {
        this.spieler = spieler;
    }
    */
    public void setSpieler(int spieler)
    {
        if ((spieler > 1) && (spieler < 100))
        {
            this.spieler = spieler;
        }
        else
        {
            System.out.println("Fehler: Die Spieleranzahl muss zwischen 1 und 100 sein!");
            this.spieler = 1;
        }
    }
   
    public void setOnline(boolean online)
    {
        this.online = online;
    }
    
    public void setMehrspieler(boolean mehrspieler)
    {
        this.mehrspieler = mehrspieler;
    }
    
    public void setPreis(int preis)
    {
        this.preis = preis;
    }
    
    public void printSpiel()
    {
        if (online == true)
        {
            System.out.println(" Spiel:" + this.titel + " - " + this.spieler + " Spieler - " + "online");
        }
        else
        {
            System.out.println(" Spiel:" + this.titel + " - " + this.spieler + " Spieler - " + "offline");
        }
    }
    
}