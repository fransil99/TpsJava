package TP4_5;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco {
    private int codigoSupervision;
    private double tempRecomendada;

    public ProductoRefrigerado(String nombre, int nroLote, LocalDate fechaVenc, LocalDate fechaEnvasado, String granjaOrigen,int codigoSupervision, double tempRecomendada){
        super(nombre, nroLote, fechaVenc, fechaEnvasado, granjaOrigen);
        this.codigoSupervision = codigoSupervision;
        this.tempRecomendada = tempRecomendada;
    }

    @Override
    public String toString() {
        return super.toString()+" Codigo de Supervision: "+codigoSupervision+" Temperatura Recomendada: ";
    }

    public int getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(int codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public double getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(double tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
}
