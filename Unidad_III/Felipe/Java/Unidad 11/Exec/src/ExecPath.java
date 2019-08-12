import java.util.*;
import java.io.*;

public class ExecPath
{
    public static void main (String [] args)
    
    {
        try
        {
        //Crear un archivo
        File f =new File("C:/Users/Felipe/Desktop");

        //Crear proceso sobre entorno de archivo
        Process process = Runtime.getRuntime().exec("notepad",null,f);
        System.out.println ("Editor en fucionamiento");
        }

    
    catch (Exception e)
    {
        e.printStackTrace();
    }
    }
}