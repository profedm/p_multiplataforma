import java.*;

public abstract class Auto implements Vehiculo
{
    public String motor;
    public int Kilometraje;

    public abstract void Tipo(String t);

    public void Correr(int kilometros)
    {
        this.Kilometraje=this.Kilometraje+kilometros;
        System.out.println("El auto tiene: "+this.Kilometraje+" KM");
    }
}