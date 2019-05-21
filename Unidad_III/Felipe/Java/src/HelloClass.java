public class HelloClass
{
	public static void main(String []args) 
	{
		String mensaje = "Hello there!";

		//Inicializar objeto
    		HolaMundo Obj = new HolaMundo(mensaje);

		//Imprimir mensaje
		Obj.say_hello();
	}
		
}
