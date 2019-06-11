import java.io.*; 
import java.util.*; 

public class Listas
{

	//Atributos
	ArrayList<Integer> enteros = new ArrayList<Integer>();
	Scanner input = new Scanner(System.in);
	int v;

	//Constructores
	public Listas()
	{
		System.out.println("---Creando lista default de 5 elementos---");
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Ingresar valor (" + i + ") :");
			this.v = input.nextInt();
			this.enteros.add(this.v); 
		}
	}

	public Listas(int N)
	{
		System.out.println("---Creando lista de " + N + " elementos---");
		for(int i = 0; i < N; i++)
		{
			System.out.println("Ingresar valor (" + i + ") :");
			this.v = input.nextInt();
			this.enteros.add(this.v); 
		}
	}

	//Metodos
	public void ordenar_coll(String opcion)
	{
		if(opcion == "adelante")
		{
			Collections.sort(this.enteros);
		}
		else
		{	
			Collections.sort(this.enteros, Collections.reverseOrder());
		}

	}

	public void ordenar_iter(String opcion)
	{
		if(opcion == "adelante")
		{
			//Crear iterador
			ListIterator iterador = enteros.listIterator();
			ArrayList<Integer> auxiliar = new ArrayList<Integer>;
			int valor;

			//Primer valor
			auxiliar.add(this.enteros.get(0));
			for()
				
		}
		else
		{	
			System.out.println("Lista ordenada de mayor a menor");
			Collections.sort(this.enteros, Collections.reverseOrder());
		}

	}
	

} 
