public class HelloWorld
{
	String mensaje;

	//Constructor
	HelloWorld(String msj)
	{
		this.mensaje = msj;
	}

	//Metodos
	protected void finalize() throws Throwable
	{
		System.out.println("Mis ultimas palabras son ....");
		System.out.println(this.mensaje);
	}

	public static void main(String []args) 
	{
		String mensaje = "¡Hola hola tacubaya!";

		//Inicializar objeto
    		HelloWorld Obj = new HelloWorld(mensaje);
		Obj = null;
	
		//Pasar colector
		System.gc();
	}
}
