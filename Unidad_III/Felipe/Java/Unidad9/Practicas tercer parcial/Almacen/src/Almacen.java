import java.util.*;
public class Almacen
{
      String [][] productos = {{"Jugo de naranja", "Galletas", "Papas", "Cafe"},
        {"Jumex", "Chokis", "Sabritas", "JuanValdez"}}; 
       

        int [] precio  = {14,9,11,40};
     
        

    public void consultar(String a)
    {
        String producto = a;

            for (int i =0 ;i<this.productos[0].length; i++)
              {
                  if (producto == this.productos[i][0])
                  {
                      System.out.println (this.productos[i][0]);
                      System.out.println (this.precio[0]);
                  }
                /* for (int j=0; j<this.productos[0].length; j++)
                     {
                         System.out.println(this.productos[i][j]);
                     }*/
                  

              }
    }
    public static void main (String args[])
    {
      
        Scanner input = new Scanner(System.in);

        Almacen obj = new Almacen ();   

        System.out.println("Ingresa el producto a encontrar");
        String Buscar = input.nextLine();
        obj.consultar(Buscar);
        

          
    }
}