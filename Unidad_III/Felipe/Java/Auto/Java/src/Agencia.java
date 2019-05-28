public class Agencia
{
    public static void main (String []argas)
    {   
        
        String pintura= "Azul";
        int K = 230;
        Auto Objeto = new Auto("Mazada","Rojo",1000,2019, "V3");
        String Pintura = Objeto.pintar(pintura);
        int Kilome = Objeto.correr(K);
        Objeto.Checar();
        
    }
}