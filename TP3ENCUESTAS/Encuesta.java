package TP3ENCUESTAS;

import java.util.ArrayList;
import java.util.List;

public class Encuesta {
    private Empleado empleado;
    private Persona encuestado;
    private Formulario formulario;
    private FormularioRespondido formularioRespondido;

    public Encuesta(Empleado empleado,Persona encuestado,Formulario formulario,FormularioRespondido formularioRespondido){
        this.setEmpleado(empleado);
        this.setEncuestado(encuestado);
        this.setFormulario(formulario);
        if(formularioRespondido.getDocumentoDelEncuestado() == encuestado.getDni() && formularioRespondido.getIdFormulario() == formulario.getId()){
            this.setFormularioRespondido(formularioRespondido);
        }else{
            System.out.println("fsemen");
        }
    }

    public FormularioRespondido getFormularioRespondido() {
        return formularioRespondido;
    }

    public void setFormularioRespondido(FormularioRespondido formularioRespondido) {
        this.formularioRespondido = formularioRespondido;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public Persona getEncuestado() {
        return encuestado;
    }

    public void setEncuestado(Persona encuestado) {
        this.encuestado = encuestado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

}
