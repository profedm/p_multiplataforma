import java.*;

public class Cancha
{
    public static void main(String[] args)
    {
        DTecnico dt1 = new DTecnico("Joachim Löw", 59, 500000, "Alemana");
        Jugador j1 = new Jugador("Toni Kroos", 29, 340000, "Alemana", "Medio");
        Jugador j2 = new Jugador("Thomas Müller", 29, 450000, "Alemana", "Delantero");
        Jugador j3 = new Jugador("Benjamin Pavard", 23, 342000, "Frances", "Defensa");
        Jugador j4 = new Jugador("Javi Martínez", 30, 600000, "Español", "Central");
        Jugador j5 = new Jugador("Manuel Neuer", 33, 480000, "Alemana", "Portero");

        dt1.Info();
        j1.Info();
        j2.Info();
        j3.Info();
        j4.Info();
        j5.Info();

        dt1.Dirigir(j1, "Delantero");

        j1.Iniciar();
        j1.Pasar(j2);
        j2.Pasar(j5);
        j5.Pasar(j4);
        j4.Pasar(j3);
        j3.Tirar();

        j1.Iniciar();
        j1.Pasar(j2);
        j2.Pasar(j5);
        j5.Pasar(j4);
        j4.Pasar(j3);
        j3.Tirar();
    }
}