import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Vector v = new Vector();

        for(int i = 0; i<10 ; i++)
            v.addElement(i);
        System.out.println(v);

        Enumeration e = v.elements();

        while(e.hasMoreElements())
        {
            int i = (Integer)e.nextElement();
            System.out.println(i + " ");
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i<10 ; i++)
        {
            al.add(i);
        }

        System.out.println(al);

        Iterator itr = al.iterator();

        while(itr.hasNext())
        {
            int i = (Integer)itr.next();

            if(i%2 != 0)
            itr.remove();
        }
        System.out.println(al);

        ArrayList<Integer> ali = new ArrayList<Integer>();
        for(int i = 0; i<10 ; i++)
        {
            ali.add(i);
        }

        System.out.println(ali);

        ListIterator it = ali.listIterator();

        while(it.hasNext())
        {
            int i = (Integer)it.next();

            if(i%2==0)
            {
                it.set(i+1);
            }
        }

        System.out.println(ali);

    }
}