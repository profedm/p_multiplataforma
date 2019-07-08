import java.io.*;
import java.util.*;


public class Listas
{
    public static void main (String args[])
    {
        Arreglo lista = new Arreglo();
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("cuantos valores ingresara en el arreglo?");
        
        int c = scan.nextInt();
        
        lista.crear(c);
        
        lista.ordenar();
    }
}
