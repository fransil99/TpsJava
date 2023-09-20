package TP3ENCUESTAS;

import java.util.List;
import java.util.ArrayList;

public class Compania {
    private String nombre;
    private List <FormularioRespondido> personasEncuestadas;
    private List <Empleado> empleados;
    private List <Encuesta> encuestas;

    public Compania(String nombre){
        this.setNombre(nombre);
        this.personasEncuestadas = new ArrayList<FormularioRespondido>();
        this.empleados = new ArrayList<Empleado>();
        this.encuestas = new ArrayList<Encuesta>();
    }


    public void agregarEncuesta(Encuesta encuesta){
        // si la encuesta no esta vacia, ni tampoco la completo persona1,
        boolean estaEntrevistado = false;
        for (FormularioRespondido f: personasEncuestadas) {
            if(f.getDocumentoDelEncuestado() == encuesta.getEncuestado().getDni() && encuesta.getFormulario().getId() == f.getIdFormulario()){
                estaEntrevistado = true;
                break;
            }
        }
        if(!estaEntrevistado) {
            System.out.println("Creada");
            personasEncuestadas.add(encuesta.getFormularioRespondido());
            encuestas.add(encuesta);
            encuesta.getEmpleado().sumarEncuesta();
        }
    }

    public void agregarEmpleado(Empleado empleado){
        if(empleado != null)
            empleados.add(empleado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
