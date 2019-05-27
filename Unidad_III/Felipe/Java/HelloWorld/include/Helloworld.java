public class Helloworld 
{
	//Argumentos
	String msg ="Helloworld...................";
	
	//constructores
	public Helloworld()
	{
	}

	public Helloworld (String a)
	{
		msg=a;
	}
	
	//Metodos
	public void say_hello()
	{
		System.out.println(msg);
	}

}