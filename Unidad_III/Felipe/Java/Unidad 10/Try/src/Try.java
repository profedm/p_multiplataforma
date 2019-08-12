import java.util.*;

class Try
{
    public static void main (String[] args)
    {
        int num1, num2;
        float num3;

        Scanner input = new Scanner (System.in);

        try 
        {
            num1 = input.nextInt();
            num2 = input.nextInt();

            num3 = num1/num2;
            System.out.println(num1+"/"+num2+"="+num3);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division por 0 no existe");
        }
        catch (RuntimeException e)
        {
            System.out.println ("Errores encontrados");

        }
    }
}