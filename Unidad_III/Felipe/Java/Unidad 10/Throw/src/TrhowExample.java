import java.util.*;
import java.lang.*;

public class TrhowExample
{
    static void verificar (int edad)
    {
        if (edad <18)
        {
            throw new ArithmeticException ("Menor de edad");
        }

        else 
        {
            System.out.println ("MAyor de edad");
        }
    }

    public static void main(String [] args)
    {
        verificar (10);
    }
}