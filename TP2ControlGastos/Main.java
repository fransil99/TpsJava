package TP2ControlGastos;

/**3 Sistema de Control de Gastos Públicos
 Un país tiene que controlar el gasto público de las ciudades con más de 100.000
 habitantes. Para ello, tiene información del monto recaudado por cada ciudad a través de
 cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e
 imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. Este
 país necesita un sistema que le informe cuales son las ciudades que gastan más de lo
 que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición
 de déficit.
 Consejo: Tener en cuenta la información que contienen los distintos impuestos
 Extra: ¿En que afecta el tamaño de la ciudad? **/
public class Main {
    public static void main(String[] args) {
        Impuesto imp1 = new Impuesto("imp1",400000);
        Impuesto imp2 = new Impuesto("imp1",150000);
        Impuesto imp3 = new Impuesto("imp1",500000);
        Impuesto imp4 = new Impuesto("imp1",350000);
        Impuesto imp5 = new Impuesto("imp1",250000);
        Ciudad tandil = new Ciudad ("Tandil", 45000,1000000,5);
        Ciudad trenqueLauquen = new Ciudad ("Trenque Lauquen", 5000,5000000,5);
        Provincia buenosAires = new Provincia("Buenos Aires", 40);
        Pais argentina = new Pais("Argentina",24);
    }
}
