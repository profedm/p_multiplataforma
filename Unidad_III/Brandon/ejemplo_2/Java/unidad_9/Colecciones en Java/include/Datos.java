import java.util.*;
import java.time.*;

public class Datos
{
    Map<Integer,Integer> ma = new HashMap<Integer,Integer>();
    Scanner leer = new Scanner(System.in);
    LocalTime tiempo = LocalTime.now();
    int hora,min,seg;
    int valor;

    Map<Integer,Integer> ingreso()
    {
        this.hora=tiempo.getHour();
        this.min=tiempo.getMinute();
        this.seg=tiempo.getSecond();

        boolean n = false;
        int timeX;

        while(n==false)
        {
            System.out.println("Ingresa un numero: \n");
            tiempo = LocalTime.now();
            int min2 = tiempo.getMinute();
            int seg2 = tiempo.getSecond();
            valor = leer.nextInt();
            if(min2>this.min)
            {
                timeX=60-this.seg+seg2;
            }
            else
            {
                timeX=seg2-this.seg;
            }
            System.out.println(this.min + ":" + this.seg);
            System.out.println(min2 + ":" + seg2);
            System.out.println(timeX);

            if(timeX<15)
            {
                ma.put(timeX, valor);
            }
            else
            {
                n=true;
                break;
            }
        }
        return this.ma;
    }

    public static void main(String[] args)
    {
        Datos d = new Datos();

        Map<Integer,Integer> mapa = new HashMap<Integer,Integer>(d.ingreso());

        System.out.println(mapa+"\n \n");

        Set<Map.Entry<Integer, Integer>> st = mapa.entrySet();

        for (Map.Entry<Integer, Integer> me : st) {
            System.out.println("_____________");
            System.out.print("| "+me.getKey() + " | ");
            System.out.println(me.getValue()+" |");
        }
        System.out.println("_____________");
    }
}