import java.util.*;
public class set
{
    public static void main (String args[])
    {
        //_--------
        Set<String> hash_set = new HashSet<String>();
        hash_set.add("Universidad");
        hash_set.add("Cuauhtemoc");
        hash_set.add("Universidad");
        hash_set.add("Cuauhtemoc");

        System.out.println("Entrada sin duplicados:"+hash_set);
        Set<String> tree_Set = new TreeSet<String>(hash_set);
        System.out.println("Entrada Ordenada"+tree_Set);

        //Mas ejemplos 
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();
        a.add(3);
        a.add(4);
        a.add(10);
        a.add(9);
        a.add(12);

        b.add(7);
        b.add(10);
        b.add(1);
        b.add(19);
        b.add(6);
        //Interseccion
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Interseccion:"+intersection);
        //Diferencias
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Diferencia"+difference);
        
    }
}