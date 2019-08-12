import java.io.*;
public class ExecPath
{
    public static void main(String[] args) {
        try {
            File f = new File("C:/Users/brand/desktop");
            Process p = Runtime.getRuntime().exec("notepad archivo.txt",null,f);
            System.out.println("Editor de funcionamiento");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}