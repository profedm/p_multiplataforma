import java.*;

interface MyInterface
{
    public void method1();
}

public class Demo implements MyInterface
{
    public void method1()
    {
        System.out.println("Implementacion");
    }
    public static void main(String[] args) {
        MyInterface obj = new Demo();
        obj.method1();
    }
}