package utilidades;

import java.*;
import java.util.*;
import java.lang.Math;
import javax.lang.model.util.ElementScanner6;

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

    public float Divi(float a, float b) {
        float c = 0;
        if (b == 0) {
            System.out.println("La division entre 0 no es posible");
            return c;
        } else
            c = a / b;
        return c;
    }
}