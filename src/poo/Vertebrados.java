/*
 Introducción Java - clases
 John Herrera
 Misión TIC 2022
 Crear una clase básica para información de vertebrados
*/

package poo;

public class Vertebrados {
    private String nombreVertebrado;

    public void setNombreVertebrado(String nombreVertebrado) {
        this.nombreVertebrado = nombreVertebrado;
    }

    public String getNombreVertebrado() {
        return nombreVertebrado;
    }

    @Override
    public String toString() {
        return "nombreVertebrado: " + nombreVertebrado;
    }

    public void imprimeMensaje(){
        System.out.println("Nombre del Vertebrado: " + nombreVertebrado);
    }

    public static void main(String[] args) {
        Vertebrados v = new Vertebrados();
        v.setNombreVertebrado("León");
        v.imprimeMensaje();
        System.out.println(v);
        
    }

}
