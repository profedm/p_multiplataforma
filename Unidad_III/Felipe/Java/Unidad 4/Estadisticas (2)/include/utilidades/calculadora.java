package utilidades;
import java.util.*;

public class calculadora
{
    //Atributos
    float v1;
    float v2;

    //costructores
    public void calculadora (float a, float b)
    {
        this.v1=a;
        this.v2=b;

        float rs = v1+v2;
        System.out.println(v1+"+"+v2+"="+rs);

        float rr = v1-v2;
         System.out.println(v1+"-"+v2+"="+rr);
        
        float rm = v1*v2;
         System.out.println(v1+"*"+v2+"="+rm);
        

        if (v2==0)
        {
            System.out.println("Esto no exite amigo en este mundo de mortales");
        }
        else
        {
            float rd = v1/v2;
         System.out.println(v1+"/"+v2+"="+rd);
        }
        
    }
}