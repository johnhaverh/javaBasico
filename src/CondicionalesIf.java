/*
 * Programa simple, uso de condicionales IF - ELSE - impresión de menú
 * John Herrera
 * Misión TIC 2022
 */

import java.util.Scanner;

public class CondicionalesIf {
    public static void main(String[] args) {
        System.out.print("*** MENU ***\n"
                + "1. Sumar" + "\n"
                + "2. Restar" + "\n"
                + "3. Dividir" + "\n"
                + "4. Multiplicar" + "\n"
                + "5. Salir" + "\n" + "\n"
                + "Opción? ");

        char opcion;
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextLine().charAt(0);
        teclado.close();

        if (opcion == '1') {
            System.out.println("Escogió Sumar\n");
        } else if (opcion == '2') {
            System.out.println("Escogió Restar\n");
        } else if (opcion == '3') {
            System.out.println("Escogió Dividir\n");
        } else if (opcion == '4') {
            System.out.println("Escogió Multiplicar\n");
        } else if (opcion == '5') {
            System.out.println("Fin del programa\n");
        } else {
            System.out.println("ERROR. Opción no válida.\n");
        }
    }
}
