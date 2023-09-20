package TP4_5;

import java.time.LocalDate;

public class ProductoFresco extends Producto {
    private String granjaOrigen;

    public ProductoFresco(String nombre,int nroLote, LocalDate fechaVenc, LocalDate fechaEnvasado,String granjaOrigen){
        super(nombre, nroLote, fechaVenc, fechaEnvasado);
        this.granjaOrigen = granjaOrigen;
    }

    @Override
    public String toString() {
        return super.toString()+" Granja de Origen: "+granjaOrigen;
    }

    public String getGranjaOrigen() {
        return granjaOrigen;
    }

    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }
}
