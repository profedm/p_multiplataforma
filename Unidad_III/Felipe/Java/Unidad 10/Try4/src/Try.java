import java.util.*;

class Try
{
    public static void main (String [] args)
    {
        try 
        {
            String a = "onomatopeya";
            char c = a.charAt(24);
            System.out.println(c);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Elemento inaccesible");
            
        }
    }
}