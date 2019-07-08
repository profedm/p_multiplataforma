import java.*;
import java.util.Scanner;

public class Automovil extends Auto
{
    String Color,Marca,Modelo;

    public Automovil()
    {

    }

    public Automovil(String motor,String modelo,String color,String marca,int kilo)
    {
        this.motor=motor;
        this.Modelo=modelo;
        this.Color=color;
        this.Marca=marca;
        this.Kilometraje=kilo;
    }

    public void Pintar(String c)
    {
        this.Color=c;
        System.out.println("El color es: "+this.Color);
    }

    public void Modificar(String m)
    {
        this.Modelo=m;
        System.out.println("El modelo es: "+this.Modelo);
    }

    public void Tipo(String t)
    {
        this.motor=t;
        System.out.println("El motor del auto es: "+this.motor);
    }

    public void Mostrar()
    {
        System.out.println("Motor: "+this.motor);
        System.out.println("Modelo: "+this.Modelo);
        System.out.println("Color: "+this.Color);
        System.out.println("Marca: "+this.Marca);
        System.out.println("Kilometraje: "+this.Kilometraje);
    }

    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);

        String mot,mod,col,mar;
        int kilo;

        System.out.println("Ingrese el motor");
        mot = leer.next();
        System.out.println("Ingrese el modelo");
        mod = leer.next();
        System.out.println("Ingrse el color");
        col = leer.next();
        System.out.println("Ingrese la marca");
        mar = leer.next();
        System.out.println("Ingrese el kilometraje");
        kilo = leer.nextInt();

        Automovil obj = new Automovil(mot, mod, col, mar, kilo);

        obj.Mostrar();


        System.out.println("Cuanto corrio?");
        kilo = leer.nextInt();
        obj.Correr(kilo);

        System.out.println("Ingrese el nuevo color");
        col = leer.next();
        obj.Pintar(col);

        System.out.println("Ingrese el nuevo motor");
        mot = leer.next();
        obj.Tipo(mot);

        System.out.println("Ingrese el nuevo modelo;");
        mod = leer.next();
        obj.Modificar(mod);

        obj.Mostrar();


    }
}