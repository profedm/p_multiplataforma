abstract class Animal
{
    public abstract void familia();
}

//Clase hija
public class Lobo extends Animal
{
    public void familia()
    {
        System.out.println("Canino");
    }

    public static void main (String args [])
    {
        Animal obj = new Lobo();
        obj.familia();
    }
}