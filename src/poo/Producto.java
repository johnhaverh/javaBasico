/*
 Introducción Java - clases
 John Herrera
 Misión TIC 2022
 Clase básica para gestionar la información producto, se debe validar si se requiere o no solicitar productos al proveedor
*/
package poo;

public class Producto {
    private int codigo;
    private float precio;
    private int cantidad;
    private int cantidadMinima;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void imprimeCodigo(){
        System.out.println("Codigo producto: " + codigo);
    }

    public void imprimePrecio(){
        System.out.println("Precio producto: " + precio);
    }

    public void imprimeCantidad(){
        System.out.println("Cantidad producto: " + cantidad);
    }

    public void imprimeCantidadMinima(){
        System.out.println("Cantidad minima producto: " + cantidadMinima);
    }

    public boolean solicitarProducto(){

          if (cantidad < cantidadMinima){
            return true;
          }  else {
            return false;
          }
    }
}
 