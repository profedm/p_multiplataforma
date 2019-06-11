public class Auto
{

	//Atributos
	String marca, modelo;
	int year, kilom;

	//Constructores
	public Auto()
	{
		marca = "Mazda";
		modelo = "V3";
		year = 2019;
		kilom = 0;
	}

	//Constructores
	public Auto(String mc, String mo, int ye, int kil)
	{
		marca = mc;
		modelo = mo;
		year = ye;
		kilom = kil;
	}

	public int correr()
	{
		//Run car
		kilom = kilom + 10;
		System.out.println("El auto se desplazo 10km, actual: " + kilom + " km");

		return kilom;
	}

	public String modificar(String nuevo)
	{
		//Run car
		modelo = nuevo;
		System.out.println("Auto modificado, actual: " + nuevo);

		return modelo;
	}

	public void show()
	{
		//Print state
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + year);
		System.out.println("Kilometraje: " + kilom);
	}

} 
