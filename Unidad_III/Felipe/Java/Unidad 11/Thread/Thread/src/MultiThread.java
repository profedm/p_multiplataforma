import java.util.*;
import java.lang.*;

class MultithreadingDemo extends Thread
{
    public void run ()
    {
        try
        {
            //Informacion de hilo
            System.out.println ("Thread" + Thread.currentThread().getId());
        }
        catch (Exception e)
        {
            System.out.println("Excepcion");
        }
    }
}
 public class MultiThread
 {
     public static void main (String [] args)
     {
         int n =8;
         for (int i=0; i<8; i++)
         {
             MultithreadingDemo obj = new MultithreadingDemo();
             obj.start();
         }
     }
 }

