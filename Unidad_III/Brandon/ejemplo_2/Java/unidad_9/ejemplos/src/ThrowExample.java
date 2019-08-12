import java.util.*;

public class ThrowExample
{
    static void Verificar(int edad)
    {
        if(edad < 18)
        {
            throw new ArithmeticException("Menor de edad");
        }
        else
        {
            System.out.println("Mayor de edad");
        }
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la edad");
        int e = leer.nextInt();
        Verificar(e);
    }
}