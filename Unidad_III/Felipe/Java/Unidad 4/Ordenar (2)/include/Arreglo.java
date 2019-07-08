import java.io.*;
import java.util.*;

public class Arreglo 
{
    
    //Atributos
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
    
    //costructor
    
    public void crear (int c)
    {
        for (int i=0; i<c; i++)
        {
            
            System.out.println ("Ingresa Valores al arreglo");
            int v = input.nextInt();
            this.enteros.add(v);
        }
        
        System.out.println (enteros);
    }
    
    
    public void ordenar ()
    {
        ListIterator<Integer> iterador = this.enteros.ListIterator<Integer>();
            ArrayList<Integer> aux = new ArrayList<Integer>();
        aux.add( iterador.next());
        
        for (int i=1; i<this.enteros.size(); i++)
        {
            int a = iterador.next();
            for (int j=0; j<aux.size(); j++)
            {
                if (a<aux.get(j))
                {
                    aux.add(j,a);
                    break;
                }
                
                
            }
            
        }
        
        System.out.println (aux);
        
    }
    
        
}