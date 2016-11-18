/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Martin
 */
public class Init
{

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
        String path = "";

        BufferedReader br = new BufferedReader(new FileReader(path));

        String line;
        while ((line = br.readLine()) != null)
        {

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
