import java.util.*;
public class iterador 
{
    public static void main (String [] args)
    {
        // crear vector
        Vector  v = new Vector();
        for (int i=0; i<10 ; i++)
        {
            v.addElement(i);
        }
        System.out.println(v);

        //crear iterador 
        Enumeration e = v.elements();

        //imprimir elementos 
        while (e.hasMoreElements())
        {
            int i = (Integer)e.nextElement();
            System.out.println(i+ "");
        }
    }
}