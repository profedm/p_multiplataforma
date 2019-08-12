import java.*;

public abstract class Deportista
{
    String nombre,nacionalidad;
    int edad,salario;

    Deportista(String nombre,int edad,int salario,String nacionalidad)
    {
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
        this.nacionalidad=nacionalidad;
    }

    abstract void Info();

}