import java.*;

public class Nest
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                System.out.println("En bloque 1");
                int b = 45/0;
                System.out.println(b);
            }
            catch(ArithmeticException e1)
            {
                System.out.println("Exception: e1");
            }
            try
            {
                System.out.println("En bloque 2");
                int b = 45/0;
                System.out.println(b);
            }
            catch(ArrayIndexOutOfBoundsException e2)
            {
                System.out.println("Exceotion: e2");
            }
        }
        catch(ArithmeticException e3)
        {
            System.out.println("Escepcion tipo Arithmetic");
            System.out.println("Catch Padre");
        }
        catch(ArrayIndexOutOfBoundsException e4)
        {
            System.out.println("Exceocion de limites");
            System.out.println("Catch Padre");
        }
        catch(Exception e5)
        {
            System.out.println("Excepcion");
            System.out.println("Catch Padre");
        }
    }
}