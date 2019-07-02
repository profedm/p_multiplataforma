import java.*;

public class Fuera
{
    private int x=1;

    public void HacerAlgo()
    {
        String nombre = "Variable Local";
        class Dentro
        {
            public void verFuera()
            {
                System.out.println("El valor de x es = "+x);
                System.out.println("Nombre: "+nombre);
            }
        }

        Dentro a = new Dentro();
        a.verFuera();
    }

    public static void main(String[] args) {
        Fuera p = new Fuera();
        p.HacerAlgo();
    }
}