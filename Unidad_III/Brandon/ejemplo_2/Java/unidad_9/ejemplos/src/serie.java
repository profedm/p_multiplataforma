import java.io.*;

class Demo implements Serializable
{
    public int a;
    public String b;

    public Demo(int a,String b)
    {
        this.a=a;
        this.b=b;
    }
}

public class serie
{
    public static void main(String[] args) {
        Demo obj = new Demo(1, "Cuauhtemoc");
        String filename = "file.ser";

        try
        {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(obj);
            out.close();
            file.close();
            System.out.println("Objeto Serializado");
        }
        catch(IOException ex)
        {
            System.out.println("IO Exception");
        }
        Demo obj1 = null;
        try
        {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            obj1 = (Demo)in.readObject();
            in.close();
            file.close();
            System.out.println("Objeto Recuperado");
            System.out.println("ob.a: "+obj1.a);
            System.out.println("ob.b: "+obj1.b);
        }
        catch(IOException ex)
        {
            System.out.println("IO Exception");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Class Not Found Exception");
        }

    }
}