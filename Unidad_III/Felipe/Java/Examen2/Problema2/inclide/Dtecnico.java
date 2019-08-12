public class Dtecnico extends Deportista
{

    //Constructor
     public Dtecnico (String n, int e, int s, String nacion)
    {
       super(n,e,s,nacion);
    }

    //Metodos

    public void Dirigir (Jugador ob, String p)
    {
        ob.posicion = p;
    }

     public void Info ()
     {
         System.out.println ("Nombre: "+super.nombre);
         System.out.println ("Edad: "+super.edad);
         System.out.println ("Salario: "+super.salario);
         System.out.println ("Nacionalidad: "+super.nacionalidad);
     }
}