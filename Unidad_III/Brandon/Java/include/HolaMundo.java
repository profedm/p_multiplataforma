public class HolaMundo 
{
	//Atributos
	String message;

	//Constructores
	public HolaMundo()
	{
		message = "Hola mundo!";
	}
	public HolaMundo(String mensaje)
	{
		message = mensaje;
	}

	//Métodos
	public void say_hello()
	{
		System.out.println(message);
	}

}
