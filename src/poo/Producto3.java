/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author DOCENTE
 */
public class Producto3 {
    // Atributos
    private int codigo;
	private int precioCompra;
	private int cantidadBodega;
	private int cantidadMinimaBodega;
	private int cantidadMaximaPermitida;
	private float porcDescuento;
    
    // Constructor
    public Producto3(int cod, int precio, int cantBodega, int cantMinBodega) {
        codigo = cod;
        precioCompra = precio;
        cantidadBodega = cantBodega;
        cantidadMinimaBodega = cantMinBodega;
        cantidadMaximaPermitida = 0;
        porcDescuento = 0.01f;
    }
    
    // Metodos set / get
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinimaBodega() {
        return cantidadMinimaBodega;
    }

    public void setCantidadMinimaBodega(int cantidadMinimaBodega) {
        if (cantidadMinimaBodega > 0) {
            this.cantidadMinimaBodega = cantidadMinimaBodega;
        } else {
            this.cantidadMinimaBodega = 0;
        }
    }

    public int getCantidadMaximaPermitida() {
        return cantidadMaximaPermitida;
    }

    public void setCantidadMaximaPermitida(int cantidadMaximaPermitida) {
        this.cantidadMaximaPermitida = cantidadMaximaPermitida;
    }

    public float getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(float porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

    // Metodos
    public boolean solicitarPedido() {
        // Solicitar pedido: devuelva true si debe solicitar el producto 
        // al proveedor y false en caso contrario.
        return cantidadBodega <= cantidadMinimaBodega; 
    }
    
    public int calcularTotalPagar(int cantUndCompra) {
        // Calcular total a pagar: devuelva la cantidad total a pagar 
        // al proveedor dado una cantidad de unidades de compra
        return Math.round(cantUndCompra * precioCompra * (1.0f - porcDescuento));
    }
    
    public int facturaDescuento(int cantUndCompra) {
        return Math.round(cantUndCompra * precioCompra * (1.0f - porcDescuento));
    }
    
    public int facturaSinDescuento(int cantUndCompra) {
        return Math.round(cantUndCompra * precioCompra);
    }
    
}
