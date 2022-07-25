package poo.herencia.Productos;

public class Calzado extends Producto{
    private int talla;

   //Constructores
   public Calzado(){
        talla =0;
    }

    public Calzado(int talla){
        this.talla=talla;
    }

    public Calzado(int talla, int cod, int precio, int cantBodega, int cantMinBodega){
        super(cod, precio, cantBodega, cantMinBodega);
        this.talla=talla;
    }

    //Setters & Setters

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    
}
