import java.io.File;

class fileproperty
{
    public static void main (String [] args)
    {
        String fname = args[0];

        File f = new File(fname);
        try
        {
            f.createNewFile();
        }
        catch (Exception e)
        {
            System.out.println ("Ni existe");
        }
        

        System.out.println("Nombre:" +f.getName());
        System.out.println("Direccion:" +f.getPath());
        System.out.println("D.Real:" +f.getAbsolutePath());
        System.out.println("Parient:" +f.getParent());
        System.out.println("Existencia:" +f.exists());
        if (f.exists())
        {
            System.out.println("Modificable?:" +f.canWrite());
            System.out.println("Legible:" +f.canRead());
            System.out.println("Directorio?:" +f.isDirectory());
            System.out.println("Archivo?:" +f.isFile());
            System.out.println("tam.Bytes:" +f.length());

        }
        

    }
}