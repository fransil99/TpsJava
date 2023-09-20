package TP4_4;

import java.time.LocalDate;

public class Integrante {
    private String nombre, apellido;
    private int nroPasaporte;
    private String estado;
    private LocalDate fechaNac;

    public Integrante(String nombre, String apellido, int nroPasaporte,String estado, LocalDate fechaNac){
        if(estado.equalsIgnoreCase("viajando") || estado.equalsIgnoreCase("en pais de origen") || estado.equalsIgnoreCase("en concentracion")){
        this.nombre = nombre;
        this.nroPasaporte = nroPasaporte;
        this.fechaNac = fechaNac;
        }
    }
//obtener si esta en pais de origen
    public boolean estaDisponible(){
        return estado.equalsIgnoreCase("en pais de origen");
    }
//obtener el estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNroPasaporte() {
        return nroPasaporte;
    }

    public void setNroPasaporte(int nroPasaporte) {
        this.nroPasaporte = nroPasaporte;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
}
