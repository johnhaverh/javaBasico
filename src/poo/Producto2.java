/*
 Introducción Java - clases
 John Herrera
 Misión TIC 2022
 Clase básica para gestionar la información producto, se debe validar si se requiere o no solicitar productos al proveedor
*/

package poo;

public class Producto2 {
    private int codigo;
    private int precioCompra;
    private int cantidad;
    private int cantidadMinimaInventario;
    private int cantidadMaximaInventario;
    private float porcentajeDescuento;

    // Contructor
    public Producto2(int codigoProducto, int precioProducto, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        codigo = codigoProducto;
        precioCompra = precioProducto;
        cantidad = cantidadBodega;
        cantidadMinimaInventario = cantidadMinima;
        cantidadMaximaInventario = cantidadMaxima;
        porcentajeDescuento = 0.01f;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0)
            this.cantidad = cantidad;
        else
            this.cantidad = 0;
    }

    public void setCantidadMinimaInventario(int cantidadMinimaInventario) {
        if (cantidadMinimaInventario > 0)
            this.cantidadMinimaInventario = cantidadMinimaInventario;
        else
            this.cantidadMinimaInventario = 0;
    }

    public void setCantidadMaximaInventario(int cantidadMaximaInventario) {
        if (cantidadMaximaInventario > 0)
            this.cantidadMaximaInventario = cantidadMaximaInventario;
        else   
            this.cantidadMaximaInventario = 0;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCantidadMinimaInventario() {
        return cantidadMinimaInventario;
    }

    public int getCantidadMaximaInventario() {
        return cantidadMaximaInventario;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    // Metodos
    public boolean solicitarProducto() {
        return cantidad <= cantidadMinimaInventario;
    }

    public long calcularTotalPagar(int cantUniCompra) {
        return Math.round(cantUniCompra * precioCompra * (1.0f - porcentajeDescuento));
    }

    public long calcularTotalPagar(int cantUniCompra, float porcentajeDescuento ) {
        return Math.round(cantUniCompra * precioCompra * (1.0f - porcentajeDescuento));
    }

    //otros metodos

    public void imprimeCodigo() {
        System.out.println("Codigo del producto: " + codigo);
    }

    public void imprimeprecioCompra() {
        System.out.println("Precio Compra del producto: " + precioCompra);
    }

    public void imprimeCantidad() {
        System.out.println("Cantidad unidades del producto: " + cantidad);
    }

    public void imprimeCantidadMinima() {
        System.out.println("Cantidad minima del producto: " + cantidadMinimaInventario);
    }
}