/*
 * Programa Java que guarda en un array 10 números enteros que se leen por teclado. 
 * A continuación, se recorre el array y calcula cuántos números  son positivos, cuantos negativos y cuantos ceros. 
 * John Herrera
 * Misión TIC 2022
*/

import java.util.Scanner;

public class EjemploVector {
    public static void main(String[] args) {
        int cantFilas=10, filas, vector[] = new int[10];
        int cantPos=0, cantNeg=0, cantCero=0;

        Scanner entrada = new Scanner(System.in);

        for (filas = 0; filas < cantFilas; filas++) {
            System.out.print("Elemento "+(filas+1)+": ");
            vector[filas] = entrada.nextInt();
        }

        for (filas = 0; filas < cantFilas; filas++) {
            if (vector[filas]<0){
                cantNeg++;
            }
            else {
                if (vector[filas]>0){
                    cantPos++;
                }
                else{
                    cantCero++;
                }
            }
        }
        System.out.println("Cantidad positivos: " + cantPos);
        System.out.println("Cantidad negativos: " + cantNeg);
        System.out.println("Cantidad ceros: " + cantCero);
        entrada.close();
    }
}   