import java.*;

public class Hola
{
    String mensaje;

    Hola(String ms)
    {
        this.mensaje=ms;
        System.out.println(this.mensaje);
    }
    protected void finalize() throws Throwable
    {
        System.out.println("Mis ultimas palabras son......");
        System.out.println(this.mensaje);
    }
    public static void main(String[] args)
    {
        String mensaje = "Hola a todos";
        Hola mio = new Hola(mensaje);
        mio=null;

        System.gc();
    }
}