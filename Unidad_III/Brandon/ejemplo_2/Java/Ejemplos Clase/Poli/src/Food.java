import java.*;

class Pizza
{
    public void eat()
    {
        System.out.println("Pizza Hawaiana");
    }
}

public class Food
{
    public static void main(String[] args) {
        Pizza p = new Pizza()
        {
            public void eat()
            {
                System.out.println("Pizza Vegana sin qeuso ni carne ni nada");
            }
        };

        p.eat();
    }
}