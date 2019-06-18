import java.*;

public class calculadora
{
    public static float suma(float a, float b)
    {
        float c = a+b;
        return c;
    }

    public static void main(String[] args) {
        float d = calculadora.suma((int)4, (int)7);
        System.out.println(d);
    }
}