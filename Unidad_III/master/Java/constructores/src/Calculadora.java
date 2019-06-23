class Calculadora
{
    public static float suma(float a, float b)
    {
        float c = a + b;
        return c;
    }
    
    public static void main(String args[]) {
        float c = Calculadora.suma((int)4, (int)2);
        System.out.println(c);
    }
}
