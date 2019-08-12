import java.io.*;

public class Contents
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Directorio raiz");
        String dirpath=br.readLine();
        System.out.println("Nombre del directorio");
        String dname=br.readLine();

        File f = new File (dirpath,dname);
        
        if(f.exists())
        {
            String arr[]=f.list();
            int n=arr.length;

            for(int i = 0; i < n ;i++)
            {
                System.out.println(arr[i]);
                File f1 = new File(arr[i]);
                if(f1.isFile())
                    System.out.println(": Archivo");
                if(f1.isDirectory())
                    System.out.println(": Directorio");
            }
            System.out.println("Numero de elementos: "+n);
        }
        else
            System.out.println("Directorio no encontrado");
    }
}