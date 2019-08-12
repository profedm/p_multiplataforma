import BinaryLB.*;
import java.io.*;
import java.*;
import java.util.Scanner;

public class Testing
{
    public static void main(String arg[])
    {
        BinaryOp conv = new BinaryOp ();
         Scanner input = new Scanner(System.in);

         System.out.println("Welcome to binary convertion and operations");
         System.out.println("Seleccione una opcion");
         System.out.println("1. Convertir un decimal a un binario");
         System.out.println("2. Operaciones con numeros binarios");
         int opc = input.nextInt();

        switch (opc)
        {
            case 1: 
            System.out.println("Ingrese numero real positivo a convertir");
            int v = input.nextInt();
            conv.ConvertirBinario(v);
            break;

            case 2:
            System.out.println("Seleccione una operacion");
            System.out.println("1. AND");
            System.out.println("2. OR");
            System.out.println("3. XOR");
            System.out.println("4. LSHIFT");
            System.out.println("5. RSHIFT");
            int opc2 = input.nextInt();
                switch(opc2)
                {
                    case 1: 
                    System.out.println("Ingrese los 2 valores");
                    System.out.println("Ingrese valor 1");
                    int v1  = input.nextInt();
                    System.out.println("Ingrese valor 2");
                    int v2  = input.nextInt();

                    int resultado = conv.bw_and (v1,v2);
                     System.out.println ("El resultado en decimal es:"+resultado); 
                     System.out.println ("El resultado en Binario es"); 
                      conv.ConvertirBinario (resultado);
                     break;

                     case 2: 
                     System.out.println("Ingrese los 2 valores");
                    System.out.println("Ingrese valor 1");
                     v1  = input.nextInt();
                    System.out.println("Ingrese valor 2");
                     v2  = input.nextInt();

                     resultado = conv.bw_or (v1,v2);
                     System.out.println ("El resultado en decimal es:"+resultado); 
                     System.out.println ("El resultado en Binario es"); 
                      conv.ConvertirBinario (resultado);
                     break;

                     case 3:
                     System.out.println("Ingrese los 2 valores");
                    System.out.println("Ingrese valor 1");
                     v1  = input.nextInt();
                    System.out.println("Ingrese valor 2");
                    v2  = input.nextInt();

                     resultado = conv.bw_xor (v1,v2);
                     System.out.println ("El resultado en decimal es:"+resultado); 
                     System.out.println ("El resultado en Binario es"); 
                      conv.ConvertirBinario (resultado);
                     break;

                     case 4:
                     System.out.println("Ingrese los 2 valores");
                    System.out.println("Ingrese valor 1");
                     v1  = input.nextInt();
                    System.out.println("Ingrese valor 2");
                     v2  = input.nextInt();

                     resultado = conv.bw_lshift (v1,v2);
                     System.out.println ("El resultado en decimal es:"+resultado); 
                     System.out.println ("El resultado en Binario es"); 
                      conv.ConvertirBinario (resultado);
                     break;

                     case 5:
                     System.out.println("Ingrese los 2 valores");
                    System.out.println("Ingrese valor 1");
                     v1  = input.nextInt();
                    System.out.println("Ingrese valor 2");
                     v2  = input.nextInt();

                     resultado = conv.bw_rshift (v1,v2);
                     System.out.println ("El resultado en decimal es:"+resultado); 
                     System.out.println ("El resultado en Binario es"); 
                      conv.ConvertirBinario (resultado);
                     break;
                     

                }

           
        }

        
         

    
    }
}