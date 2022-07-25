package poo.herencia.Productos;

public class PrendaVestir extends Producto{
    private String talla;
    private boolean planchado;

    //Constructores
    public PrendaVestir(){
        talla ="";
        planchado=false;
    }

    public PrendaVestir(String talla, boolean planchado){
        this.talla=talla;
        this.planchado=planchado;
    }

    public PrendaVestir(String talla, boolean planchado,int cod, int precio, int cantBodega, int cantMinBodega){
        super(cod, precio, cantBodega, cantMinBodega);
        this.talla=talla;
        this.planchado=planchado;
    }

    //Setters & Setters

    public String getTalla() {
        return talla;
    }

    public boolean isPlanchado() {
        return planchado;
    }

    public void setPlanchado(boolean planchado) {
        this.planchado = planchado;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
}
