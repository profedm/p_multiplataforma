import java.util.*;

public class book
{
    public static void main(String[] args) 
    {
        float m1,m2,m3,m4,m5;
        int mi1,mi2,mi3;
        float rm;
        int rim;
        int menu,init=1;
        double rmd;

        calculadora calcu = new calculadora();

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
        System.out.println("---Factorial presione 5---");
        System.out.println("---Mayor numero presione 6---");
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
                rm = calcu.Suma(m1, m2);
                System.out.println("El resultado es = " + rm);
                init = 0;
                break;
            case 2:
                System.out.println("Inserte el valor 1");
                m1 = leer.nextFloat();
                System.out.println("Inserte el valor 2");
                m2 = leer.nextFloat();
                rm = calcu.Resta(m1, m2);
                System.out.println("El resultado es = " + rm);
                init = 0;
                break;
            case 3:
                System.out.println("Inserte el valor 1");
                m1 = leer.nextFloat();
                System.out.println("Inserte el valor 2");
                m2 = leer.nextFloat();
                rm = calcu.Multi(m1, m2);
                System.out.println("El resultado es = " + rm);
                init = 0;
                break;
            case 4:
                System.out.println("Inserte el valor 1");
                m1 = leer.nextFloat();
                System.out.println("Inserte el valor 2");
                m2 = leer.nextFloat();
                rm = calcu.Divi(m1, m2);
                System.out.println("El resultado es = " + rm);
                init = 0;
                break;
            case 5:
                System.out.println("Inserte el valor 1");
                mi1 = leer.nextInt();
                rim=calcu.facto(mi1);
                System.out.println("El resultado es = " + rim);
                init = 0;
                break;
            case 6:
                System.out.println("Inserte el valor 1");
                mi1 = leer.nextInt();
                System.out.println("Inserte el valor 2");
                mi2 = leer.nextInt();
                System.out.println("Inserte el valor 3");
                mi3 = leer.nextInt();
                calcu.mayor(mi1,mi2,mi3);
                init = 0;
                break;
            case 7:
                System.out.println("Cuantos valores son: ");
                mi1=leer.nextInt();
                rm=calcu.promedio(mi1);
                System.out.println("El primedio es = "+rm);
                init=0;
                break;
            case 8:
                System.out.println("Cuantos valores son?");
                mi1=leer.nextInt();
                rmd=calcu.desviacion(mi1);
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