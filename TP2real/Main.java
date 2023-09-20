package TP2real;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Episodio ep1 = new Episodio("Ozymnadias","GOD",true,5);
        Episodio ep2 = new Episodio("Ozymnadi","GO",true,4);
        Episodio ep3 = new Episodio("Ozymnad","G",true,1);
        Episodio ep4 = new Episodio("Ozymna","x",true,3);


        Temporada temporada1 = new Temporada("t1",5);




        Serie serie = new Serie("Br Bad","Best Serie Ever","Vince Gilligan","Meth Drama", 6);

        serie.agregarTemporada(1,temporada1);
        temporada1.agregarEpisodio(0,ep1);

        System.out.println(Arrays.toString(serie.getTemporadas()));
        System.out.println(Arrays.toString(temporada1.getEpisodios()));


    }
}
