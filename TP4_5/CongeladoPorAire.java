package TP4_5;

import java.time.LocalDate;

public class CongeladoPorAire extends ProductoRefrigerado {
    private double porcentaejeNitrogeno;
    private double porcentaejeOxigeno;
    private double porcentaejeDioxidoCarbono;
    private double porcentaejeVaporAgua;

    public CongeladoPorAire(String nombre, int nroLote, LocalDate fechaVenc, LocalDate fechaEnvasado, String granjaOrigen, int codigoSupervision, double tempRecomendada , double porcentaejeNitrogeno, double porcentaejeOxigeno, double porcentaejeDioxidoCarbono, double porcentaejeVaporAgua){
        super(nombre, nroLote, fechaVenc, fechaEnvasado, granjaOrigen, codigoSupervision, tempRecomendada);
        this.porcentaejeNitrogeno = porcentaejeNitrogeno;
        this.porcentaejeDioxidoCarbono = porcentaejeDioxidoCarbono;
        this.porcentaejeOxigeno = porcentaejeOxigeno;
        this.porcentaejeVaporAgua = porcentaejeVaporAgua;
    }

    @Override
    public String toString() {
        return super.toString()+" % Nitrogeno: "+porcentaejeNitrogeno+" % DioxidoDeCarbono: "+porcentaejeDioxidoCarbono+" % Oxigeno: "+porcentaejeOxigeno+" % VaporAgua "+porcentaejeVaporAgua;
    }

    public double getPorcentaejeNitrogeno() {
        return porcentaejeNitrogeno;
    }

    public void setPorcentaejeNitrogeno(double porcentaejeNitrogeno) {
        this.porcentaejeNitrogeno = porcentaejeNitrogeno;
    }

    public double getPorcentaejeOxigeno() {
        return porcentaejeOxigeno;
    }

    public void setPorcentaejeOxigeno(double porcentaejeOxigeno) {
        this.porcentaejeOxigeno = porcentaejeOxigeno;
    }

    public double getPorcentaejeDioxidoCarbono() {
        return porcentaejeDioxidoCarbono;
    }

    public void setPorcentaejeDioxidoCarbono(double porcentaejeDioxidoCarbono) {
        this.porcentaejeDioxidoCarbono = porcentaejeDioxidoCarbono;
    }

    public double getPorcentaejeVaporAgua() {
        return porcentaejeVaporAgua;
    }

    public void setPorcentaejeVaporAgua(double porcentaejeVaporAgua) {
        this.porcentaejeVaporAgua = porcentaejeVaporAgua;
    }
}
