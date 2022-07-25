package poo.herencia;

public class Avion {
    private int alas;
    private int cabinas;
    private int peso;

    //Constructores
    public Avion() {
        alas = 0;
        cabinas = 0;
        System.out.println("** Constructor Avion()");
    }

    public Avion(int alas, int cabinas) {
        this.alas = alas;
        this.cabinas = cabinas;
        System.out.println("** Constructor Avion(int alas, int cabinas)");
    }
    
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

    public void despegar(){
        System.out.println("Despegar un avión");
    }

    public void aterrizar(){
        System.out.println("aterrizar un avión");
    }

    public float calcularPeso(){
        return alas * 2000 + cabinas * 500;
    }
    
}
