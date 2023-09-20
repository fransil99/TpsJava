package TP4_2;

public class EmpleadoHorasExtra extends Empleado{
    private int cantHorasExtras;
    private double valorPorHoraExtra;

    public EmpleadoHorasExtra(String nombre, int legajo, double sueldo, int cantHorasExtras,double valorPorHoraExtra){
        super(nombre, legajo,sueldo);
        this.cantHorasExtras = cantHorasExtras;
        this.valorPorHoraExtra = valorPorHoraExtra;
    }

    @Override
    public double getSalario() {
        return super.getSalario()+(this.cantHorasExtras*this.valorPorHoraExtra);
    }
}
