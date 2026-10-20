
public class Spiel
{
    private String titel;
    private int spieler;
    private boolean online;
    
    public void Spiel()
    {
        setTitel("UNKN");
        setSpieler(0);
        setOnline(false);
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
}