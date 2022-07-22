/*
 Introducción Java - clases
 John Herrera
 Misión TIC 2022
 Programa básico para probar la clase estudiantes
*/

package test;

import java.util.Scanner;

import poo.Estudiante;

public class TestEstudiante {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante ();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nota1: ");
        e1.Nota1 = entrada.nextInt();
        
        System.out.println("Nota2: ");
        e1.Nota2 = entrada.nextInt();
        
        System.out.println("Nota3: ");
        e1.Nota3 = entrada.nextInt();
        
        System.out.println(e1.promedio());

        e1.cambiarNombre("John Herrera");

        entrada.close();
        //System.out.println(String.format("\nPromedio del estudiante: %.2f", + e1.promedio));
    }
}
