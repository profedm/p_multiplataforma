import java.*;

public class Ejemplo
{
    public static void main(String[] args)
    {
        try
        {
            int num = 121/0;
            System.out.println("num");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division por cero");
        }
        finally
        {
            System.out.println("Fin de Evaluacion");
        }
    }
}