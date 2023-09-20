package TP2ControlGastos;

public class Ciudad {
    private String nombre;
    private int habitantes, gastos;
    private Impuesto[] impuestos;

    public Ciudad(String nombre, int habitantes, int gastos,int cantImpuestos){
        this.setNombre(nombre);
        this.setHabitantes(habitantes);
        this.setGastos(gastos);
        this.impuestos = new Impuesto[cantImpuestos];
    }
//si lo recaudado es menor que el gasto tenes deficit
    public int calcularRecaudado(){
        int recaudado = 0;
        for (int i = 0; i < impuestos.length; i++) {
            recaudado+= impuestos[i].getRecaudacion();
        }
        return recaudado;
    }

    public boolean estaEnDeficit(){
        boolean deficit;
        if(calcularRecaudado() < this.getGastos()){
            deficit = true;
        }else {
            deficit = false;
        }
        return deficit;
    }

    public void agregarImpuesto(int pos, Impuesto impuesto){
        if(pos>=0&&pos< impuestos.length&&impuestos[pos]==null&&impuesto!=null){
            this.impuestos[pos] = impuesto;
        }
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public Impuesto[] getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Impuesto[] impuestos) {
        this.impuestos = impuestos;
    }
}
