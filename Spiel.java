
public class Spiel
{
    private String titel;
    private boolean online;
    private boolean mehrspieler;
    private int spieler;
    private int preis;
    
    
    public Spiel(String neuTitel, int neuSpieler, boolean neuOnline)
    {
        setTitel(neuTitel);
        setSpieler(neuSpieler);
        setOnline(neuOnline);
        
    }
    
    public Spiel(String neuTitel, boolean neuOnline, boolean neuMehrspieler, int neuSpieler, int neuPreis)
    {
        setTitel(neuTitel);
        setOnline(neuOnline);
        setMehrspieler(neuMehrspieler);
        setSpieler(neuSpieler);
        setPreis(neuPreis);
    }
    
    public Spiel(String neuTitel, boolean neuOnline, int neuSpieler)
    {
        setTitel(neuTitel);
        setOnline(neuOnline);
        setSpieler(neuSpieler);
    }
    
    public Spiel(String neuTitel, boolean neuOnline)
    {
        setTitel(neuTitel);
        setOnline(neuOnline);
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
        setTitel(neuTitel);
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
    
    public void setTitel(String neuTitel)
    {
        titel = neuTitel;
    }
    
    public void setSpieler(int neuSpieler)
    {
        spieler = neuSpieler;
    }
    
    public void setOnline(boolean neuOnline)
    {
        online = neuOnline;
    }
    
    public void setMehrspieler(boolean neuMehrspieler)
    {
        mehrspieler = neuMehrspieler;
    }
    
    public void setPreis(int neuPreis)
    {
        preis = neuPreis;
    }
    
    public void printSpiel()
    {
        System.out.println(titel + " Spiel: " + spieler + " Spieler - " + online);
    }
}