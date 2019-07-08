import java.util.Scanner;

public class Book
{
    public static void main (String []argas)
    { 

        float v1, v2, suma, resta, multiplicacion, division;
        int opc;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Elija una opcion");
        System.out.println("1.Problema 1 Examen");
        System.out.println("2.Problema 2 Examen");
        opc = teclado.nextInt();
        Calculadora calcu = new Calculadora ();
        switch (opc)
        {
            case 1:
            System.out.println("Ingresa el primer valor");
            v1 = teclado.nextFloat();
            System.out.println("Ingresa el Segundo valor");
            v2 = teclado.nextFloat();
                suma = calcu.suma(v1,v2);
                resta = calcu.resta(v1,v2);
                multiplicacion=calcu.multiplicacion(v1,v2);
                division = calcu.division(v1,v2);

                System.out.println("El Resultado de la suma es:"+suma);
                System.out.println("El Resultado de la resta es:"+resta);
                System.out.println("El Resultado de la multiplicacion es:"+multiplicacion);
                System.out.println("El Resultado de la division es:"+division);
                break;

                case 2:

                System.out.println("Ingrese el valor para sacar factorial");
                    int fact = teclado.nextInt();
                System.out.println("Ingrese el primer numero a comparar");
                    int c1 = teclado.nextInt();
                System.out.println("Ingrese el segundo numero a comparar");
                    int c2 = teclado.nextInt();
                System.out.println("Ingrese el tercer numero a comparar");
                    int c3 = teclado.nextInt();


                    int Factorial = calcu.factorial(fact);

                    System.out.println("El factorial es:"+Factorial);

                    calcu.comparar(c1,c2,c3);
                case 3:

                    System.out.println("Bienvenidos al himalaya");
                    System.out.println("Ingrese el primer valor a promediar");
                        int p1 = teclado.nextInt();
                     System.out.println("Ingrese el segundo valor a promediar");
                        int p2 = teclado.nextInt();
                     System.out.println("Ingrese el tercero valor a promediar");
                        int p3 = teclado.nextInt();
                     System.out.println("Ingrese el cuarto valor a promediar");
                        int p4 = teclado.nextInt();
                    System.out.println("Ingrese el quinto valor a promediar");
                        int p5 = teclado.nextInt();

                    float promedio = calcu.promedio(p1,p2,p3,p4,p5);
                    double Desviacion_estandar = calcu.desviacion(p1,p2,p3,p4,p5,promedio);
                    System.out.println("La medias es:"+ promedio);
                    System.out.println("Y la desviacion estandar es : "+ Desviacion_estandar);

                    



        }
        
       
               
        

    }

}