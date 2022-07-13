package retos;
/*
* John Herrera
* Misión TIC 2022
* Reto 1 - Java

Se requiere leer un vector de tamaño n de entrada en el que cada elemento indique el porcentaje de
la clasificación IRCA. 

El algoritmo debe ser capaz de responder a las siguientes preguntas:
¿Cuál es el promedio del nivel de riesgo de la calidad del agua según los datos ingresados?
¿Cuál es el nivel de riesgo de la calidad del agua más alto encontrado?
¿Cuál es el nivel de riesgo de la calidad del agua más bajo encontrado?
*/

import java.util.Scanner;

public class reto1 {
    public static void main(String[] args) {
        int cant, filas, vector[] = new int[100];
        int menor=0, mayor=0, valor=0;
        int suma=0, promedio=0;

        Scanner leer = new Scanner(System.in);
        cant = leer.nextInt();

        for (filas = 0; filas < cant; filas++) {
            valor=leer.nextInt();
            suma=suma+valor;
            vector[filas] = valor;
        }

        promedio=suma/cant;
        
        menor=vector[0];
        mayor=vector[0];
        for (filas = 0; filas < cant; filas++) {
            if (vector[filas]<menor){
                menor=vector[filas];
            }
            if (vector[filas]>mayor){
                mayor=vector[filas];
            }
        }

        leer.close();
        nivelRiesgo(promedio);
        nivelRiesgo(mayor);
        nivelRiesgo(menor);
    }

    private static void nivelRiesgo(int promedio) {
        if (promedio > 0 && promedio <= 5) {
            System.out.println("SIN RIESGO");
        } else if(promedio > 5 && promedio <= 14) {
            System.out.println("BAJO");
        } else if(promedio > 14 && promedio <= 35) {
            System.out.println("MEDIO");
        } else if(promedio > 35 && promedio <= 80) {
            System.out.println("ALTO");
        } else if(promedio > 80 && promedio <= 100) {
            System.out.println("INVIABLE SANITARIAMENTE");
        }
    }
}
