package TP5_2;

import java.util.ArrayList;

public class Casa {
    private String nombre;
    private int capacidadMaxima;
    private ArrayList<String> cualidadesNecesarias;
    private ArrayList<Alumno> alumnos;
    private int  cantidadAlumnos;

public Casa(String nombre, int capacidadMaxima){
    this.nombre =  nombre;
    this.capacidadMaxima = capacidadMaxima;
    this.cualidadesNecesarias = new ArrayList<>();
    this.alumnos = new ArrayList<>();
    this.cantidadAlumnos = 0;
}

public void agregarCualidad(String c){
    cualidadesNecesarias.add(c.toLowerCase());
}

    public void  agregarAlumno(Alumno alumnoAIngresar){
        if(cantidadAlumnos<capacidadMaxima && esAceptado(alumnoAIngresar)){
            alumnos.add(alumnoAIngresar);
            cantidadAlumnos++;
            alumnoAIngresar.setCasa(this);
        }
        else{
            System.out.println("el alumno no cumple con las condiciones necesarias");
        }
    }

    public boolean esAceptado(Alumno alumnoAIngresar){
        if(alumnoAIngresar.getCualidades().containsAll(cualidadesNecesarias)&& alumnoAIngresar.getCasa()==null){
            return true;
        }else return false;
    }

    public void agregarFamiliarACasa(Alumno f){
        alumnos.add(f);
        cantidadAlumnos++;
    }

    public String toString(){
        return " casa: "+nombre+ "\n alumnos: "+ cantidadAlumnos;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ArrayList<String> getCualidades() {
        return cualidadesNecesarias;
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidadesNecesarias = cualidades;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
