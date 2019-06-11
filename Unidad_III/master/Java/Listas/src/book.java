import java.io.*; 
import java.util.*; 

public class book
{

	public static void main(String []args)
	{

		//Crear arreglo de 10 elementos
		Listas lista = new Listas(5);

		//Crear iterador
		Iterator iterador = lista.enteros.iterator();

		//Imprimir lista de valores
		System.out.println("Lista ingresada:");
		System.out.println(lista.enteros);

		//Ordenar lista con collections
		lista.ordenar_coll("adelante");

		//Print output
		System.out.println("Lista ordenada:");
		System.out.println(lista.enteros);

	}





}
