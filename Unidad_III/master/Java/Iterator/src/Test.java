import java.io.*; 
import java.util.*; 
  
class Test { 
    public static void main(String[] args) 
    { 
        ArrayList<String> list = new ArrayList<String>(); 
  
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        list.add("E"); 
  
        // Crear iterador para lista 
        Iterator iterator = list.iterator(); 
  
        System.out.println("Elementos: "); 
  
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
  
        System.out.println(); 

	//Añadir elemento al inicio
	list.add(0,"Z");
	System.out.println(list);
    } 
} 
