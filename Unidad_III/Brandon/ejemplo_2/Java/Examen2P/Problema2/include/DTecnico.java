import java.*;

public class DTecnico extends Deportista
{
    DTecnico(String nombre,int edad,int salario,String nacionalidad)
    {
        super(nombre, edad, salario, nacionalidad);
    }

    public void Info()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Salario: " + this.salario);
        System.out.println("Nacionalidad: " + this.nacionalidad);
    }

    public void Dirigir(Jugador ob,String posicion)
    {
        ob.posicion=posicion;
    }
}