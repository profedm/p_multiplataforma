class Calculadora
{
    public float suma(float a, float b)
    {
        float c = a + b;
        return c;
    }
}

class FinExample extends Calculadora
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
	FinExample demo = new FinExample();
        demo.suma(1,2);

	//FInalizar objeto
	demo.finalize();
	demo.suma(1,2);


    }
}
