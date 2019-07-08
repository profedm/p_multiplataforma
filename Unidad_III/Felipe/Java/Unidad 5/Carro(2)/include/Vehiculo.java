import java.*;

public class Vehiculo
{
    String motor;
    int Kilometraje;

    Vehiculo(String m,int k)
    {
        this.motor=m;
        this.Kilometraje=k;
    }

    public void Correr(int x)
    {
        this.Kilometraje=this.Kilometraje+x;
        System.out.println("El kilometraje es: "+this.Kilometraje);
    }

}