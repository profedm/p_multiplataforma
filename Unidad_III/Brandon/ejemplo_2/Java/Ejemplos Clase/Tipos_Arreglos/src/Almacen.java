import java.*;
import java.util.Scanner;

public class Almacen
{
    String[][] productos = new String[][]{{"Mantecadas","Emperador","Fanta","Doritos"},{"Bimbo","Gamesa","Coca-Cola","Sabritas"}};
    int[] precios = new int[]{13,12,9,10};
    int valor;

    public void Consultar(String p)
    {
        boolean verificar=false;
        for(int i=0;i<this.productos.length;i++)
        {
            for(int j=0;j<this.productos[0].length;j++)
            {
                if(p.equals(this.productos[i][j]))
                {
                    this.valor=j;

                    System.out.println(this.productos[0][j]);
                    System.out.println(this.productos[1][j]);
                    System.out.println(this.precios[j]);
                    verificar=true;
                    break;
                }

            }
        }
        if(!verificar)
        {
            System.out.println("No se encontro");
        }
    }

    public static void main(String[] args) {

        String busqueda;

        Almacen tienda = new Almacen();

        Scanner leer = new Scanner(System.in);

        System.out.println("Cual producto busca?");
        busqueda=leer.next();

        tienda.Consultar(busqueda);
    }
}