import java.util.*;
import java.lang.Math;
import javax.lang.model.util.ElementScanner6;

public class calculadora
{
    //Atributos
    int valor1,valor2,valor3,valor4;

    ArrayList<Float> prome = new ArrayList<Float>();

    Scanner lector = new Scanner(System.in);
    //Constructor

    public calculadora()
    {

    }

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
    
    public float Multi(float a, float b)
    {
        float c = a * b;
        return c;
    }
    
    public float Divi(float a, float b)
    {
        float c=0;
        if(b==0)
        {
            System.out.println("La division entre 0 no es posible");
            return c;
        }
        else
        c=a/b;
        return c;
    }
    public int facto(int a)
    {
        int r=1;

        for(int i=a;i>0;i--)
        {
            r=r*i;
            
        }

        return r;
    }
    public void mayor(int a,int b,int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("El mayor es: "+a);
            }
            else
            {
                System.out.println("El mayor es: " + c);
            }
        }
        else if(b>c)
        {
            System.out.println("El mayor es: " + b);
        }
        else
        {
            System.out.println("El mayor es: " + c);
        }
    }
    
    public float promedio(int a)
    {
        float sum=0;
        float v,c;
        for(int i=0;i<a;i++)
        {
            System.out.println("ingrese el valor "+(i+1)+" :");
            v=lector.nextFloat();
            prome.add(v);
            sum=sum+v;
        }
        c=sum/a;
        return c;
    }

    public double desviacion(int a)
    {
        float media,sumat=0,temp;
        double sum,c;

        media=this.promedio(a);

        for(int i=0;i<a;i++)
        {
            temp=prome.get(i);
            sumat=sumat+((temp-media)*(temp-media));
        }
        sum=(double)sumat;

        c=sum/a;

        c=Math.sqrt(c);

        return c;
    }

}