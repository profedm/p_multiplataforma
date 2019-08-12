import java.util.*;

public class Ordenado
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int Limit=4,i=0,suma=0;
        Set <Integer> arreglo = new TreeSet<Integer>();
         System.out.println("Ingrese los valores hasta que la suma de estos lleguen al limite");
        while ( suma <=Limit )
        {
            
             int valor = input.nextInt();
            arreglo.add(valor);
            //suma ++;
            suma = suma+valor;

        }
        System.out.println(arreglo);
        System.out.println(suma);

    }
}