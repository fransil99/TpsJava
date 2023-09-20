package TP2AgendaPersonal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario( "Pepe","p@gmail.com","249420",false);
        Reunion reunion1 = new Reunion("Salon 1","Candidato2023", LocalTime.of(14,30,0), 9);
        Agenda agenda1 = new Agenda(4);
        agenda1.agregarReunion(0,reunion1);
    }
}
