import java.util.*;
import java.util.Scanner;

public class Intento
{
    public static void main(String[] args)
    {
        int num1,num2;
        float num3;

        Scanner leer = new Scanner(System.in);

        try
        {
            num1 = leer.nextInt();
            num2 = leer.nextInt();

            num3 = num1/num2;
            System.out.println(num1 + " / " + num2 + " = " + num3);
        }
        catch(ArithmeticException e)
        {
            System.out.println("La division entre cero no es posible");
        }
        catch(Exception ex)
        {
            System.out.println("Existen Errores");
        }
    }
}