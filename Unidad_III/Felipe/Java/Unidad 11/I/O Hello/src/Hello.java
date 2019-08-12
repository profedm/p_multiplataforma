import java.util.*;

class Hello
{
    public static void main (String [] args)
    {
        if (args.length > 0)
        {
            System.out.println ("Lista de argumentos");

        

        for (String val:args)
        {
            System.out.println(val);
        }
        }
        else
        System.out.println("Sin Argumentos");
    }
}