import java.*;
import java.math.*;

public class Plurinominal extends Diputado {

    String Partido;

    Plurinominal(String s, String n, int e, int sa, String p) {
        super(s, n, e, sa,p);
    }

    public void FijarPartido(String p) {
        this.Partido = p;
        System.out.println("El Senador pertenece a: " + this.Partido);
    }

    public boolean Votar(String ley) {
        double r = Math.random();

        if (r > 0.5) {
            System.out.println(this.Nombre + " Voto en contra");
            return false;
        } else
            System.out.println(this.Nombre + " Voto a favor");
            return true;
    }

}