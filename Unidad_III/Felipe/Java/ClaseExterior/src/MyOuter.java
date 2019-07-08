class MyOuter
{
    private int x=1;

    public void doThings()
    {
        final String name = "Local Variable";
        class MyInner
        {
            public void seeOuter()
            {
                System.out.println("El valor de x es: "+ x);
                System.out.println ("Nombre:" + name);
            }
        }

            MyInner A = new MyInner();
            A.seeOuter();
    }

    static public void main (String args[])
    {
        MyOuter p = new MyOuter();
        p.doThings();
        
    }
}