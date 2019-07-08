import java.util.*;

public class Circle
{
    public static void main(String arg[])
    {
        Circulo bolita = new Circulo ();
        Scanner input = new Scanner(System.in);

        System.out.println ("Ingresa el tamaño del circulo (Radio)");
        double radio = input.nextDouble();
        
        double Diametro = bolita.Diametro(radio);
        double Perimetro = bolita.Perimetro(Diametro);
        double Area = bolita.Area (radio);

        System.out.println("El Area del ciurculo es"+Area);
        System.out.println("El Perimetro del ciurculo es"+Perimetro);


    }

}