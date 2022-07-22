package poo;


public class AvionCarga extends Avion{
    private float peso;
    
    public void ValidarPeso(){
        System.out.println("Validar peso");
    }

    @Override
    public void Despegar(){
        System.out.println("Despegar avión de carga");
    }
    
}
