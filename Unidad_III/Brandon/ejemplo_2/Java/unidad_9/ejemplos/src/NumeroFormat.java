import java.*;

public class NumeroFormat
{
    
    public static void main(String[] args)
    {
        try
        {
            int num = Integer.parseInt("Onomatopeya");
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Formato Incorrecto");
        }
    }

}