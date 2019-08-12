import java.util.*;
public class Queueejemplo 
{
    public static void main (String[] args)
    {
        //crear el areglo Queue
        Queue<Integer> q = new LinkedList<Integer>();

        //ingresar valores
        for (int i=0; i<5; i++)
        {
            q.add(i);
        }

        //Mostrar elementos
        System.out.println ("Elementos:"+ q);

        //Eliminar primer elemento 
        int removedele= q.remove();
        System.out.println ("Eliminado: "+ removedele);
        System.out.println("Elementos: "+q);

        //mirar cabecera
        int head = q.peek();
        System.out.println("Cabecera: "+head);

        //Dimension final
        System.out.println("Dimension final: "+ q.size());
    }
}