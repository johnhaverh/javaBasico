/*
 * Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz. 
 * Los valores y la longitud, serán insertados por el usuario. Mostrar las matrices originales y el resultado.
 */

import java.util.Scanner;

public class SumarMatrices {
    public static void main(String[] args) {
        int cantFilas, cantColumnas, filas, columnas;
        
        Scanner leer=new Scanner(System.in);
        System.out.print("Cantidad de Filas: ");
        cantFilas = leer.nextInt();

        System.out.print("Cantidad de Columnas: ");
        cantColumnas = leer.nextInt();

        int matriz1[][]= new int [cantFilas][cantColumnas];
        int matriz2[][]= new int [cantFilas][cantColumnas];
        int matriz3[][]= new int [cantFilas][cantColumnas];

   
        System.out.println("Llenado primera matriz");
        for (filas = 0; filas < cantFilas; filas++) {
            for (columnas = 0; columnas < cantColumnas; columnas++) {
                System.out.print("Elemento [" + (filas + 1) + "," + (columnas + 1) + "]: ");
                matriz1[filas][columnas] = leer.nextInt();
            }
        }

        System.out.println("Llenado segunda matriz");
        for (filas = 0; filas < cantFilas; filas++) {
            for (columnas = 0; columnas < cantColumnas; columnas++) {
                System.out.print("Elemento [" + (filas + 1) + "," + (columnas + 1) + "]: ");
                matriz2[filas][columnas] = leer.nextInt();
            }
        }

        
        for (filas = 0; filas < cantFilas; filas++) {
            for (columnas = 0; columnas < cantColumnas; columnas++) {
                matriz3[filas][columnas] =  matriz1[filas][columnas] + matriz2[filas][columnas];
            }
        }

        System.out.println("Matriz 1");
        imprimirMatriz(matriz1,cantFilas, cantColumnas);
        System.out.println("Matriz 2");
        imprimirMatriz(matriz2,cantFilas, cantColumnas);
        System.out.println("Resultado Matriz1 + Matriz2");
        imprimirMatriz(matriz3,cantFilas, cantColumnas);
    }

    private static void imprimirMatriz(int[][] matriz, int cantFilas, int cantColumnas) {

        for (int filas = 0; filas < cantFilas; filas++) {
            for (int columnas = 0; columnas < cantColumnas; columnas++) {
                System.out.print(matriz[filas][columnas] + "\t");
            }
            System.out.println("");
        } 
    }
    
}
