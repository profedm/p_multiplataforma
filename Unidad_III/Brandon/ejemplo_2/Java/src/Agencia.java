import java.util.Scanner;


public class Agencia {

	public static void main(String[] args) {
		
		String marcaM,modeloM,colorM,temp;
		int yearM,kiloM;
		
		Auto auto1= new Auto();
		
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Ingresa la marca");
		marcaM=leer.nextLine();
		System.out.println("ingresa el modelo");
		modeloM=leer.nextLine();
		System.out.println("Ingresa el año");
		yearM=leer.nextInt();
		System.out.println("Ingresa el Kilometraje");
		kiloM=leer.nextInt();
		System.out.println("Ingrese el color");
		colorM=leer.nextLine();
		
		
		Auto auto2= new Auto(marcaM,modeloM,yearM,kiloM,"Azul");
		
		auto1.Checar();
		auto2.Checar();
		///////////////////////////////////////////////////////
		System.out.println("Ingrese el color nuevo");
		colorM=leer.nextLine();
		
		auto2.Pintar(colorM);
		////////////////////////////////////////////////////////
		System.out.println("Ingresa el Kilometraje nuevo");
		kiloM=leer.nextInt();
		
		auto2.Correr(kiloM);
		///////////////////////////////////////////////////////
		System.out.println("ingresa el modelo nuevo");
		modeloM=leer.nextLine();
		
		auto2.Modificar(modeloM);
		///////////////////////////////////////////////////////
		auto2.Checar();
		
		

	}

}
