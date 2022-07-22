/*
 Introducción Java - clases
 John Herrera
 Misión TIC 2022
 Programa básico para probar la clase Productov2
*/

package test;

import java.util.Scanner;

import poo.Productov2;

public class TestProductov2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.print("Numero de Productos: ");
        int numeroProductos = entrada.nextInt();

        Productov2[] vecProductos = new Productov2[numeroProductos];

        for (int i=0;i<numeroProductos;i++){
            System.out.println("Producto #: "+(i+1));
            System.out.print("Codigo del Producto: ");
            int codigoProducto = entrada.nextInt();
            
            System.out.print("Precio del Producto: ");
            int precioProducto = entrada.nextInt();

            System.out.print("cantidad en bodega: ");
            int cantidadBodega = entrada.nextInt();

            System.out.print("cantidad minima requerida: ");
            int cantidadMinima = entrada.nextInt();

            System.out.print("cantidad maxima requerida: ");
            int cantidadMaxima = entrada.nextInt();

            Productov2 prod = new Productov2(codigoProducto, precioProducto,cantidadBodega,cantidadMinima,cantidadMaxima);

            vecProductos[i]=prod;

        }

        int maxCantidadBodega=-1;
        Productov2 productoMaxCantBodega=null;

        for (Productov2 productov2 : vecProductos) {
            if (productov2.solicitarProducto()){
                System.out.println("---> Alerta");
                System.out.println("\t El producto " + productov2.getCodigo()+
                                    " requiere hacer pedido al proveedor por más de "+ 
                                    (productov2.getCantidadMinimaInventario() - productov2.getCantidad() + 1) + 
                                    " unidades");
            }

            if (productov2.getCantidad() > maxCantidadBodega){
                maxCantidadBodega = productov2.getCantidad();
                productoMaxCantBodega= productov2;
            }

        }

        if (productoMaxCantBodega!=null)
            System.out.println("El producto con mayor cantidad en bodega es "+productoMaxCantBodega.getCodigo());
 
        // validar precio producto
        System.out.println("\n__Total a pagar a proveedor___");

        System.out.print("Ingrese código del producto: ");
        int codProd = entrada.nextInt();

        System.out.print("Ingrese cantidad unidades: ");
        int cantProd = entrada.nextInt();

        for (int i=0; i< cantProd;i++){
            if (vecProductos[i].getCodigo() == codProd){
                System.out.println("Total a pagar al proveedor: "+ vecProductos[i].calcularTotalPagar(cantProd));
                break;
            }
        }

        // cambiar cantidad mimina producto
        System.out.println("\n___Cambiar cantidad mímina en bodega___");
        System.out.print("Ingrese código del producto: ");
        codProd = entrada.nextInt();

        if (codProd < 0)
            codProd = 0;

        System.out.print("Ingrese cantidad minima en bodega: ");
        cantProd = entrada.nextInt();

        for (int i=0; i< cantProd;i++){
            if (vecProductos[i].getCodigo() == codProd){
                vecProductos[i].setCantidadMinimaInventario(cantProd);
                System.out.println("Nueva cantidad mínima en bodega: "+ vecProductos[i].getCantidadMinimaInventario());
                break;
            }
        }

        // vender producto
        System.out.println("\n__Vender un producto___");
        System.out.print("Ingrese código del producto a vender: ");
        codProd = entrada.nextInt();

        if (codProd < 0)
            codProd = 0;

        System.out.print("Ingrese cantidad de productos a vender: ");
        cantProd = entrada.nextInt();

        for (int i=0; i< cantProd;i++){
            if (vecProductos[i].getCodigo() == codProd){
                System.out.println("Cantidad de productos disponibles: "+ vecProductos[i].getCantidad());
                if (vecProductos[i].getCantidad() >= cantProd){
                    vecProductos[i].setCantidad(vecProductos[i].getCantidad() - cantProd );
                    System.out.println("Valor factura con descuento: "+ vecProductos[i].calcularTotalPagar(cantProd));
                    System.out.println("Valor factura sin descuento: "+ vecProductos[i].calcularTotalPagar(cantProd,0));
                    System.out.println("Cantidad de productos restantes: "+ vecProductos[i].getCantidad());
                } else {
                    System.out.println("No hay unidades suficientes para la venta ");   
                }
                break;
            }
        }

        entrada.close();
    }
}