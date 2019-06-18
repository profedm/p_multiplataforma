import java.io.*;
import java.util.*;

public class arreglo
{
    ArrayList<Integer> lista = new ArrayList<Integer>();
    ListIterator iterador = lista.listIterator();
    Scanner leer = new Scanner(System.in);

    int tamano,actual,menor,mayor;

    public arreglo()
    {

    }

    public void crear(int t)
    {
        for(int i=0;i<t;i++)
        {
            System.out.println("Inserte el numero en la posicion "+(i+1));
            lista.add(leer.nextInt());
        }
        System.out.println("Lista cargada");
    }
    public void ordenar()
    {
        for(int j=0;j<lista.size();j++)
        {
            for(int i=j+1;i<lista.size();i++)
            {
                if(lista.get(i)<lista.get(j))
                {
                    this.menor=lista.get(j);
                    lista.set(j,lista.get(i));
                    lista.set(i,this.menor);
                }
            }
        }
        System.out.println("Lista ordenada");
    }
    public void mostrar()
    {
        
        for(int i =0;i<lista.size();i++)
        {
            System.out.println(lista.get(i));
        }

    }
}