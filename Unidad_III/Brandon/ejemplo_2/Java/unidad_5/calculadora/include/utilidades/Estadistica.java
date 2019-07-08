package utilidades;

import java.*;
import java.util.*;
import java.lang.Math;
import javax.lang.model.util.ElementScanner6;

public class Estadistica
{
    int valor1, valor2, valor3, valor4;

    ArrayList<Float> prome = new ArrayList<Float>();

    Scanner lector = new Scanner(System.in);

    public float promedio(int a) {
        float sum = 0;
        float v, c;
        for (int i = 0; i < a; i++) {
            System.out.println("ingrese el valor " + (i + 1) + " :");
            v = lector.nextFloat();
            prome.add(v);
            sum = sum + v;
        }
        c = sum / a;
        return c;
    }

    public double desviacion(int a) {
        float media, sumat = 0, temp;
        double sum, c;

        media = this.promedio(a);

        for (int i = 0; i < a; i++) {
            temp = prome.get(i);
            sumat = sumat + ((temp - media) * (temp - media));
        }
        sum = (double) sumat;

        c = sum / a;

        c = Math.sqrt(c);

        return c;
    }
}