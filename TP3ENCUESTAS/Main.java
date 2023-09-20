package TP3ENCUESTAS;

public class Main {
    public static void main(String[] args) {

        Formulario f1 = new Formulario(3);
        f1.agregarPregunta("Que gusto tiene la sal");
        Persona encuestado1 = new Persona("Enrique", 123321);

        FormularioRespondido fr1 = new FormularioRespondido(encuestado1,3);


        Empleado empleado1 = new Empleado("Kevin");

        Encuesta encuesta1 = new Encuesta(empleado1, encuestado1, f1,fr1);

        Encuesta encuesta2 = new Encuesta(empleado1, encuestado1,f1,fr1);

        Compania compania = new Compania ("Stranger Things");
        compania.agregarEmpleado(empleado1);

        compania.agregarEncuesta(encuesta1);
        compania.agregarEncuesta(encuesta1);
        System.out.println(empleado1.getCantEncuestasRealizadas());

        System.out.println(empleado1.getCantEncuestasRealizadas());


    }
}
