import java.*;

public abstract class Funcionario
{
    String Sexo,Nombre;
    int Edad,Salario;

    Funcionario(String s,String n,int e,int sa)
    {
        this.Sexo=s;
        this.Nombre=n;
        this.Edad=e;
        this.Salario=sa;
    }

    public void FijarSalario(int cantidad)
    {
        this.Salario=cantidad;
        System.out.println("El salario es: $"+this.Salario+".00");
    }
    public abstract void FijarPartido(String partido);
}