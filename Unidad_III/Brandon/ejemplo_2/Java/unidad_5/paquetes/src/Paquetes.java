import utilidades.*;

public class Paquetes
{
    public static void main(String[] args)
    {
        Sumador sum = new Sumador();
        Restador res = new Restador();

        sum.calcular(1, 2);
        res.calcular(1, 2);
    }
}