package TP5_3;

import java.util.ArrayList;

public class Lote {
    private ArrayList<String> minerales;
    private int superficie;

    public Lote(int superficie){
        this.superficie = superficie;
        this.minerales = new ArrayList<>();
    }

    public ArrayList<String> getMinerales() {
        return minerales;
    }

    public void setMinerales(ArrayList<String> minerales) {
        this.minerales = minerales;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
}
