import java.util.*;

class Nest
{
    public static void main (String [] args)
    {
        try
        {
            try
            {
            System.out.println("Bloque 1");
            int b = 45/0;
            }
            catch(ArithmeticException el)
            {
                System.out.println("Exception: el");
            }
            try 
            {
                System.out.println("Bloque 2");
                int b = 45/0;
                System.out.println (b);

            }
            catch (ArrayIndexOutOfBoundsException e2)
            {
                System.out.println("Exception2");
            }
        }
        catch (ArithmeticException e3)
        {
            System.out.println ("Exception Aritmetica");
            System.out.println ("Catch padre");
        }
        catch ( ArrayIndexOutOfBoundsException e4)
        {
            System.out.println ("Exception limites");
            System.out.println ("Catch padre");
        }
        catch (Exception e5)
        {
            System.out.println("Exception");
            System.out.println("Catch padre");
            
        }
    }
}