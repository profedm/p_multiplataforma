import java.util.*;

public class ListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(0,1);
        l1.add(1,2);
        System.out.println(l1);

        ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3}));
        System.out.println(l2);

        l1.addAll(1,l2);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);

        System.out.println(l1.get(3));

        l1.set(0,5);
        System.out.println(l1);

        int nums = l1.indexOf(5);
        System.out.println("Posicion: " + nums);
    }
}