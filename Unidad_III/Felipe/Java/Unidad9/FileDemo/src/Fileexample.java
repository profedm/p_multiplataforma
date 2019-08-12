import java.io.*;
import java.util.*;
class Fileexample
{
    public static void main (String [] args)
    {
        try
        {
        File file = new File ("file.txt");
        FileReader fr = new FileReader (file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Archivo no encontrado");
        }
    }
}