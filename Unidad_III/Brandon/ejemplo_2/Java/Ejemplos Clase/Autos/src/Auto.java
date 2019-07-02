import java.*;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Auto extends Vehiculo
{
    String color,modelo;

    Auto(String mot,int k,String c,String mod)
    {
        super(mot,k);

        this.color=c;
        this.modelo=mod;
    }

    public void Pintar(String c)
    {
        System.out.println("El color actual es: "+this.color);
        this.color=c;
        System.out.println("El color actual es: "+this.color);
    }
    public void Modificar(String mod)
    {
        System.out.println("El modelo actual es: " + this.modelo);
        this.modelo = mod;
        System.out.println("El modelo actual es: " + this.modelo);
    }
    protected void finalize() throws Throwable
    {
        System.out.println("El Auto a fue destruido");
        System.out.println("    ___     ___    ");
        System.out.println("     |       |     ");
        System.out.println("     |       |     ");
        System.out.println("                   ");
        System.out.println("     _________     ");
        System.out.println("    (         )    ");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Motor: "+this.motor);
        System.out.println("Color: "+this.color);
        System.out.println("Kilometraje: "+this.Kilometraje);
    }

    public static void main(String[] args)
    {
        String mot,c,mod;
        int k;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tipo de motor");
        mot=leer.next();
        System.out.println("Ingrese el kilometraje");
        k = leer.nextInt();
        System.out.println("Ingrese el color");
        c = leer.next();
        System.out.println("Ingrese el modelo");
        mod = leer.next();

        Auto carro = new Auto(mot,k,c,mod);

        System.out.println("Ingrese cuanto se movio");
        k = leer.nextInt();
        carro.Correr(k);

        System.out.println("Ingrese el nuevo modelo");
        mod = leer.next();
        carro.Modificar(mod);

        System.out.println("Ingrese el nuevo color");
        c = leer.next();
        carro.Pintar(c);

        carro=null;

        System.gc();

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}