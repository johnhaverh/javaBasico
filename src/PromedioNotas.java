/*
Diseñar un algoritmo que calcule el promedio de notas del primer
parcial de un curso de N estudiantes.
*/

import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        int n;
        float suma = 0.0f;

        System.out.print("Cuantos estudiantes son en el curso? ");

        Scanner teclado = new Scanner(System.in);
        n = teclado.nextInt();

        for(int i=1; i<=n; ++i) {
            System.out.print("Ingrese la nota del estudiante #" + i + ": " );
            float nota = teclado.nextFloat();
            suma += nota;
        }

        float prom = suma / n;
        System.out.println(String.format("El promedio de las notas del curso es: %5.2f",prom));

        teclado.close();
    }
}