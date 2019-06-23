import java.util.*;
import java.util.concurrent.TimeUnit;

class Vehiculo
{
	//Atributos
	String motor; 
	int kilometraje;

	//Constructor
	Vehiculo(String mt, int kil)
	{
		this.motor = mt;
		this.kilometraje = kil; 
	}

	//Metodos
	public void correr(int kilom)
	{
		this.kilometraje += kilom;
		System.out.println("El vehiculo ha recorrido: " + this.kilometraje + " km");
	}
}

public class Auto extends Vehiculo
{
	//Atributos
	String color, modelo;
	public static Set<Auto> immortals = new HashSet<>();

	//Constructores
	Auto(String mt, int kil, String col, String mar)
	{
		super(mt, kil);
		//this.motor = mt;
		//this.kilometraje = kil;
		this.color = col;
		this.modelo = mar;

		System.out.println("Automovil creado con características: ");
		System.out.println("Motor:" + this.motor);
		System.out.println("Kilometraje:" + this.kilometraje);
		System.out.println("Color:" + this.color);
		System.out.println("Marca:" + this.modelo);
	}

	//Finalize
	protected void finalize() throws Throwable
	{
		immortals.add(this);
		System.out.println("El auto con características: ");
		System.out.println("Motor:" + this.motor);
		System.out.println("Kilometraje:" + this.kilometraje);
		System.out.println("Color:" + this.color);
		System.out.println("Marca:" + this.modelo);
		System.out.println("Fue destruido...");
	}

	public static void main(String args[])
	{
		//Inicializar objeto
		Auto Cheyenne = new Auto("Gasolina", 10000, "Rojo", "Cheyenne");

		//Correr Cheyenne
		Cheyenne.correr(1000);

		//Destruir auto
		Cheyenne = null;
		System.gc();
		System.runFinalization();
		try
{
    Thread.sleep(1000);
}
catch(InterruptedException ex)
{
    Thread.currentThread().interrupt();
}

	}

}
