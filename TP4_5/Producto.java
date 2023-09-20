package TP4_5;

import com.sun.management.UnixOperatingSystemMXBean;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private int nroLote;
    private LocalDate fechaVenc;
    private LocalDate fechaEnvasado;

    public Producto(String nombre,int nroLote, LocalDate fechaVenc,LocalDate fechaEnvasado){
        this.nombre = nombre;
        this.nroLote = nroLote;
        this.fechaVenc = fechaVenc;
        this.fechaEnvasado = fechaEnvasado;
    }

    public String toString(){
        return "Nombre: "+nombre+" Fecha Vencimiento: "+fechaVenc+" Numero Lote: "+nroLote+" Fecha Envasado: "+fechaEnvasado;
    }


    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaDeVen(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
}
