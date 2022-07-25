package test;

import poo.herencia.Aviones.AvionCarga;
import poo.herencia.Aviones.AvionComercial;
import poo.herencia.Aviones.AvionGuerra;

public class TestAvion {
    public static void main(String[] args) {
        
        AvionGuerra aGuerra = new AvionGuerra();
        aGuerra.setAlas(4);
        aGuerra.despegar();
        aGuerra.disparar();
        aGuerra.aterrizar();
        System.out.println("Alas avión de guerra" + aGuerra.getAlas());

        AvionCarga aCarga = new AvionCarga();
        aCarga.setAlas(2);
        aCarga.despegar();
        aCarga.validarPeso();
        aCarga.aterrizar();
        System.out.println("Alas avión de carga" + aCarga.getAlas());

        AvionComercial aComercial = new AvionComercial();
        aComercial.setAlas(2);
        aComercial.despegar();
        aComercial.darRefrigerios();
        aComercial.aterrizar();
        System.out.println("Alas avión de carga" + aComercial.getAlas());

        //otro avión 
        int peso = 5000;
        int alas = 2;
        int cabinas = 1;

        AvionCarga aCarga2 = new AvionCarga(alas, cabinas);
        System.out.println("Peso: " + aCarga2.getPeso());

        //otro avión

        AvionCarga aCarga3 = new AvionCarga(alas, cabinas, peso);
        System.out.println("Peso: " + aCarga3.getPeso());
    }
    
}
