package TP2Deportivo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Usuario iniesta = new Usuario("Iniesta");

        Cancha canchaFutbol1 = new Cancha("futbol");

        Turno turno1 = new Turno (canchaFutbol1,iniesta, LocalDate.of(2023,8,21));
        Turno turno2 = new Turno (canchaFutbol1,iniesta, LocalDate.of(2023,8,20));
        Turno turno3 = new Turno (canchaFutbol1,iniesta, LocalDate.of(2023,8,19));
        Turno turno4 = new Turno (canchaFutbol1,iniesta, LocalDate.of(2023,8,17));

        /**El establecimiento tiene un registro de socios. Los socios
         son gratuitos y para serlo es necesario haber reservado un turno al menos 4 veces en los
         últimos dos meses. Si no se cumple dicha condición no se considera socio.**/
        System.out.println(iniesta.getReservasUltimosDosMeses());

        System.out.println(iniesta.isSocio());
    }

}
