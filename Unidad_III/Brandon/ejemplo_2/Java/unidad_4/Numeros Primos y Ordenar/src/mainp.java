import java.util.*;

public class mainp
{
    public static void main(String[] args) {
        int maximo;
        primos list = new primos();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el limite de la lista");
        maximo = leer.nextInt();
        list.buscar(maximo);
        list.mostrar();
    }
}