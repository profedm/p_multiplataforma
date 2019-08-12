import java.util.*;

class NumberFormat
{
    public static void main (String [] args)
    {
        try 
        {
            int num = Integer.parseInt ("Onamatopeya");
            System.out.println(num);

        }
        catch (NumberFormatException e)
        {
            System.out.println("Formato incorrecto");
            
        }
    }
}