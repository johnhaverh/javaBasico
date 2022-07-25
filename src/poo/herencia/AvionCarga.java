package poo.herencia;


public class AvionCarga extends Avion{
    private float peso;
    

    // CONSTRUCTORES
    public AvionCarga() {
        setAlas(0);
        setCabinas(0);
        peso = 0.0f;
        System.out.println("*** Constructor AvionCarga()");
    }

    public AvionCarga(int peso) {
        setAlas(0);
        setCabinas(0);
        this.peso = peso;
        System.out.println("*** Constructor AvionCarga(int peso)");
    }

    public AvionCarga(int alas, int cabinas) {
        setAlas(alas);
        setCabinas(cabinas);
        this.peso = 0.0f;
        System.out.println("*** Constructor AvionCarga(int alas, int cabinas)");
    }

    public AvionCarga(int alas, int cabinas, int peso) {
        super(alas, cabinas);
        this.peso = peso;
        System.out.println("*** Constructor AvionCarga(int alas, int cabinas, int peso)");
    }

    //getters & setters


    public float getPeso() {
        return peso;
    }
 
    public void setPeso(float peso) {
        this.peso = peso;
    }


    //Metodos

    public void validarPeso(){
        System.out.println("Validar peso");
    }

    @Override
    public void despegar(){
        System.out.println("Despegar avión de carga");
    }

    @Override
    public float calcularPeso(){
        return super.calcularPeso() + peso;
    }

    public float calcularPeso(float pesoAdional){
        return super.calcularPeso() + peso + pesoAdional;
    }

    public float calcularPeso(int motoresAdicionales){
        return super.calcularPeso() + peso + motoresAdicionales * 600;
    }


}
