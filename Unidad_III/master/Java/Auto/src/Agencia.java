public class Agencia
{
	public static void main(String []Args)
	{
		//Define car
		String marca = "Audi"; 
		String modelo = "R8"; 
		int year = 2018; 
		int kilom = 20000;

		//Create object
		Auto movil = new Auto(marca, modelo, year, kilom);

		//Correr auto
		int kil = movil.correr();

		//Modificar auto
		String act = movil.modificar("R8 hibrido");

		//Mostrar estado actual
		movil.show();

	}

}
