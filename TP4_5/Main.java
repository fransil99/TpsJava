package TP4_5;

import java.time.LocalDate;

/*Una empresa encargada de la comercialización de productos avícolas trabaja con tres tipos de
        productos: productos frescos (huevos de gallina blancos y de color, huevos de codorniz, etc),
        productos refrigerados (pollos frescos, milanesas de pollo, de cerdo y de ternera, pollo
        arrollado, chorizos de cerdo, etc) y productos congelados (hamburguesas, papas fritas,
        arvejas, granos de maíz, formas de pollo rebozadas, etc.). Todos los productos llevan esta
        información común: fecha de vencimiento y número de lote. A su vez, cada tipo de producto
        lleva alguna información específica.
    Los productos frescos deben llevar la fecha de envasado y la granja de origen.
    Los productos refrigerados deben llevar el código del organismo de supervisión alimentaria, la fecha de envasado, la temperatura de mantenimiento
    recomendada y la granja de origen.
    Los productos congelados deben llevar la fecha de envasado, el código del organismo de supervisión alimentaria, la granja de origen y la
    temperatura de mantenimiento recomendada.

        Hay tres tipos de productos congelados: congelados por aire, congelados por agua y
        congelados por nitrógeno. Los productos congelados por aire deben llevar la información de
        la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido
        de carbono y % de vapor de agua). Los productos congelados por agua deben llevar la
        información de la salinidad del agua con que se realizó la congelación en gramos de sal por
        litro de agua. Los productos congelados por nitrógeno deben llevar la información del método
        de congelación empleado y del tiempo de exposición al nitrógeno expresada en segundos.
        Implementar los métodos necesarios para obtener cada uno de los atributos de un producto.
        Implementar un método que permita obtener la etiqueta de un producto (un String con la
        combinación de los atributos).*/
public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Whey Protein",1234, LocalDate.of(2025,05,25),LocalDate.of(2023, 8,7));
        Producto pf1 = new ProductoFresco("Pan Lactal",128,LocalDate.of(2025,05,25),LocalDate.of(2023, 8,7),"Granja los pibardos");
        Producto pr1 = new ProductoRefrigerado("Papas Smile", 123,LocalDate.of(2025,05,25),LocalDate.of(2023, 8,7),"Granja los pibardos",24345,24);
        Producto pca1 = new CongeladoPorAgua("Papas Smile", 123,LocalDate.of(2025,05,25),LocalDate.of(2023, 8,7),"Granja los pibardos",24345,24,20);
        Producto pcai1 = new CongeladoPorAire("Papas Smile", 123,LocalDate.of(2025,05,25),LocalDate.of(2023, 8,7),"Granja los pibardos",24345,24,40,30,30,50);
        Producto pcn1 = new CongeladoPorNitrogeno("Papas Smile", 123,LocalDate.of(2025,05,25),LocalDate.of(2023, 8,7),"Granja los pibardos",24345,24,"Freezer Loco",2000);
    }
}
