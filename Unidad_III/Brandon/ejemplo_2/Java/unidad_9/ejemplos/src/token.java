import java.util.*;

public class token
{
    public static void main(String[] args) {
        String text = "Universidad Cuauhtemoc: Plantel Zapopan";
        int counter = 1;

        System.out.println("--------Default--------");
        StringTokenizer st1 = new StringTokenizer(text);

        while(st1.hasMoreTokens())
        {
            System.out.println(counter+") "+st1.nextToken());
            counter++;
        }

        counter=1;
        System.out.println("------Por puntos----------");
        StringTokenizer st2 = new StringTokenizer(text,":");
        while(st2.hasMoreTokens())
        {
            System.out.println(counter + ") " + st2.nextToken());
            counter++;
        }

        counter = 1;
        System.out.println("------Full----------");
        StringTokenizer st3 = new StringTokenizer(text, ":",true);
        while (st3.hasMoreTokens()) {
            System.out.println(counter + ") " + st3.nextToken());
            counter++;
        }
    }
}