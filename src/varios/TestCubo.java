package varios;

/*
 Introducción Java - clases 
 John Herrera
 Clase para probar la clase cubo (calculo volumen)
*/

import java.util.Scanner;

public class TestCubo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el valor para la altura: ");
        int alto = entrada.nextInt();

        System.out.print("Ingresa el valor para el ancho: ");
        int ancho = entrada.nextInt();

        System.out.print("Ingresa el valor para la profundidad: ");
        int profundidad = entrada.nextInt();

        Cubo cubo = new Cubo(alto, ancho, profundidad);

        int volumen = cubo.calcularVolumen();
        System.out.println("Volumen: " + volumen);

        entrada.close();
    }
}
