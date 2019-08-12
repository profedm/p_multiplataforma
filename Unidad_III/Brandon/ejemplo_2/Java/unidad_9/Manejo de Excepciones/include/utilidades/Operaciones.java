package utilidades;

import java.*;
import java.util.*;
import java.lang.Math;
import javax.lang.model.util.ElementScanner6;
import java.math.*;

public class Operaciones
{
    public float Suma(float a, float b) {
        float c = a + b;
        return c;
    }

    public float Resta(float a, float b) {
        float c = a - b;
        return c;
    }

    public float Multi(float a, float b) {
        float c = a * b;
        return c;
    }

    public float Divi(float a, float b) throws ArithmeticException {
        float c = 0;

        if(b==0)
        {
            throw new ArithmeticException("El valor ingresado es 0");
        }
        else
        {
            c = a / b;
        }
        
        return c;
    }

    public double Raiz(Double a)throws ArithmeticException
    {
        double c =0;
        if(a<0)
        {
            throw new ArithmeticException("La raiz negativa no esta definida en numero reales");
        }
        else
        {
            c = Math.sqrt(a);
        }

        return c;
    }
}