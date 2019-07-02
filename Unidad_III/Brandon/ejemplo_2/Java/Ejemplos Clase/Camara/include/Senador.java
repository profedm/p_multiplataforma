import java.*;

public class Senador extends Funcionario
{
    String Partido;

    Senador(String s, String n, int e, int sa,String p)
    {
        super(s, n, e, sa);
        this.Partido=p;
    }

    public void FijarPartido(String p)
    {
        this.Partido=p;
        System.out.println("El Senador pertenece a: "+this.Partido);
    }

    public String Legislar(String l)
    {
        System.out.println("El senador "+this.Nombre+" propuso: "+l);
        return l;
    }

}