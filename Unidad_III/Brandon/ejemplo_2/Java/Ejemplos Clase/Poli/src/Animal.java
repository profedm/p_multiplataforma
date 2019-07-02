import java.*;

public class Animal
{
    public void sound()
    {
        System.out.println("El animal hace un sonido");
    }

    public void sonido()
    {
        System.out.println("El animal hace un sonido");
    }

    public void sonido(String s)
    {
        System.out.println("El animal hace "+s);
    }

    public static void main(String[] args) {
        Animal ani1 = new Animal();
        horse ani2 = new horse();

        ani1.sound();
        ani2.sound();
        ani1.sonido();
        ani1.sonido("Hola a todos");
    }
}

class horse extends Animal
{
    public void sound()
    {
        System.out.println("Neigh");
    }
}