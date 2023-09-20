package TP2AgendaPersonal;

public class Agenda {
    //donde es la reunion, quien participa,tema que vana  tratar,duracion
    private Reunion[] reuniones;

    public Agenda(int reunion){
        this.reuniones = new Reunion[reunion];
    }
    public void agregarReunion(int pos,Reunion reunion){
        if(pos>=0&&pos< reuniones.length&&reunion!=null&&reuniones[pos]==null){
            this.reuniones[pos] = reunion;
        }
    }




    public Reunion[] getReuniones() {
        return reuniones;
    }

    public void setReuniones(Reunion[] reuniones) {
        this.reuniones = reuniones;
    }
}
