public class Auto
{
    //Atributos
    String Marca;
    String Color;
    int Kilometraje;
    int Year;
    String Modelo;
    
    //Costructores
    public Auto ()
    {
      
        
    }
    
    public Auto(String a, String b, int K, int yt, String c)
    {
        Marca = a; 
        Color = b;
        Kilometraje = K; 
        Year = yt;
        Modelo = c;
    }
    
    //Metodos
    public String pintar(String a)
    {
        Color = a;
        System.out.println ("Tu auto ha sido pintado");
        return Color;
    }
    
    public int correr (int a)
    {
        Kilometraje = Kilometraje +a;
        System.out.println ("Tu Auto tiene:"+Kilometraje+"Kilometros");
        return Kilometraje;
    }
    
    public String modificar (String a)
    {
        Modelo = a;
        return Modelo;
    }
    
    public void Checar ()
    {
        System.out.println ("Marca:" +Marca);
         System.out.println ("Modelo:" +Modelo);
         System.out.println ("Año:" +Year);
         System.out.println ("El auto tuene:" +Kilometraje+ "Kilometros Recorridos");
         System.out.println ("Color:" +Color);
        
        
    }
}