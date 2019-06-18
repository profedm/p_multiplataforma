import java.*;

class SuperClase
{
    public SuperClase()
    {
        System.out.println("Esta es la superclase..");
    }
    public static void main(String[] args) {
        
    }
}

public class ClaseHija extends SuperClase
{
    public ClaseHija()
    {
        System.out.println("Esta es la clase hija..");
    }

    public static void main(String[] args) {
        ClaseHija hola = new ClaseHija();
    }
}
