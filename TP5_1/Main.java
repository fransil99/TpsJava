package TP5_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Libros l1 = new Libros("Cat in the bed.");
        Libros l2 = new Libros("Cat in the bed.");
        Libros l3 = new Libros("Cat in the bed.");


        Pila p1 = new Pila();
    p1.push(l1);
    p1.push(l2);
    p1.push(l3);

    System.out.println(p1);

    }
}
