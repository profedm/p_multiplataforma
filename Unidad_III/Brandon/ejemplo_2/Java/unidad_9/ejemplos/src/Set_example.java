import java.util.*;

public class Set_example
{
    public static void main(String[] args)
    {
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Universidad");
        hash_Set.add("Cuauhtemoc");
        hash_Set.add("Universidad");
        hash_Set.add("Cuauhtemoc");
        System.out.println("Entrada sin duplicados:" + hash_Set);
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        System.out.println("Entrada ordenada:" + tree_Set);

        //Interseccion
        Set<Integer> a = new HashSet<Integer>();
        Set<Integer> b = new HashSet<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);

        b.add(1);
        b.add(3);
        b.add(4);

        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Difference: " + difference);
    }
}