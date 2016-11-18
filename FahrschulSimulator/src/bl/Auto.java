
package bl;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.Serializable;
import java.util.ArrayList;

public class Auto implements Serializable
{
    private ArrayList<Graphics2D> liste;
    private Color farbe;
    private int geschwindigkeit;
    private int typ;

    public ArrayList<Graphics2D> getListe()
    {
        return liste;
    }

    public Color getFarbe()
    {
        return farbe;
    }

    public int getGeschwindigkeit()
    {
        return geschwindigkeit;
    }

    public int getTyp()
    {
        return typ;
    }
    
    
}
