import java.util.*;

public class argu
{
    public static void main(String[] args) {
        
        if(args.length > 0)
        {
            System.out.println("lIsta de argumentos");

            for(String val: args)
                System.out.println(val);
        }
        else
            System.out.println("Sin Argumentos");
    }
}