/*
 * Introducción Java 
 * John Herrera
 * Programa para capturar información de una tienda de libros
 */

package varios;

import java.util.Scanner;

public class TiendaLibros {
    public static void main(String[] args) {

        //definición de variables
        String nombre="";
        int id = 0;
        double precio =0;
        boolean envioGratuito=false;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre del libro: ");
        nombre = entrada.nextLine();
        
        System.out.println("Id del libro: ");
        id = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Precio del libro: ");
        precio = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Proporciona el envio gratuito:");
        envioGratuito = Boolean.parseBoolean(entrada.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);

        entrada.close();
    }
}
