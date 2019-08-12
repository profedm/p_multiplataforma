public class Cancha
{
    public static void main (String args [])
        {
            Dtecnico tecnico = new Dtecnico("Gareca", 60, 100000, "Argentino");

            Jugador jugador1 = new Jugador ("James", 26, 200000, "Colombiano", "Delantero");
            Jugador jugador2 = new Jugador ("Falcao", 30, 220000, "Colombiano", "Delantero");
            Jugador jugador3 = new Jugador ("Sergio Ramos", 29, 400000, "Español", "Defensor");
            Jugador jugador4 = new Jugador ("Casemiro", 25, 250000, "Brasilero", "Volante");
            Jugador jugador5 = new Jugador ("Cuadrado", 28, 90000, "Colombiano", "volante");


            tecnico.Dirigir(jugador3,"Lateral");

            jugador3.Pasar(jugador4);
            jugador4.Pasar(jugador5);
            jugador5.Pasar(jugador1);
            jugador1.Pasar(jugador2);

            jugador2.Tirar();


        }
}