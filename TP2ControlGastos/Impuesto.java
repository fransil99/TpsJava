package TP2ControlGastos;

public class Impuesto {
    String nombre;
    double recaudacion;

    public Impuesto (String nombre, double recaudacion){
        this.setNombre(nombre);
        this.setRecaudacion(recaudacion);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

}