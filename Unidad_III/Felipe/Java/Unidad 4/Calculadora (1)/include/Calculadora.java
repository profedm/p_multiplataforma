import java.lang.Math;

public class Calculadora
{
    //Atributos
        float Valor1;
        float Valor2;
        float Valor3;
        int Valor4;


    //Constructores
    public Calculadora()
    {

    }

    public Calculadora(float a, float b)
    {
        Valor1 = a;
        Valor2 = b;
    }

    //Metodos
    public float  suma (float a, float b)
    {
            Valor1 = a;
            Valor2 = b;

            return Valor1+Valor2;
    }
    public float  resta (float a, float b)
    {
            Valor1 = a;
            Valor2 = b;

            return Valor1-Valor2;
    }
    public float  multiplicacion (float a, float b)
    {
            Valor1 = a;
            Valor2 = b;

            return Valor1*Valor2;
    }
    public float  division (float a, float b)
    {       
        
            Valor1 = a;
            Valor2 = b;
            if (Valor2 == 0)
            {
                System.out.println("La division por 0 no existe en este mundo mortal");
            }
            else
            {
                 Valor3 = Valor1/Valor2;
            }
            return Valor3;
    }

    public int factorial (int a)
    {
            int Factoria = 1;
            for (int i =1; i <= a; i++ )
            {
                Factoria = Factoria *i; 
            }
        return Factoria;
    }

    public void comparar (int a, int b, int c )
    {
        if (a>b && a>c)
            System.out.println("El mayor es:"+a);
        else if (b>c)
        System.out.println("El mayor es:"+b);
        else
        System.out.println("El mayor es:"+c);

    } 

    public float promedio (int a, int b, int c, int d, int e)
    {
            float promedio;

            promedio = (a+b+c+d+e)/5;

            return promedio;
    }

    public double desviacion (int a, int b, int c, int d, int e, float promedio)
    {
            double desv;
            double Desviacion;
            double v1 = (double) a;
            double v2 = (double) b;
            double v3 = (double) c;
            double v4 = (double) d;
            double v5 = (double) e;

            double prom = (double) promedio;

            desv =( Math.pow((v1-prom),(2))+Math.pow((v2-prom),(2))+Math.pow((v3-prom),(2))+Math.pow((v4-prom),(2))+Math.pow((v5-prom),(2)))/5;
            Desviacion = Math.sqrt(desv);

            return Desviacion;
    }
}