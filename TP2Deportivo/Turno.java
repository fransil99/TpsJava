package TP2Deportivo;

import java.time.LocalDate;

public class Turno {
    private Cancha cancha;
    private Usuario usuario;
    private LocalDate fechaReserva;
    public Turno (Cancha cancha, Usuario usuario,LocalDate fechaDeReserva){
        this.setCancha(cancha);
        this.setUsuario(usuario);
        this.setFechaReserva(fechaDeReserva);
        usuario.verificarSocio(fechaDeReserva);
        if(usuario.isSocio()){
            cancha.setPrecio(0.1);
        }
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
