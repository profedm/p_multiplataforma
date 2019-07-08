import java.*;
import java.util.Scanner;

public class Circulo
{
    float radio,area,perimetro;
    public static final float pi=3.14159f;

    public Circulo()
    {

    }

    public Circulo(float r)
    {
        this.radio=r;
    }

    public void Carea()
    {
        this.area=(pi*(this.radio* this.radio));
        System.out.println("El area del circulo es = "+this.area);
    }
    public void Cperi()
    {
        this.perimetro=(2* this.radio*pi);
        System.out.println("El perimetro del circulo es = "+this.perimetro);
    }
    public static void main(String[] args)
    {
        Scanner leer = new Scanner(System.in);
        float r;

        System.out.println("Escribe el radio del circulo");
        r=leer.nextFloat();
        Circulo c1 = new Circulo(r);

        c1.Cperi();
        c1.Carea();
    }
}