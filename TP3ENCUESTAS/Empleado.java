package TP3ENCUESTAS;

public class Empleado {
    private String nombre;
    private int cantEncuestasRealizadas;

    public Empleado(String nombre){
        this.setNombre(nombre);
        this.cantEncuestasRealizadas = 0;
    }

    public void sumarEncuesta(){
        cantEncuestasRealizadas++;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantEncuestasRealizadas() {
        return cantEncuestasRealizadas;
    }

    public void setCantEncuestasRealizadas(int cantEncuestasRealizadas) {
        this.cantEncuestasRealizadas = cantEncuestasRealizadas;
    }
}
