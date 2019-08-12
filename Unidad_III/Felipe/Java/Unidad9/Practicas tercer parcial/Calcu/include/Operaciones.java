import java.util.*;
import java.lang.*;
import java.math.*;

public class Operaciones
{
    public float Suma(float a, float b) 
    {
        float c = a + b;
        return c;
    }

    public float Resta(float a, float b)
     {
        float c = a - b;
        return c;
    }

    public float Multiplicacion(float a, float b) 
    {
        float c = a * b;
        return c;
    }

    public float Division(float a, float b) throws ArithmeticException 
    {
        float c = 0;

        if(b==0)
        {
            throw new ArithmeticException("La division x0 no existe en este mundo mortal");
        }
        else
        {
            c = a / b;
        }
        
        return c;
    }

    public double Raiz(double a)throws ArithmeticException
    {
        double b =0;
        if(a<0)
        {
            throw new ArithmeticException("La raiz negativa se ve en Algebra lineal aca no");
        }
        else
        {
            b = Math.sqrt(a);
        }

        return b;
    }
}