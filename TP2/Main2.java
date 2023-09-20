package TP2;

public class Main2 {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Agustin");
        Jugador j2 = new Jugador("Diego");
        Dado d1 = new Dado(5);
        Dado d2 = new Dado(7);

        Juego2 juegoDeDados = new Juego2(j1, j2, d1, d2, 10, 7);

        Jugador ganador = juegoDeDados.jugar();
        System.out.println(juegoDeDados.getJugador1());
        System.out.println(juegoDeDados.getJugador1());
        if (ganador != null) {
            System.out.println("Gano " + ganador.getNombre() + " con " + ganador.getPuntos() + " puntos!");
        } else {
            System.out.println("Empate");
        }
    }
}
