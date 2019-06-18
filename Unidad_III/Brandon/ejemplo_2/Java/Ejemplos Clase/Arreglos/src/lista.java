
import java.util.*;

public class lista 
{
    public static void main(String[] args) {
        int t;
        arreglo mio = new arreglo();

        Scanner leer = new Scanner(System.in);

        System.out.println("Inserte el numero de valores del arreglo");
        t=leer.nextInt();
        mio.crear(t);
        mio.mostrar();
        mio.ordenar();
        mio.mostrar();

    }
}