import java.io.*;
import java.util.*;

public class primos
{
    ArrayList<Integer> lista = new ArrayList<Integer>();
    ArrayList<Integer> aux = new ArrayList<Integer>();

    int limite;
    boolean primo;

    public primos()
    {

    }

    public void buscar(int a)
    {
        this.limite=a;
        int c=1;
        lista.add(2);

        for(int i=2;i<=this.limite;i++)
        {
            this.primo = true;
            for(int j = 0;j<lista.size();j++)
            {
                if(i%lista.get(j)==0)
                {
                    this.primo=false;
                    break;
                }
            }

            if(this.primo)
            {
                lista.add(i);
            }
        }
    }

    public void mostrar()
    {
        for(int i = 0;i<lista.size();i++)
        {
            System.out.println("Elemento de la lista: "+lista.get(i));
        }
        System.out.println("Fin de la lista");
    }
}