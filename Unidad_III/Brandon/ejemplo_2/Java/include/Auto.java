public class Auto {
	
	String marca;
	String modelo;
	int year;
	int kilometraje;
	String color;
	
	public Auto(String marca, String modelo, int year, int kilo, String color)
	{
		this.marca=marca;
		this.modelo=modelo;
		this.year=year;
		this.kilometraje=kilo;
		this.color=color;
	}
	
	public Auto()
	{
		this.marca="Mazda";
		this.modelo="v3";
		this.year=2019;
		this.kilometraje=10000;
		this.color="Rojo";
	}
	
	public void Pintar(String color)
	{
		this.color=color;
		System.out.println("El color del auto es: "+ this.color);
	}
	
	public void Correr(int kilo)
	{
		this.kilometraje=(kilo+this.kilometraje);
		System.out.println("El kilometraje del auto es: "+this.kilometraje);
	}
	
	public void Modificar(String modelo)
	{
		this.modelo=modelo;
		System.out.println("El modelo del auto es: "+ this.modelo);
	}
	
	public void Checar()
	{
		System.out.println("La marca es:"+this.marca);
		System.out.println("El modelo es:"+this.modelo);
		System.out.println("El año es:"+this.year);
		System.out.println("El kilometraje es:"+this.kilometraje);
		System.out.println("El color es:"+this.color);
	}
	
	
}
