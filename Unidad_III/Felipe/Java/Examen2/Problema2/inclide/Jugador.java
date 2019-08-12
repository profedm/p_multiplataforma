import java.math.*;

public class Jugador extends Deportista
{
    //Atributos
    String posicion;
    boolean estado = false;

    //constructor 

    public Jugador (String n, int e, int s, String nacion, String p)
    {
        super(n,e,s,nacion);
        this.posicion = p;
    }
    
    //metodos 
      public void Info ()
     {
         System.out.println ("Nombre: "+this.nombre);
         System.out.println ("Edad: "+this.edad);
         System.out.println ("Salario: "+this.salario);
         System.out.println ("Nacionalidad: "+this.nacionalidad);
         System.out.println ("Posicion"+this.posicion);
     }

    public void Iniciar ()
    {
        System.out.println("El jugador"+this.nombre+"Tiene el balon");
        this.estado = true;
    }

    public void Pasar (Jugador ob)
    {

        ob.estado = true;
        this.estado= false;
        System.out.println("El jugador"+this.nombre+"Le pasa el balon al jugador"+ob.nombre);
    }

    public void Tirar ()
    {
        if (this.estado == true )
        {
            double x = Math.random();
            if (x>0.5)
            {
                System.out.println("Ha marcado... GOOOOOOL!!");
            }
            else
            {
                System.out.println("Ha fallado el disparo");
            }

        }
    }
}