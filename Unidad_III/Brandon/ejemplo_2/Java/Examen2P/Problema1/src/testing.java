import java.util.Scanner;

import BinaryLB.*;

public class testing
{
    public static void main(String[] args)
    {
        int menu=0,trabajo=1;
        int a,b,c;

        BinaryOP op = new BinaryOP();

        Scanner leer = new Scanner(System.in);

        do
        {
            System.out.println("-----Calculadora Binaria-----");
            System.out.println("Ingrese la operacion deseada");
            System.out.println("AND presione 1");
            System.out.println("OR presione 2");
            System.out.println("XOR presione 3");
            System.out.println("LeftSHIFT presiona 4");
            System.out.println("RightSHIFT presione 5");
            System.out.println("Salir presione 6");
            menu=leer.nextInt();
            switch(menu)
            {
                case 1:System.out.println("Ingrese el valor 1");
                        a=leer.nextInt();
                        System.out.println("ingrese el valor 2");
                        b=leer.nextInt();
                        c=op.bw_and(a,b);
                        menu=0;
                break;
                case 2:System.out.println("Ingrese el valor 1");
                        a=leer.nextInt();
                        System.out.println("ingrese el valor 2");
                        b=leer.nextInt();
                        c=op.bw_or(a,b);
                        menu=0;
                break;
                case 3:System.out.println("Ingrese el valor 1");
                        a=leer.nextInt();
                        System.out.println("ingrese el valor 2");
                        b=leer.nextInt();
                        c=op.bw_xor(a,b);
                        menu=0;
                break;
                case 4:System.out.println("Ingrese el valor 1");
                        a=leer.nextInt();
                        System.out.println("ingrese el valor 2");
                        b=leer.nextInt();
                        c=op.bw_lshift(a,b);
                        menu=0;
                break;
                case 5:System.out.println("Ingrese el valor 1");
                        a=leer.nextInt();
                        System.out.println("ingrese el valor 2");
                        b=leer.nextInt();
                        c=op.bw_rshift(a,b);
                        menu=0;
                break;
            }
        }
        while(menu!=6);
    }
}

