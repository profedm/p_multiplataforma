import java.io.IOException;
import java.util.*;

public class ThrowsE
{
    void myMethod(int num) throws IOException,ClassNotFoundException
    {
        if(num==1)
            throw new IOException("IOException");
        else
            throw new ClassNotFoundException("ClassNotFoundException");
    }

    public static void main(String[] args) {
        try
        {
            ThrowsE obj = new ThrowsE();
            obj.myMethod(1);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}