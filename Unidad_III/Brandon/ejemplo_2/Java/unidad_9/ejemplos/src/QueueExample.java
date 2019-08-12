import java.util.Queue;

import java.util.LinkedList;

public class QueueExample
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<Integer>();

        for(int i=0; i<5 ; i++)
            q.add(i);
        System.out.println("Elementos : " + q);

        int removedele = q.remove();
        System.out.println("Eliminado: " + removedele);
        System.out.println("Elementos: " + q);

        int head = q.peek();
        System.out.println("Cabecera: " + head);

        System.out.println("Dimension Final: " + q.size());
    }
}
