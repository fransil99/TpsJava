package TP3ENCUESTAS;

public class Persona {
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni){
        this.setNombre(nombre);
        this.setDni(dni);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
