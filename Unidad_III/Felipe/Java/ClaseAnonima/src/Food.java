class Pizza
{
    public void eat()
    {
        System.out.println("Pizza Hawaiana");
    }
}

class Food
{
    public static void main (String args[])
    {
        Pizza p = new Pizza()
        {
            public void eat ()
            {
                System.out.println("Pizza venga sin queso no carne ni masa");
            }
        };
        p.eat();
    }
}