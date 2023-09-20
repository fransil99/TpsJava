package TP4_2;

public class EmpleadoComision extends Empleado{
    private int cantVentasRealiz;
    private double extraPorVenta;


    public EmpleadoComision(String nombre, int legajo, double salario, int cantVentasRealiz, double extraPorVenta) {
        super(nombre, legajo, salario);
        this.cantVentasRealiz = cantVentasRealiz;
        this.extraPorVenta = extraPorVenta;
    }

    public double getSalario(){
        return super.getSalario()+(this.cantVentasRealiz*this.extraPorVenta);
    }
}
