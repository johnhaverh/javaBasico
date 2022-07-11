/*
 * Programa simple, uso de condicionales Switch - impresión de menú
 * John Herrera
 * Misión TIC 2022
 */

import java.util.Scanner;

public class CondicionalesSwitch {
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

        switch (opcion) {
            case '1':
                System.out.println("Escogió Sumar\n");
                break;
            case '2':
                System.out.println("Escogió Restar\n");
                break;
            case '3':
                System.out.println("Escogió Dividir\n");
                break;
            case '4':
                System.out.println("Escogió Multiplicar\n");
                break;
            case '5':
                System.out.println("Fin del programa\n");
                break;
            default:
                System.out.println("ERROR. Opción no válida.\n");
                break;
        }
    }
}
