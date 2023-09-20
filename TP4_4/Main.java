/*El contingente de la selección de fútbol de un país está formado tanto por futbolistas como
        por un cuerpo técnico. Cada integrante del contingente posee un nombre, apellido, número de
        pasaporte y fecha de nacimiento. Los futbolistas, además, poseen una posición, si es zurdo o
        derecho y la cantidad de goles convertidos. Los entrenadores poseen un identificador de la
        federación a la que pertenecen y los masajistas el título que poseen y la cantidad de años de
        experiencia.

        El sistema debe permitir conocer el estado de una persona. El estado puede ser “Viajando”,
        “En concentración”, “En país de origen”. Se debe poder saber si una persona está disponible
        o no para un evento solidario para recaudar fondos. Una persona estará disponible si está en
        el país de origen y no está concentrando para un partido.
        Nota: Una misma persona no comparte dos roles distintos, por ejemplo un técnico no puede
        ser futbolista, ni masajista.*/
package TP4_4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Integrante f1 = new Futbolista("fran","silva", 420,"en pais de origen", LocalDate.of(1999, 06,22),"derecho",69);
    Integrante m1 = new Masajista("pepe","masajes",7464,"viajando",LocalDate.of(1998,06,22),"masajista",32);
    Integrante e1 = new Entrenador("tito","nero",5234,"En concentracion",LocalDate.of(1957,06,23),846);
    }
}
