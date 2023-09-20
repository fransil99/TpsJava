package TP4_5;

import java.time.LocalDate;

public class CongeladoPorNitrogeno extends ProductoRefrigerado {
    private String metodoCongelacion;
    private double segundosEnCongelacion;

    public CongeladoPorNitrogeno(String nombre, int nroLote, LocalDate fechaVenc, LocalDate fechaEnvasado, String granjaOrigen, int codigoSupervision, double tempRecomendada, String metodoCongelacion, double segundosEnCongelacion){
        super(nombre, nroLote, fechaVenc, fechaEnvasado, granjaOrigen, codigoSupervision, tempRecomendada);
        this.metodoCongelacion = metodoCongelacion;
        this.segundosEnCongelacion = segundosEnCongelacion;
    }

    @Override
    public String toString() {
        return super.toString()+" Metodo empleado: "+metodoCongelacion+" Segundos en congelacion: "+segundosEnCongelacion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public double getSegundosEnCongelacion() {
        return segundosEnCongelacion;
    }

    public void setSegundosEnCongelacion(double segundosEnCongelacion) {
        this.segundosEnCongelacion = segundosEnCongelacion;
    }
}
