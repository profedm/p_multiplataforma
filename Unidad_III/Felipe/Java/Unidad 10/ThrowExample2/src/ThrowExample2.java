import java.util.*;
import java.io.*;
import java.lang.*;
class Throw2 
{   
    void myMethod (int num ) throws IOException,ClassNotFoundException
    {
        if (num == 1)
            throw new IOException ("IOException");
        else
            throw new  ClassNotFoundException ("ClassNotFoundException");
    }
    

}

public class ThrowExample2
{
    public static void main (String [] args)
    {
        try
        {
            Throw2 obj =new Throw2();
            obj.myMethod(1);
        }

        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
}