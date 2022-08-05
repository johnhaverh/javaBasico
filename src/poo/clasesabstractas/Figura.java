
package poo.clasesabstractas;

public abstract class Figura {
    private int color;
    
    public void cambiaColor(int color) {
        this.color = color;
    }
    
    public abstract void borra();
    public abstract void dibuja();
}
