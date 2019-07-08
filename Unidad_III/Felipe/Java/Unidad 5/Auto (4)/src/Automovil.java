public class Automovil extends Auto
{
    String Color;
    String Marca;
    int Modelo;


    public Automovil (String color, String Marca, int Modelo, String Motor, int k)
    {
        super(Motor, k);
        this.Color = color;
        this.Modelo = Modelo;
        this.Marca = Marca;
        
    }

    //Metodos 
    public void pintar (String p)
    {
        this.Color = p;
        System.out.println ("El Color del coche es: "+this.Color);
    }

    public void modificar (int m)
    {
        this.Modelo = m;
        System.out.println ("El modelo del carro es: "+ this.Modelo);
    }

    public void tipo (String m)
    {
        this.Motor = m;
        System.out.println ("El tipo de motor del auto es: "+this.Motor);
    }

//Main
        public static void main (String args [])
        {
            Automovil obj = new Automovil("Azul","Mazda",2018,"Electrico", 13000);

            obj.modificar(20181);
        }
}