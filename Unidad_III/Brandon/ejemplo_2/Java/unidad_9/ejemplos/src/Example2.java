import java.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2
{
    public static void main(String[] args)
    {
        
        
        Scanner leer = new Scanner(System.in);
        int n,d;
        int a[] = new int[7];
        try 
        {
        
            System.out.println("Ingrese divisor:");
            n = leer.nextInt();
            System.out.println("Ingrese posicion:");
            d = leer.nextInt();
            a[d]=30/n;
            System.out.println("Valor modificado: " + a[d]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Warning: Excepcion tipo 1");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Warning: Excepcion tipo 2");
        }
        catch(Exception e)
        {
            System.out.println("Warning: Excepcion tipo N");
        }
    }
}