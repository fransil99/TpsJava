package TP4_4;
import java.time.LocalDate;
public class Masajista extends Integrante{
    private String titulo;
    private int aniosExp;
    public Masajista(String nombre, String apellido, int nroPasaporte,String estado,LocalDate fechaNac,String titulo, int aniosExp){
        super(nombre, apellido, nroPasaporte,estado, fechaNac);
        this.titulo = titulo;
        this.aniosExp = aniosExp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }
}
