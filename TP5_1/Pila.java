package TP5_1;

import java.util.ArrayList;

public class Pila {
    private ArrayList<Object> pila;

    public Pila(){
        this.pila = new ArrayList<>();
    }

    public void push(Object i){
        pila.add(i);
    }

    public void top(){
    pila.size();
    }

    public Object pop(){
        if(!pila.isEmpty()){
            int lastIndex = pila.size()-1;
            Object poppedElement = pila.get(lastIndex);
            pila.remove(lastIndex);
            return poppedElement;
        }else{
            throw new IllegalStateException("La lista está vacía. No se puede realizar pop en una lista vacía.");
        }
    }


}
