/*
 Ejemplo básico de vector 
 John Herrera
 Misión TIC 2022
*/

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {
        int cant, filas, vector[] = new int[100];
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad de elementos: ");
        cant = entrada.nextInt();
        for (filas = 0; filas < cant; filas++) {
            System.out.print("Elemento "+(filas+1)+": ");
            vector[filas] = entrada.nextInt();
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
        entrada.close();
    }
}
