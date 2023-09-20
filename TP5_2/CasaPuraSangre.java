package TP5_2;

public class CasaPuraSangre extends Casa{
    public CasaPuraSangre(String nombre, int capacidadMaxima){
        super(nombre, capacidadMaxima);
    }
    public void agregarFamiliarACasa(Alumno familiar){
        if (familiar.getCasa().getNombre()==this.getNombre()){
            super.agregarFamiliarACasa(familiar);
        }
    }

    public boolean esAceptado(Alumno a){
        boolean familiarEnCasa = false;
        for (Alumno familiar : a.getFamiliares()) {
            if(familiar.getCasa() == this){
                familiarEnCasa = true;
            }
        }

        if(familiarEnCasa && super.esAceptado(a)){
            return true;
        }
        System.out.println(familiarEnCasa);
        return false;
    }
}
