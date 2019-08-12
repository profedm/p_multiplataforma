import java.util.*;

public class Test
{
    public static void main (String[]args)
    {
        //Crear enteros
        ArrayList<Integer> al = new ArrayList();
        for(int i=0; i<10; i++)
        {
            al.add(i);
        }
        //Imprimir arreglo
        System.out.println(al);

        //Crear iterador
        Iterator itr = al.iterator();
        ListIterator ltr = al.listIterator();

        //Eliminar numeros pares del arreglo
       while(itr.hasNext())
        {
            int i =(Integer)itr.next();

            if (i % 2 ==0)
            itr.remove();
        }
        System.out.println(al);
        while (ltr.hasNext())
        {
            int i = (Integer)ltr.next();

            if (i%2 !=0)
                ltr.set(i+1);
         }
         System.out.println(al);
    }
}