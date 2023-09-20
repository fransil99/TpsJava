package TP5_2;

public class CasaEnemistad extends Casa {
    private Casa casaEnemiga;

    public CasaEnemistad(String nombre,int capacidadMaxima,Casa casaEnemiga){
        super(nombre, capacidadMaxima);
        this.casaEnemiga=casaEnemiga;
    }

    public boolean esAceptado(Alumno a){
        if(!a.getCualidades().containsAll(casaEnemiga.getCualidades()) && super.esAceptado(a)){//si no cumple con las cualidades de la enemiga pero si cumple con las propias se acepta
            return true;
        }
        return false;
    }
}
