
public class Spiel
{
    private String titel;
    private int spieler;
    private boolean online;
    
    public Spiel(String neuTitel, int neuSpieler, boolean neuOnline)
    {
        setTitel(neuTitel);
        setSpieler(neuSpieler);
        setOnline(neuOnline);
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
    
    public void printSpiel()
    {
        System.out.println(titel + " Spiel: " + spieler + " Spieler - " + online);
    }
}