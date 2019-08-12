import java.util.*;

class Throwcustom extends Exception
{   
    int num1;

    public  Throwcustom (int num2)
        {
            this.num1=num2;
        }

        public String toString()
        {
            return ("No me sale la tabla del"+ this.num1);
        }

}

public class Custom 
{
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        int n1,n2,m,e=3;

        try
        {
            System.out.println("Ingrese numero 1");
            n1 = reader.nextInt();
            System.out.println("Ingrese numero 2");
            n2 = reader.nextInt();
            m=n1*n2;


            if (n1 == e || n2 == e)
            {
                throw new Throwcustom (e);
            }
            System.out.println (n1+"x"+n2+"="+m);
        }

        catch (Throwcustom ex)
        {
            System.out.println(ex);
        }
    }
}