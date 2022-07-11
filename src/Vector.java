/*
 * Ejemplo básico de vector 
 */

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        int cant, filas, vector[] = new int[100];
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de elementos: ");
        cant = leer.nextInt();
        for (filas = 0; filas < cant; filas++) {
            System.out.print("Elemento "+(filas+1)+": ");
            vector[filas] = leer.nextInt();
        }
        System.out.println("Elementos del vector");
        
        for (filas = 0; filas < cant; filas++) {
            System.out.println(vector[filas]);
        }

        System.out.println("");

        for (int elem : vector) {
            System.out.println(elem + ", ");
            
        }
        System.out.println("");
        leer.close();
    }
}
