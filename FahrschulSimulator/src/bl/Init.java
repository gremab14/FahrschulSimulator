/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin
 */
public class Init
{
    
    private LinkedList<Frage> list = new LinkedList();
    

    public static void main(String[] args)
    {
        try
        {
            Init obj = new Init();
            obj.initAutos();
            obj.initFragen();
        } catch (Exception ex)
        {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void initAutos()
    {
        //Normales Auto:

        //Polizeiauto
        //Batmobil:
        //Panzer:
    }

    public void initFragen() throws Exception
    {
        String path = System.getProperty("user.dir")+File.separator+"src";
        
        BufferedReader br = new BufferedReader(new FileReader(path));
        Frage currentFrage;
        String line;
        while ((line = br.readLine()) != null)
        {
           String [] splitFrage = line.split(";");
           ArrayList<Antwort> antworten = null;
           if(splitFrage[0].equals("f"))
           {
               currentFrage = new Frage(splitFrage[1],Integer.parseInt(splitFrage[2]),antworten,splitFrage[3]);
               line = br.readLine();
               while(line.charAt(0) != 'f')
               {
                   String [] splitAntwort = line.split(";");
                   antworten.add(new Antwort(splitAntwort[1], (Integer.parseInt(splitAntwort[2])== 1)));
                   
               }
               for(Frage f: list)
               {
                   System.out.println("Fragen: "+f);
               }
               for(Antwort a: antworten)
               {
                   System.out.println("Antworten: "+a);
               }
               currentFrage.setAntworten(antworten);
               list.add(currentFrage);
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Falsche Datei angegeben");
           }
        }
    }

    public void serializeFrage(String path, ArrayList<Frage> liste) throws Exception
    {
        ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(path));
        for (Frage f: liste)
        {
            oOut.writeObject(f);
        }
        oOut.close();
    }
    
    public void serializeAuto(String path, ArrayList<Auto> liste) throws Exception
    {
        ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(path));
        for (Auto f: liste)
        {
            oOut.writeObject(f);
        }
        oOut.close();
    }
}
