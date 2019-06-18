import java.*;

class calculadora
{
    public float suma(float a, float b)
    {
        float c = a+b;
        return c;
    }
}

public class demo extends calculadora
{
    public float suma(float a, float b)
    {
        float c = super.suma(a,b);
        System.out.println(a+" + "+b+" = "+c);
        return c;
    }
    public static void main(String[] args) 
    {
        demo s = new demo();
        s.suma(2, 3);
    }
}