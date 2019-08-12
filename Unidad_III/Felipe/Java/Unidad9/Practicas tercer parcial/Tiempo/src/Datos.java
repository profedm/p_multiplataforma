import java.util.*;
import java.time.*;

public class Datos
{
    public void ingresar()
    {
        Map <Integer,Integer> table = new HashMap<Integer,Integer>();

        LocalTime tiempo =  LocalTime.now();
         Scanner input = new Scanner (System.in);

        int minutos1 =  tiempo.getMinute();
        int segundo1 = tiempo.getSecond();
        int tiem =0;
        boolean condicion = true;
        while (condicion == true)
        {
            tiempo =  LocalTime.now();
            int minutos2 = tiempo.getMinute();
            int segundo2 = tiempo.getSecond();
            if (minutos2>minutos1)
                 tiem = 60-segundo1+segundo2;
            else
                
                tiem = segundo2- segundo1;
                
            System.out.println ("Ingrese el valor que desee:");
            int valor = input.nextInt();
            table.put(tiem,valor);
            if (tiem > 15)
                condicion = false;
        }
         Set <Map.Entry <Integer,Integer>> st =  table.entrySet();
        

        for (Map.Entry <Integer,Integer> me:st)
        {
            System.out.println(me.getKey()+":"+me.getValue());
           
        }
    }

       public static void main (String[]args)
         {
             Datos obj = new Datos ();

             obj.ingresar();
         }
}