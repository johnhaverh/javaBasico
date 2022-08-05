package poo.clasesabstractas;

public class Curva extends Figura1D {
    private float radio;

    @Override
    public void borra() {
        System.out.println("Borra una Curva");
    }

    @Override
    public void dibuja() {
        System.out.println("Dibuja una Curva");
    }
}
