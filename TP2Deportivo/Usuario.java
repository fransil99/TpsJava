package TP2Deportivo;

import java.time.LocalDate;
import java.time.Period;

public class Usuario {
    private int reservasUltimosDosMeses;
    private String nombre;
    private boolean socio;

    public Usuario(String nombre){
        this.setNombre(nombre);
        this.setReservasUltimosDosMeses(0);
    }

    public void verificarSocio(LocalDate fechaDeReserva){
        Period period = Period.between(fechaDeReserva,LocalDate.now());
        if(period.getMonths() < 2){
            reservasUltimosDosMeses++;
        }else{
            reservasUltimosDosMeses = 0;
        }
    }

    public int getReservasUltimosDosMeses() {
        return reservasUltimosDosMeses;
    }

    public void setReservasUltimosDosMeses(int reservasUltimosDosMeses) {
        this.reservasUltimosDosMeses = reservasUltimosDosMeses;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSocio() {
        if(reservasUltimosDosMeses >= 4){
            return socio = true;
        }
        return false;
    }


}
