package TP4_4;

import java.time.LocalDate;

public class Entrenador extends Integrante{
    private int idFederacion;
    public Entrenador(String nombre, String apellido, int nroPasaporte,String estado, LocalDate fechaNac, int idFederacion){
        super(nombre,apellido, nroPasaporte,estado,fechaNac);
        this.idFederacion = idFederacion;
    }

}
