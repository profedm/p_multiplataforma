import java.util.*;

public class Ordenado
{
    Set<Integer> or = new TreeSet<Integer>();
    public static final int limite=50;
    Scanner leer = new Scanner(System.in);

    Ordenado()
    {

    }

    public ArrayList<Integer> Ingresar (int lim)
    {

        int suma=0;
        int valor;

        do
        {
            System.out.println("Ingresa un entero");
            valor = leer.nextInt();
            this.or.add(valor);
            suma=suma+valor;
        }
        while(suma<=lim);

        ArrayList<Integer> arl = new ArrayList<Integer>(this.or);

        System.out.println("El valor de la suma es = " + suma);

        return arl;
    }

    public static void main(String[] args)
    {
        Ordenado obj = new Ordenado();

        ArrayList<Integer> arreglo = new ArrayList<Integer>();

        System.out.println("Ingrese su limite");
        int limit = obj.leer.nextInt();

        arreglo = obj.Ingresar(limit);

        System.out.println(arreglo);
    }
}