import java.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.lang.model.util.ElementScanner6;

import java.math.*;

public class Cabra
{
    int numero;
    double peso,leche,lpork,Tpeso, Tleche;
    
    public Cabra(int numero,double peso,double leche)
    {
        this.numero=numero;
        this.peso=peso;
        this.leche=leche;
        this.lpork=leche/peso;
    }

    public String Mostrar()
    {
        String valor = "Numero: "+this.numero + "\n"+"Peso: "+this.peso+"\n"+"Leche por dia: "+this.leche+"Litros/Kilo"+this.lpork;
        return valor;
    }

    public ArrayList<Integer> cabrasSelect(double camion,int ncabras)
    {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        double TotalP=0,TotalL=0;
        for(int i=0;i<=10;i++)
        {
            double random = Math.random() * ncabras;
            System.out.println(random);

        }

        
        return valores;
    }

    public ArrayList<Integer> valorRandom(double camion,int ncabras, ArrayList<Cabra> establo)
    {
        
        ArrayList<Integer> mejorvalor = new ArrayList<Integer>();
        ArrayList<Cabra> optimo = new ArrayList<Cabra>(establo);
        double TotalP = 0, TotalL = 0;
        double pActual=0,lActual=0;
        double maxima=0;
        double max=0;
        for (int i = 0; i <= 100000; i++) {
            TotalL=0;
            TotalP=0;
            ArrayList<Integer> valores = new ArrayList<Integer>();
            int aleatorio = new Random().nextInt(ncabras);
            pActual = optimo.get(aleatorio).peso;
            lActual = optimo.get(aleatorio).leche;
            TotalP = TotalP + pActual;
            TotalL = TotalL + lActual;
            valores.add(aleatorio);
            //System.out.println("aletorio: " + aleatorio);
            boolean verificar=true;
            while(TotalP<=camion)
            {
                while(verificar==true)
                {
                    aleatorio = new Random().nextInt(ncabras);
                    if(valores.contains(aleatorio))
                    {
                        continue;
                    }
                    else{
                        verificar=false;
                    }
                }
                /*while(verificar==true)
                {
                    aleatorio = new Random().nextInt(ncabras);
                        if (hash_Set.contains(aleatorio)) {
                            System.out.println(hash_Set);
                            break;
                        }
                        else{
                            verificar=false;
                        }
                }*/
                pActual = optimo.get(aleatorio).peso;
                lActual = optimo.get(aleatorio).leche;
                if((TotalP+pActual)<camion)
                {
                    TotalP=TotalP+pActual;
                    TotalL=TotalL+lActual;
                    valores.add(aleatorio);
                    verificar=true;
                }
                else{
                    break;

                }
            }

            if(TotalL>maxima)
            {
                maxima=TotalL;
                max=TotalP;
                mejorvalor=valores;
                System.out.println("iteracion numero: " + i);
                System.out.println("Maximo: " + maxima + "mejor valor: " + mejorvalor + "Peso: " + TotalP);
                continue;
            }

            
        }

            System.out.println("Maximo: " + maxima + "mejor valor: " + mejorvalor + "Peso: " + max+"\n \n \n \n");
            this.Tpeso=max;
            this.Tleche=maxima;
            return mejorvalor;

    }

    public static void main(String[] args)
    {
        ArrayList<Cabra> establo = new ArrayList<Cabra>();
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        int ncabras=0;
        double pesoC=0;
        Scanner l = new Scanner(System.in);
        ncabras=6;
        pesoC=900;
        System.out.println("Ingrese cuantas cabras");
        ncabras=l.nextInt();
        System.out.println("Ingrese peso del camion");
        pesoC = l.nextDouble();
        for(int i=0;i<ncabras;i++)
        {
            System.out.println("Ingrese el peso");
            double peso = l.nextDouble();
            System.out.println("Ingrese produccion de leche por dia");
            double leche = l.nextDouble();
            establo.add(new Cabra(i+1,peso,leche));
        }
        /*
        Cabra c1 = new Cabra(1, 360, 40);
        Cabra c2 = new Cabra(2, 250, 35);
        Cabra c3 = new Cabra(3, 400, 43);
        Cabra c4 = new Cabra(4, 180, 28);
        Cabra c5 = new Cabra(5, 50, 12);
        Cabra c6 = new Cabra(6, 90, 13);

        establo.add(c1);
        establo.add(c2);
        establo.add(c3);
        establo.add(c4);
        establo.add(c5);
        establo.add(c6);*/


        for(int i=0;i<ncabras;i++)
        {
            System.out.println(establo.get(i).Mostrar());
        }

        ArrayList<Integer> lista = new ArrayList<Integer>(establo.get(0).valorRandom(pesoC,ncabras,establo));
        
        System.out.println(lista);

        for(int n=0;n<lista.size();n++)
        {
            System.out.println(establo.get(lista.get(n)).Mostrar());
        }
        System.out.println("Peso en camioneta = "+establo.get(0).Tpeso+"\nCantidad de leche = "+establo.get(0).Tleche);







    }
}