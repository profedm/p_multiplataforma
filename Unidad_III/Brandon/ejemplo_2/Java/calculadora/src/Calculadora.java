import utilidades.*;
import java.util.*;
import java.lang.Math;
import javax.lang.model.util.ElementScanner6;

public class Calculadora
{
    public static void main(String[] args) {
        float m1,m2,m3,m4,m5;
        int mi1,mi2,mi3;
        float rm;
        int rim;
        int menu,init=1;
        double rmd;

        Operaciones op = new Operaciones();
        Estadistica es = new Estadistica();

        Scanner leer = new Scanner(System.in);
        init=0;
        while (init == 0) 
        {

        System.out.println("-----Calculadora-----");
        System.out.println("***Que operacion desea***");
        System.out.println("---Suma presione 1---");
        System.out.println("---Resta presione 2---");
        System.out.println("---Mutiplicacion precione 3---");
        System.out.println("---Division presione 4---");
        System.out.println("---Promedio pesione 7---");
        System.out.println("---Desviacion presione 8---");
        System.out.println("---Salir presione 0---");

        menu = leer.nextInt();

        
            switch (menu) {
            case 1:
                System.out.println("Inserte el valor 1");
                m1 = leer.nextFloat();
                System.out.println("Inserte el valor 2");
                m2 = leer.nextFloat();
                rm = op.Suma(m1, m2);
                System.out.println("El resultado es = " + rm);
                init = 0;
                break;
            case 2:
                System.out.println("Inserte el valor 1");
                m1 = leer.nextFloat();
                System.out.println("Inserte el valor 2");
                m2 = leer.nextFloat();
                rm = op.Resta(m1, m2);
                System.out.println("El resultado es = " + rm);
                init = 0;
                break;
            case 3:
                System.out.println("Inserte el valor 1");
                m1 = leer.nextFloat();
                System.out.println("Inserte el valor 2");
                m2 = leer.nextFloat();
                rm = op.Multi(m1, m2);
                System.out.println("El resultado es = " + rm);
                init = 0;
                break;
            case 4:
                System.out.println("Inserte el valor 1");
                m1 = leer.nextFloat();
                System.out.println("Inserte el valor 2");
                m2 = leer.nextFloat();
                rm = op.Divi(m1, m2);
                System.out.println("El resultado es = " + rm);
                init = 0;
                break;
            case 7:
                System.out.println("Cuantos valores son: ");
                mi1=leer.nextInt();
                rm=es.promedio(mi1);
                System.out.println("El primedio es = "+rm);
                init=0;
                break;
            case 8:
                System.out.println("Cuantos valores son?");
                mi1=leer.nextInt();
                rmd=es.desviacion(mi1);
                System.out.println("La desviacion es = "+rmd);
                init=0;
                break;
            case 0:
                System.out.println("---Saliendo.....------");
                init = 1;
                break;
            default:
                System.out.println("Inserte un valor valido");
                init = 0;
                break;

            }
        }

    }
}
