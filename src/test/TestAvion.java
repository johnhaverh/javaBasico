package test;

import poo.AvionCarga;
import poo.AvionComercial;
import poo.AvionGuerra;

public class TestAvion {
    public static void main(String[] args) {
        
        AvionGuerra aGuerra = new AvionGuerra();
        aGuerra.setAlas(4);
        aGuerra.Despegar();
        aGuerra.Disparar();
        aGuerra.Aterrizar();
        System.out.println("Alas avión de guerra" + aGuerra.getAlas());

        AvionCarga aCarga = new AvionCarga();
        aCarga.setAlas(2);
        aCarga.Despegar();
        aCarga.ValidarPeso();
        aCarga.Aterrizar();
        System.out.println("Alas avión de carga" + aCarga.getAlas());

        AvionComercial aComercial = new AvionComercial();
        aComercial.setAlas(2);
        aComercial.Despegar();
        aComercial.DarRefrigerios();
        aComercial.Aterrizar();
        System.out.println("Alas avión de carga" + aComercial.getAlas());
    }
    
}
