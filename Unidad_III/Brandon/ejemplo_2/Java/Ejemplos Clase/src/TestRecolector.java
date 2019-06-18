import java.*;
import java.util.*;

public class TestRecolector
{
    public void testear()
    {
        Date fecha = null;
        for(int i=0;i<9999;i++)
        {
            fecha = new Date();
            fecha = null;
        }

        this.pasarGarbage();
    }
    public void pasarGarbage()
    {
        Runtime garbage = Runtime.getRuntime();
        System.out.println("Previo: "+garbage.freeMemory());

        garbage.gc();

        System.out.println("Posterior: "+garbage.freeMemory());
    }
    public static void main(String[] args)
    {
        Runtime garbage = Runtime.getRuntime();
        garbage.gc();
        System.out.println("Inicial: "+garbage.freeMemory());

        TestRecolector test = new TestRecolector();
        test.testear();
    }
}