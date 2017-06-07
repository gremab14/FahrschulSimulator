
package bl;

import java.io.Serializable;

public class Antwort implements Serializable
{
    private String antwort;
    private boolean isRichtig;

    public Antwort(String antwort, boolean isRichtig)
    {
        this.antwort = antwort;
        this.isRichtig = isRichtig;
    }

    public String getAntwort()
    {
        return antwort;
    }

    public boolean isIsRichtig()
    {
        return isRichtig;
    }
    
    
}
