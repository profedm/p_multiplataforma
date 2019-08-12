import java.util.*;

class Hello
{
    public static void main (String [] args)
    {
        int a =0;

        if(args.length > 0)
        {
            System.out.println("lista de argumentos");
            for (String val:args)
            {
                a=a+Integer.parseInt(val);
                System.out.println(a);
            }
        }
        else 
        System.out.println("Sin Argumentos");
    }
}