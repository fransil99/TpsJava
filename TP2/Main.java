package TP2;

public class Main {
    public static void main(String[] args) {

        Juego1 j1 =  new Juego1();
        Juego1 j2 = new Juego1(3);
        Juego1 j3 = new Juego1(9,4);

        System.out.println(j3.jugar());

        System.out.println(j3.getPuntosJugador1());
        System.out.println(j3.getPuntosJugador2());


    }
}
