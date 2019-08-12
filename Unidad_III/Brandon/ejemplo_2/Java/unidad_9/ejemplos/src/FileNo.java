import java.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;

public class FileNo
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("file.txt");
            FileReader fr = new FileReader(f);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Archivo no encontrado...");
        }
    }
}