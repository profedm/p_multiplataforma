import java.util.*;
import java.lang.*;

public class Calcu
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        int salir = 1;
        float v1,v2,r;
        double r2 =0;
        while (salir != 0)
        {
        System.out.println ("Bienvenidos a la calcu buena");
        System.out.println ("Seleccione una operacion");
        System.out.println ("1.Suma");
        System.out.println ("2.Resta");
        System.out.println ("3. Multiplicacion");
        System.out.println ("4.Division");
        System.out.println ("5.Raiz");
        System.out.println ("0.Salir");

        int opc = input.nextInt();
        Operaciones obj = new Operaciones();

        switch (opc)
        {
             case 1:
                System.out.println("Inserte el valor 1");
                v1 = input.nextFloat();
                System.out.println("Inserte el valor 2");
                v2 = input.nextFloat();
                r = obj.Suma(v1,v2);
                System.out.println("El resultado es = " + r);
                break;
            case 2:
                System.out.println("Inserte el valor 1");
                v1 = input.nextFloat();
                System.out.println("Inserte el valor 2");
                v2 = input.nextFloat();
                r = obj.Resta(v1,v2);
                System.out.println("El resultado es = " + r);
                break;
            case 3:
                System.out.println("Inserte el valor 1");
                v1 = input.nextFloat();
                System.out.println("Inserte el valor 2");
                v2 = input.nextFloat();
                r = obj.Multiplicacion(v1,v2);
                System.out.println("El resultado es = " + r);
                break;
            case 4:
              System.out.println("Inserte el valor 1");
                v1 = input.nextFloat();
                System.out.println("Inserte el valor 2");
                v2 = input.nextFloat();
                r = obj.Division(v1,v2);
                System.out.println("El resultado es = " + r);
                break;
            case 5:
            System.out.println("Inserte el valor 1");
                 double v = input.nextInt();
                r2 = obj.Raiz(v);
                System.out.println("El resultado es = " + r2);
                break;
        }
        }

        

    


    }
}