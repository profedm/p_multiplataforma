import utilidades.*;
import java.util.*;

public class practica
{
     public static void main(String arg[])
     {
         estadisticas estadistica = new estadisticas();
         calculadora calcu = new calculadora();
         Scanner input = new Scanner(System.in);

         System.out.println("Ingrese cuantos valores se van a calcular para el arreglo");
          int c = input.nextInt();

          estadistica.llenar(c);
          System.out.println("inserte el primer valor");
          float f = input.nextFloat();
          System.out.println("inserte el segundo valor");
          float e = input.nextFloat();
          calcu.calculadora(f,e);
     }
}