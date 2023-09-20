package TP2Deportivo;

public class Cancha {
    private String deporte;
    private double precio;


    public Cancha(String deporte) {
        this.setDeporte(deporte);
        if(deporte == "futbol"){
            this.precio = 400;
        } else if (deporte == "paddle") {
            this.precio = 100;
        }
    }
    public void aplicarDescuento(double descuento){
        this.precio = (this.precio - (this.precio*descuento));
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        if (deporte == "futbol") {
            this.deporte = "futbol";
        } else if (deporte == "paddle") {
            this.deporte = "paddle";
        }
    }

}