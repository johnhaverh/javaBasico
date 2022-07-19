/*
 * Introducción Java - clases 
 * John Herrera
 * Clase para calcular el volumen de un cubo
 */

package varios;

public class Cubo {
    int alto=0;
    int ancho=0;
    int profundidad=0;

    Cubo (int alto, int ancho, int profundidad){
        this.alto = alto;
        this.ancho=ancho;
        this.profundidad=profundidad;
    }

    public int calcularVolumen(){
        return alto * ancho * profundidad;
    }
}