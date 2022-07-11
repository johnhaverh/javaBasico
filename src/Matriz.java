/*
 * Ejemplo básico de matriz 
 * John Herrera
 * Misión TIC 2022
 */

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int cantFilas, cantColumnas, filas, columnas, matriz[][] = new int[100][100];

        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de filas: ");
        cantFilas = leer.nextInt();

        System.out.print("Cantidad de columnas: ");
        cantColumnas = leer.nextInt();

        for (filas = 0; filas < cantFilas; filas++) {
            for (columnas = 0; columnas < cantColumnas; columnas++) {
                System.out.print("Elemento [" + (filas + 1) + "," + (columnas + 1) + "]: ");
                matriz[filas][columnas] = leer.nextInt();
            }
        }
        System.out.println("Elementos de la matriz");
        
        for (filas = 0; filas < cantFilas; filas++) {
            for (columnas = 0; columnas < cantColumnas; columnas++) {
                System.out.print(matriz[filas][columnas]+"\t");
            }
            System.out.println("");
        }
    }   
}