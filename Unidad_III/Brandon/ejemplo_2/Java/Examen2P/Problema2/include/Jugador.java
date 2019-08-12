import java.*;
import java.math.*;

public class Jugador extends Deportista
{
    String posicion;
    boolean estado=false;

    Jugador(String nombre,int edad,int salario,String nacionalidad,String posicion)
    {
        super(nombre,edad,salario,nacionalidad);

        this.posicion=posicion;
    }

    public void Info()
    {
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Salario: "+this.salario);
        System.out.println("Nacionalidad: "+this.nacionalidad);
        System.out.println("Posicion: "+this.posicion);
    }
    public void Iniciar()
    {
        this.estado=true;
        System.out.println("El jugador " + this.nombre + " tiene el balon");
    }
    public void Pasar(Jugador ob)
    {
        this.estado=false;
        ob.estado=true;
        System.out.println("El jugador " + this.nombre + " pasa el balon a " + ob.nombre);
    }
    public void Tirar()
    {
        double t = Math.random();

        if(t>0.5)
        {
            System.out.println("GOOOOOOOOOOOL!!!!!");
        }
        else
        {
            System.out.println("Fallo :(");
        }
    }
}