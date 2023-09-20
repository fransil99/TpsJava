package TP4_4;

import java.time.LocalDate;

public class Futbolista extends Integrante {
    private String pieHabil;
    private int cantGoles;

    public Futbolista(String nombre, String apellido, int nroPasaporte,String estado, LocalDate fechaNac, String pieHabil, int cantGoles){
       super(nombre, apellido, nroPasaporte,estado,fechaNac);
       this.pieHabil = pieHabil;
       this.cantGoles = cantGoles;
    }


    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
}
