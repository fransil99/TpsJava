package TP2;
    public class Juego2 {
        private Jugador jugador1;
        private Jugador jugador2;
        private Dado dado1;
        private Dado dado2;
        private int minimoPuntos;
        private int cantidadRondas;

        public Juego2(Jugador j1,Jugador j2,Dado d1, Dado d2, int cantidadRondas, int minimoPuntos){
            jugador1 = j1;
            jugador2 = j2;
            this.dado1 = d1;
            this.dado2 = d2;
            this.setMinimoPuntos(minimoPuntos);
            this.setCantidadRondas(cantidadRondas);
        }

        public Jugador getJugador1() {
            return jugador1;
        }


        public Jugador getJugador2() {
            return jugador2;
        }

        public int getPuntosJugador1() {
            return jugador1.getPuntos();
        }

        public int getPuntosJugador2() {
            return jugador2.getPuntos();
        }

        public void setMinimoPuntos(int minimoPuntos) {
            this.minimoPuntos = minimoPuntos;
        }
        public void setCantidadRondas(int cantidadRondas) {
            this.cantidadRondas = cantidadRondas;
        }

        public Jugador ganador() {
            if (jugador1.getPuntos() > jugador2.getPuntos()) {
                return jugador1;
            } else if (jugador1.getPuntos() < jugador2.getPuntos()) {
                return jugador2;
            } else {
                return null;
            }

        }

        public Jugador jugar() {
            int puntos1;
            int puntos2;
            for (int i = 0; i < cantidadRondas; i++) {
                puntos1 = jugador1.tirarDados(dado1, dado2);
                puntos2 = jugador2.tirarDados(dado1,dado2);
                if ((puntos1 > minimoPuntos) && (puntos1 > puntos2)) {
                    jugador1.sumarPunto();

                } else if ((puntos2 > minimoPuntos) && (puntos2 > puntos1)) {
                    jugador2.sumarPunto();
                }
            }
            return this.ganador();
        }


    }
