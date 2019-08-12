import java.util.*;

class Try2
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        int n,d;
        int a[]= new int [17];

        
        try 
        {
            System.out.println("Ingrese divisor");
            n = input.nextInt();
            System.out.println("Ingrese Posicion");
            d   = input.nextInt();

            a[d]= 30/n;
            System.out.println("Valor modificado:"+a[d]);
        }

        catch (ArithmeticException e)
        {
            System.out.println("Warning 1");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Warning 2");
        }

        catch (Exception e)
        {
            System.out.println("Warning 3");
        }
    }
}