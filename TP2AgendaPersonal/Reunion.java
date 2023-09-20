package TP2AgendaPersonal;

import TP2real.Episodio;

import java.time.LocalTime;
import java.util.Date;

public class Reunion {
    private String lugar, tema;
    private LocalTime horario;
    private Usuario[] usuarios;

    public Reunion(String lugar, String tema, LocalTime horario,int usuarios) {
        this.setLugar(lugar);
        this.setTema(tema);
        this.setHorario(horario);
        this.usuarios = new Usuario[usuarios];
    }

    public void agregarUsuario(int pos, Usuario usuario){
        if(pos>=0&&pos<usuarios.length&&usuario != null && usuarios[pos] == null){
            usuarios[pos] = usuario;
        }
    }
    public void editarUsuario(int pos, Usuario usuario){
        if(pos>=0&&pos<usuarios.length&&usuario != null && usuarios[pos] != null){
            usuarios[pos] = usuario;
        }
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
}
