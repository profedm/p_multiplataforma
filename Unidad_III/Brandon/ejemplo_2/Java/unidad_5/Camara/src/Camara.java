import java.*;
import java.awt.event.ComponentAdapter;
import java.util.Scanner;

public class Camara
{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String Ley;
        int contador=0;

        Senador s1= new Senador("Masculino", "Javier", 46, 80000,"PRI");
        Diputado d1,d2,d3,d4,d5;
        d1 = new Diputado("Femenino", "Laura", 34, 49000,"PAN");
        d2 = new Diputado("Masculino", "Luis", 35, 50000,"PT");
        d3 = new Diputado("Femenino", "Letty", 40, 15000,"PRD");
        d4 = new Diputado("Masculino", "Eduardo", 39, 35000,"PV");
        d5 = new Diputado("Masculino", "Eduardo 2", 39, 35000, "PV");
        Plurinominal p1,p2,p3,p4;
        p1 = new Plurinominal("Masculino", "Jose", 29, 30000,"Mov Ciudadano");
        p2 = new Plurinominal("Femenino", "Maria", 31, 70000,"Morena");
        p3 = new Plurinominal("Masculino", "Martin", 32, 60000,"PSd");
        p4 = new Plurinominal("Femenino", "Ofelia", 45, 45000,"Nueva Alianza");

        System.out.println("Cual es la nueva ley?");
        Ley=leer.next();

        Ley=s1.Legislar(Ley);

        if(d1.Votar(Ley))
        {
            contador++;
        }
        if(d2.Votar(Ley))
        {
            contador++;
        }
        if(d3.Votar(Ley))
        {
            contador++;
        }
        if(d4.Votar(Ley))
        {
            contador++;
        }
        if(p1.Votar(Ley))
        {
            contador++;
        }
        if(p2.Votar(Ley))
        {
            contador++;
        }
        if(p3.Votar(Ley))
        {
            contador++;
        }
        if(p4.Votar(Ley))
        {
            contador++;
        }
        if(d5.Votar(Ley))
        {
            contador++;
        }

        if(contador>4)
        {
            System.out.println("La ley se aprovo");
        }
        else

        System.out.println("La ley no se aprovo");

    }
}