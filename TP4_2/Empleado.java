package TP4_2;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    public Empleado(String nombre,int legajo,double salario){
        this.setNombre(nombre);
        this.setLegajo(legajo);
        this.setSalario(salario);
    }

    public double getSalario(){
        return salario;
    }

    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
