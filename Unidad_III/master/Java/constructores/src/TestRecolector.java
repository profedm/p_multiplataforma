import java.io.*; 
import java.util.*; 

class TestRecolector{
 
    public void testear()
    {
        Date fecha = null;
        for (int i = 0; i<99;i++)
	{
            fecha = new Date();
	    //fecha = null;
    	}
 
        this.pasarGarbageCollector();
    }

    public void pasarGarbageCollector()
    {
        Runtime garbage = Runtime.getRuntime();
        System.out.println("Memoria libre antes de limpieza:" + garbage.freeMemory());
 
        garbage.gc();
 
        System.out.println("Memoria libre tras la limpieza:" + garbage.freeMemory());
    }

    public static void main(String[] args)
    {
	Runtime garbage = Runtime.getRuntime();
	garbage.gc();
 	System.out.println("Memoria libre inicial:" + garbage.freeMemory());
        TestRecolector test = new TestRecolector();
        test.testear();
 
    }
}
