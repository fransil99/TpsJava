package TP2;

public class Dado {
    private int cantidadCaras;

    public Dado(){
        this(6);
    }
    public Dado (int cantidadCaras){
        this.setCantidadCaras(cantidadCaras);
    }

    public int tirar(){
        return (int) ((Math.random() * cantidadCaras) + 1);
    }

    public int getCantidadCaras() {
        return cantidadCaras;
    }

    public void setCantidadCaras(int cantidadCaras) {
        this.cantidadCaras = cantidadCaras;
    }


}
