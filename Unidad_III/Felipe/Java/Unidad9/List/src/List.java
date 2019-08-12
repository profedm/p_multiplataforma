import java.util.*;

public class List
{
    public static void main (String args [])
    {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(0,1);
        l1.add(1,2);
        System.out.println(l1);

        //Crear Segunda lista
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        //Ingresar l2 a piscion 1 de la lista 1
        l1.addAll(1,l2);
        System.out.println(l1);

        //Remover elemento 1 de la lista
        l1.remove(1);
        System.out.println(l1);

        //Obtener terce elemento
        System.out.println(l1.get(3));

        //Reemplazar elemto
        l1.set(0,5);
        System.out.println(l1);

        //Buscar Elemento
        int num =l1.indexOf(3);
        System.out.println("posicion:"+num);

    }
}