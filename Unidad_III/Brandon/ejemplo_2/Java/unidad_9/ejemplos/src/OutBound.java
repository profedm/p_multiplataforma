import java.*;

public class OutBound
{
    public static void main(String[] args) {
        
        try {
            int a[] = new int[5];
            a[6] = 9;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Elemento Inaccesible");
        }
    }
}