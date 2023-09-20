package TP3ENCUESTAS;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
    private int id;
    private List<String> preguntas;

    public Formulario(int id){
        this.setId(id);
        this.preguntas = new ArrayList<String>();
    }

    public void agregarPregunta(String pregunta){
        if(pregunta != null){
            preguntas.add(pregunta);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<String> preguntas) {
        this.preguntas = preguntas;
    }
}
