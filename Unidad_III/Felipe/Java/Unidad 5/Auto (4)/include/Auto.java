abstract class Auto implements Vehiculo
{
        String Motor;
        int Kilometraje;


    //Costructor
    public Auto (String Motor, int k)
    {
        this.Motor = Motor;
        this.Kilometraje = k;
    }

    //Metodos

    abstract public void tipo (String m);

    public void Correr (int k)
    {
        this.Kilometraje = this.Kilometraje + k;
        System.out.println("El kilometraje del vehiculo es: "+this.Kilometraje);
    }

}
