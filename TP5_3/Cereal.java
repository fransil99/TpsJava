package TP5_3;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private String tipoDeCosecha;
    private ArrayList<String> minerales;

    public Cereal(String nombre, String tipoDeCosecha){
        this.nombre = nombre;
        this.tipoDeCosecha = tipoDeCosecha;
        this.minerales = new ArrayList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeCosecha() {
        return tipoDeCosecha;
    }

    public void setTipoDeCosecha(String tipoDeCosecha) {
        this.tipoDeCosecha = tipoDeCosecha;
    }
}
