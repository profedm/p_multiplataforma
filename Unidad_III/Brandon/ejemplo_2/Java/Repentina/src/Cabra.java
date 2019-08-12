import java.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cabra
{
    ArrayList<Integer> numero = new ArrayList<Integer>();
    ArrayList<Double> peso = new ArrayList<Double>();
    ArrayList<Double> leche = new ArrayList<Double>();
    ArrayList<Double> valorR = new ArrayList<Double>();

    Scanner leer = new Scanner(System.in);

    double pesoCamion = 0;

    public Cabra()
    {

    }

    public void Ingresar(int nCabras)
    {
        double value;
        int v;

        for(int i=0;i<nCabras;i++)
        {
            System.out.println("Ingresa peso");
            numero.add(i,i+1);
            value = leer.nextDouble();
            peso.add(i, value);
            System.out.println("Ingresa produccion de leche por dia");
            value = leer.nextDouble();
            leche.add(i,value);
            valorR.add(i,peso.get(i)/leche.get(i));
        }

        System.out.println(numero);
        System.out.println(peso);
        System.out.println(leche);
        System.out.println(valorR);
    }

    public Seleccion(double peso)
    {
        
    }


    public static void main(String[] args)
    {
        Cabra c = new Cabra();
        int nc;
        System.out.println("Cual es el numero cabras");
        nc = c.leer.nextInt();
        c.Ingresar(nc);

    }
}