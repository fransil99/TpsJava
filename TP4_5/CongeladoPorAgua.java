package TP4_5;

import java.time.LocalDate;

public class CongeladoPorAgua extends ProductoRefrigerado {
    public double gramosSal;
    public int mlAgua;

    public CongeladoPorAgua(String nombre, int nroLote, LocalDate fechaVenc, LocalDate fechaEnvasado, String granjaOrigen, int codigoSupervision, double tempRecomendada,double gramosSal){
        super(nombre, nroLote, fechaVenc, fechaEnvasado, granjaOrigen, codigoSupervision, tempRecomendada);
        this.gramosSal = gramosSal;
        this.mlAgua = 1000;
    }

    @Override
    public String toString() {
        return super.toString()+" Gramos de sal por litro de agua: "+gramosSal*mlAgua;
    }

    public double getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(double gramosSal) {
        this.gramosSal = gramosSal;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
    }
}
