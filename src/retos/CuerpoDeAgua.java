/*
    John Herrera
    Misión TIC 2022
    Reto 2 - Java

Se requiere leer un vector de tamaño n de entrada en el que cada elemento indique el porcentaje de
la clasificación IRCA. 

    Clase para validación cuerpos de agua

*/

package retos;

public class CuerpoDeAgua {
    private String nombre;
    private int idCuerpoAgua;
    private String municipio;
    private float irca;
    private String nivelRiesgo;

    // Constructores

    CuerpoDeAgua (String nombre, int idCuerpoAgua, String municipio, float irca){
       this.nombre=nombre;
       this.idCuerpoAgua=idCuerpoAgua;
       this.municipio=municipio;
       this.irca=irca;
       nivel(this.irca);
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCuerpoAgua(int idCuerpoAgua) {
        this.idCuerpoAgua = idCuerpoAgua;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setIrca(float irca) {
        this.irca = irca;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public int getIdCuerpoAgua() {
        return idCuerpoAgua;
    }

    public String getMunicipio() {
        return municipio;
    }

    public float getIrca() {
        return irca;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    // Metodos

    public void nivel(float irca) {
        if (irca > 0 && irca <= 5) {
            nivelRiesgo = "SIN RIESGO";
        } else if(irca > 5 && irca <= 14) {
            nivelRiesgo = "BAJO";
        } else if(irca > 14 && irca <= 35) {
            nivelRiesgo = "MEDIO";
        } else if(irca > 35 && irca <= 80) {
            nivelRiesgo = "ALTO";
        } else if(irca > 80 && irca <= 100) {
            nivelRiesgo = "INVIABLE SANITARIAMENTE";
        }
    }

    public void imprimeNombre() {
        System.out.println(nombre);
    }

    public void imprimeNivelRiesgo() {
        System.out.println(nivelRiesgo);
    }

    public void imprimeNombreId() {
        System.out.println(nombre + " " + idCuerpoAgua);
    }

    public void imprimeCuerpoAgua() {
        System.out.println("<__________>");
        System.out.println("Nombre      : " + nombre);
        System.out.println("ID          : " + idCuerpoAgua);
        System.out.println("Municipio   : " + municipio);
        System.out.println("IRCA        : " + irca);
        System.out.println("Nidel Riesgo: " + nivelRiesgo);
    }
}
