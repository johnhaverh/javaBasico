/*
 * Introducción Java - clases 
 * John Herrera
 * Misión TIC 2022
 * Crear una clase y el programa para la gestión de cuentas corrientes
 */

package poo;

public class CuentaCorriente {
    // Atributos
    int numero;
    String nombre;
    float saldo;

    // constructor

    // Metodo
    void depositar(float dinero) {
        saldo = saldo + dinero;
    }

    void girar(float dinero) {
        saldo = saldo - dinero;
    }

    void consultar() {
        System.out.println("Numero de la cuenta: " + numero);
        System.out.println("Nombre de la cuenta: " + nombre);
        System.out.println("Saldo de la cuenta: " + saldo);
    }

    public static void main(String[] args) {
            // Crear las instancias a y b
            CuentaCorriente a = new CuentaCorriente ();
            // LLenando los atributos de a
            a.consultar();
            System.out.println("-----------------------");
            a.numero = 1234;
            a.nombre = "Juan";
            a.saldo = 350000;

            CuentaCorriente b = new CuentaCorriente ();
            // LLenando los atributos de a
            b.numero = 9876;
            b.nombre = "Maria";
            b.saldo = 450600;

            // Accediendo a los metodos de a y b
            a.consultar();
            b.consultar();

            a.depositar(100000);
            b.girar(50000);

            System.out.println("-----------------------");
            a.consultar();
            b.consultar();

    }

}