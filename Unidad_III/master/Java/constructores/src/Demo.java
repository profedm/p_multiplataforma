class Calculadora
{
    public float suma(float a, float b)
    {
        float c = a + b;
        return c;
    }
}

class Demo extends Calculadora
{    
    //Redefinir metodo
    public float suma(float a, float b)
    {
        float c = super.suma(a, b);
        System.out.println(a + " + " + b + " = " + c);
	return c;
    }

    public static void main(String args[]) 
    {
	Demo demo = new Demo();
        demo.suma(1,2);
    }
}
