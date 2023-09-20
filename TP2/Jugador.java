package TP2;

public class Jugador {
    private int puntos;
    private String nombre;


    public Jugador(String nombre) {
        this.setNombre(nombre);
    }
    public int tirarDados(Dado d1,Dado d2){
        return d1.tirar()+d2.tirar();
    }

    public void sumarPunto(){
        this.puntos++;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = this.nombre;
    }
}
