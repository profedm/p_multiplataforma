package utilidades;
import java.util.*;
import java.lang.Math;


public class estadisticas
{
    //Atributos
        float promedio;
        ArrayList<Integer> valores = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

    public void llenar (int c)
    {
        for (int i =0; i<c; i++)
        {
        System.out.println ("Ingresa Valores al arreglo");
        int v = input.nextInt();
        this.valores.add(v);
        }
        float contador=0;
        for (int j=0; j<this.valores.size(); j++)
        {
            contador += this.valores.get(j);
        }

        contador = contador/this.valores.size();
        this.promedio=contador;
         System.out.println ("El promedio es"+this.promedio);
            double acumulador=0;
         for (int l=0; l<this.valores.size(); l++)
         {
             acumulador += Math.pow((this.valores.get(l)-this.promedio),2);
         }
            acumulador = Math.sqrt(acumulador/this.valores.size());
            System.out.println("La desviacion estandar es"+ acumulador);
            

       
    }
}