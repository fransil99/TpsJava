package TP5_3;

public class Pastura extends Cereal{
    private int restriccion;

    public Pastura(String nombre,String tipoDeGrano,int restriccion){
        super(nombre, tipoDeGrano);
        this.restriccion = restriccion;
    }

    public int getRestriccion() {
        return restriccion;
    }

    public void setRestriccion(int restriccion) {
        this.restriccion = restriccion;
    }
}
