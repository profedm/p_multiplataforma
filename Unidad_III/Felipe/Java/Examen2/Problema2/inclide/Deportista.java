abstract class Deportista
{
    //Atributos
    String nombre;
    int edad;
    int salario;
    String nacionalidad;


    //constructor
    public Deportista(String n, int e, int s, String nacion)
    {
        this.nombre = n;
        this.edad = e;
        this. salario = s;
        this.nacionalidad = nacion;
    }


    //metodos 
    abstract public void Info ();
}