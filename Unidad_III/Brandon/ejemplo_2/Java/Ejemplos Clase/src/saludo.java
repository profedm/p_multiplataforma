import java.*;

class Hola
{
    String mensaje;

    Hola(String ms)
    {
        this.mensaje=ms;
    }
}

public class saludo extends Hola
{
    String nombre;

    saludo(String ms,String name)
    {
        super(ms);

        this.nombre=name;
    }

    public void imprimir()
    {
        System.out.println(this.mensaje+" "+this.nombre);
    }

    public static void main(String[] args)
    {
        saludo hola = new saludo("Hola","Brandon");

        hola.imprimir();
    }
}