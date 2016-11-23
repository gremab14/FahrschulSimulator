
package bl;

import java.awt.Image;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class Frage implements Serializable
{
    private String frage;
    private int nummer;
    private ArrayList<Antwort> antworten;
    private Image bild;
    private String pfadBild = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "imgs"+File.separator;
    
    private static int anzFragen = 0;

    public Frage(String frage, int nummer, ArrayList<Antwort> antworten, String pfadBild) 
    {
        this.frage = frage;
        this.nummer = nummer;
        this.antworten = antworten;
        
        this.pfadBild += pfadBild;
    }
    
    

    public String getFrage()
    {
        return frage;
    }

    public int getNummer()
    {
        return nummer;
    }

    public ArrayList<Antwort> getAntworten()
    {
        return antworten;
    }

    public Image getBild()
    {
        return bild;
    }

    public static int getAnzFragen()
    {
        return anzFragen;
    }

    public void setAntworten(ArrayList<Antwort> antworten) 
    {
        this.antworten = antworten;
    }

    @Override
    public String toString() {
        return "Frage{" + "frage=" + frage + ", nummer=" + nummer + ", antworten=" + antworten +  ", pfadBild=" + pfadBild + '}';
    }
    
    
}
