package test;

import poo.clasesabstractas.Curva;
import poo.clasesabstractas.Segmento;

public class TestFigura {
    public static void main(String[] args) {
        Segmento s = new Segmento();
        
        s.borra();
        s.dibuja();
        
        Curva c = new Curva();
        c.borra();
        c.dibuja();
    }
}
