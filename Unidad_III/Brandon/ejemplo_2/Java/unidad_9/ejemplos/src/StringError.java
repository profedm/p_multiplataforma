import java.*;

public class StringError
{
    public static void main(String[] args)
    {
        try
        {
            String a = "Onomatopeya";
            char c = a.charAt(20);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Elemento no existe");
        }
    }
}