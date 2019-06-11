import java.io.*;
import java.util.*;

class arreglo
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(0,9);
        System.out.print(lista);

        ListIterator iterator = lista.listIterator();

        System.out.println("Elementos : ");
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();

        System.out.println("Elementos : ");
        while (iterator.hasPrevious())
            System.out.print(iterator.previous() + " ");
        System.out.println();
    }
}