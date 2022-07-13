/*
 * Introducción Java - clases
 * John Herrera
 * Misión TIC 2022
 * CRear una clase básica para información de estudiantes
 */
package poo;

public class Estudiante {

    // atributos
    private String Nombre;
    public float Nota1;
    protected float Nota2;
    float Nota3;

    // constructor

    public float promedio(){
        return (Nota1+Nota2+Nota3)/ 3.0f;
    }

    public void cambiarNombre(String nom){
        Nombre = nom;
    }
    
}