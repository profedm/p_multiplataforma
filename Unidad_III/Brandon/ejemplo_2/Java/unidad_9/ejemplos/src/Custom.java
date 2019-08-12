import java.util.*;

class CustomException extends Exception
{
    int num1;

    public CustomException(int num2)
    {
        this.num1=num2;
    }
    public String toString()
    {
        return("NO me se la tabla del "+this.num1);
    }
}

public class Custom
{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2,m,e=10;

        try
        {
            System.out.println("Ingrese numero 1");
            n1 = leer.nextInt();
            System.out.println("Ingrese numero 2");
            n2 = leer.nextInt();
            m = n1*n2;

            if(n1 == e||n2 == e)
            {
                throw new CustomException(e);
            }
            System.out.println(n1 + " x " + n2 + " = " + m);
        }
        catch(CustomException ex)
        {
            System.out.println(ex);
        }
    }
}