package TP2;

public class Juego1 {
    private int puntosJugador1;
    private int puntosJugador2;
    private int cantidadCaras;
    private int minimoPuntos;
    private int cantidadRondas;


    public Juego1() {
        this(7);
    }

    public Juego1(int minimoPuntos) {
        this(minimoPuntos, 6);

    }

    public Juego1(int minimoPuntos, int cantidadCaras) {
        this(minimoPuntos, cantidadCaras, 10);
    }

    public Juego1(int minimoPuntos, int cantidadCaras, int cantidadRondas) {
        this.puntosJugador1 = 0;
        this.puntosJugador1 = 0;
        this.setMinimoPuntos(minimoPuntos);
        this.setCantidadCaras(cantidadCaras);
        this.setCantidadRondas(cantidadRondas);
    }


    public int getPuntosJugador1() {
        return puntosJugador1;
    }

    public int getPuntosJugador2() {
        return puntosJugador2;
    }

    public void setCantidadCaras(int cantidadCaras) {
        this.cantidadCaras = cantidadCaras;
    }
    public void setCantidadRondas(int cantidadRondas) {
        this.cantidadRondas = cantidadRondas;
    }

    public void setMinimoPuntos(int minimoPuntos) {
        this.minimoPuntos = minimoPuntos;
    }

    private int tirarDados() {
        return (int) ((Math.random() * cantidadCaras) + 1);
    }

    public String ganador() {
        if (puntosJugador1 > puntosJugador2) {
            return "Jugador 1 gana";
        } else if (puntosJugador2 > puntosJugador1) {
            return "Jugador 2 gana";
        } else {
            return "Empate";
        }

    }

    public String jugar() {
        int puntos1;
        int puntos2;
        for (int i = 0; i < 10; i++) {
            puntos1 = this.tirarDados() + this.tirarDados();
            puntos2 = this.tirarDados() + this.tirarDados();
            if ((puntos1 > minimoPuntos) && (puntos1 > puntos2)) {
                puntosJugador1++;

            } else if ((puntos2 > minimoPuntos) && (puntos2 > puntos1)) {
                puntosJugador2++;
            }
        }
        return this.ganador();
    }


}
