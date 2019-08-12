import java.io.*;

public class archivo
{
    public static void main(String[] args) {
        String fname = args[0];

        File f = new File(fname);
        try
        {
            f.createNewFile();
        }
        catch(Exception ex)
        {
            System.out.println("No se puede crear");
        }

        System.out.println("Nombre: "+f.getName());
        System.out.println("Direccion: "+f.getPath());
        System.out.println("Absoluta: "+f.getAbsolutePath());
        System.out.println("Pariente: "+f.getParent());
        System.out.println("Existencia: "+f.exists());

        if(f.exists())
        {
            System.out.println("Modificable? "+f.canWrite());
            System.out.println("Legible? "+f.canRead());
            System.out.println("Directorio? "+f.isDirectory());
            System.out.println("Archivo? "+f.isFile());
            System.out.println("Tamano bytes: "+f.length());
        }
    }
}