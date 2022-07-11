/*
 * Programa Java que guarda en una matriz de 10x10 de números enteros que se leen por teclado. 
 * A continuación, se recorre la matriz y calcula cuántos números son positivos, cuantos negativos y cuantos ceros.
 */

import java.util.Scanner;

public class EjemploMatriz {
    public static void main(String[] args) {
        int cantFilas=10, cantColumnas=10, filas, columnas, matriz[][] = new int[10][10];
        int cantPos=0, cantNeg=0, cantCero=0;

        Scanner leer = new Scanner(System.in);

        for (filas = 0; filas < cantFilas; filas++) {
            for (columnas = 0; columnas < cantColumnas; columnas++) {
                System.out.print("Elemento [" + (filas + 1) + "," + (columnas + 1) + "]: ");
                matriz[filas][columnas] = leer.nextInt();
            }
        }
        leer.close();

        for (filas = 0; filas < cantFilas; filas++) {
            for (columnas = 0; columnas < cantColumnas; columnas++) {
                if (matriz[filas][columnas]<0){
                    cantNeg++;
                }
                else {
                    if (matriz[filas][columnas]>0){
                        cantPos++;
                    }
                    else{
                        cantCero++;
                    }
                }
            }
        }
        System.out.println("Cantidad positivos: " + cantPos);
        System.out.println("Cantidad negativos: " + cantNeg);
        System.out.println("Cantidad ceros: " + cantCero);
    }   
}