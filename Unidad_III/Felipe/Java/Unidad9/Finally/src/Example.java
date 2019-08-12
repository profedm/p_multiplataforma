import java.util.*;

class Example
{
    public static void main ( String [] args)
    {
        try
        {
            int num=121/0;
            System.out.println(num);
        }
        catch(ArithmeticException e)
        {
            System.out.println ("division por cero");
        }
        finally
        {
            System.out.println ("fin de evaluacion");
        }
    }
}