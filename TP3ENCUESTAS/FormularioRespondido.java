package TP3ENCUESTAS;

import java.util.ArrayList;
import java.util.List;

    public class FormularioRespondido {
    private Persona encuestado;
    private int idFormulario;

    private List<String>  respuestas;

    public FormularioRespondido(Persona encuestado, int idFormulario){
        this.setEncuestado(encuestado);
        this.setIdFormulario(idFormulario);
        this.respuestas =  new ArrayList<String>();
    }

    public int getDocumentoDelEncuestado() {
        return encuestado.getDni();
    }

    public void setEncuestado(Persona encuestado) {
        this.encuestado = encuestado;
    }

    public int getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }
}
