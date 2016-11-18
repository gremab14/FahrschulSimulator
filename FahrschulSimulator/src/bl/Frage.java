
package bl;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;

public class Frage implements Serializable
{
    private String frage;
    private int nummer;
    private ArrayList<Antwort> antworten;
    private Image bild;
    
    private static int anzFragen = 0;

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
    
    
}
