package TP5_2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private Casa casa;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
        this.casa = null;
    }


    public void agregarCualidad(String c){
        cualidades.add(c.toLowerCase());
    }
    public void agregarFamiliar(Alumno f){
        familiares.add(f);
    }

    public String toString(){
        return " nombre: "+ nombre+"\n casa: " +casa;
    }

    public ArrayList<Alumno> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(ArrayList<Alumno> familiares) {
        this.familiares = familiares;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public void setCualidades(ArrayList<String> cualidades) {
        this.cualidades = cualidades;
    }


    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getCualidades() {
        return cualidades;
    }

}
