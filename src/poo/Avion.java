package poo;

public class Avion {
    private int alas;
    private int cabinas;

    //Constructores

    
    //Setters
    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setCabinas(int cabinas) {
        this.cabinas = cabinas;
    }

    //Getters

    public int getAlas() {
        return alas;
    }

    public int getCabinas() {
        return cabinas;
    }

    //metodos

    public void Despegar(){
        System.out.println("Despegar un avión");
    }

    public void Aterrizar(){
        System.out.println("aterrizar un avión");
    }
    
}
