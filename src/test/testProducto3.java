package test;

import java.util.Scanner;

import poo.Producto3;

public class TestProducto3 {
    /*
    1	Consulte el número de productos a manejar.
    2	Cree un vector de productos en el cual se guardarán las instancias de 
    cada uno de ellos.
    3	Solicite por consola el código, el precio de compra, la cantidad en 
    bodega y la cantidad mínima requerida para cada uno de los productos a 
    manejar.
    4	Recorra el vector de productos y arroje una alerta en caso tal se deba 
    solicitar el pedido al proveedor.
    5	Indique cuál es el código del producto que tiene mayor cantidad de 
    unidades en bodega, si hay varios que cumplen con la condición, indicar el 
    primero de ellos.
    6	Leer un código de producto y una cantidad de unidades de compra, 
    indicar el total a pagar por ese pedido. Para ello utilice el método creado 
    en la clase Producto pasando por parámetro la cantidad de unidades 
    de compra.
    
    7 Para tener en cuenta: el porcentaje de descuento es el mismo para todos 
    los productos, y es del 1%.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // 1.
        System.out.print("Número de productos a manejar? ");
        int num = lector.nextInt();
        
        // 2. 
        Producto3[] vecProd = new Producto3[num];
        
        //3.
        for (int i = 0; i < num; i++) {
            System.out.println("\nProducto #" + (i+1));
            System.out.print("Codigo? ");
            int cod = lector.nextInt();
            
            System.out.print("Precio? ");
            int precio = lector.nextInt();
            
            System.out.print("Cantidad en Bodega? ");
            int cantBodega = lector.nextInt();
            
            System.out.print("Cantidad minima requerida Bodega? ");
            int cantMinBodega = lector.nextInt();
            
            Producto3 p = new Producto3(cod, precio, cantBodega, cantMinBodega);
            
            vecProd[i] = p;
        }
        
        // 4. y 5.
        int maxCantBodega = -1;
        Producto3 prodMaxCantBodega = null;
        for (Producto3 p : vecProd) {
            if (p.solicitarPedido()) { 
                // es lo mismo que: if (producto.solicitarPedido() == true)
                System.out.println("\n --> ¡ALERTA!!");
                System.out.println("\tEl producto " + 
                                   p.getCodigo() + 
                                   " requiere hacer pedidos al proveedor por más de " +
                                   (p.getCantidadMinimaBodega() - p.getCantidadBodega() + 1) + 
                                   " unidadaes.");
            }
            
            if (p.getCantidadBodega() > maxCantBodega) {
                maxCantBodega = p.getCantidadBodega();
                prodMaxCantBodega = p;
            }
        }
        
        if (prodMaxCantBodega != null)
            System.out.println("\nEl producto con mayor cantidad en bodega es" +
                               prodMaxCantBodega.getCodigo());
        
        // 6 y 7. 
        System.out.print("\n Ingrese código del producto ");
        int cod = lector.nextInt();
        System.out.print("Cantidad unidades de compras ");
        int cant = lector.nextInt();
        for (int i = 0; i < num; i++) {
            if (vecProd[i].getCodigo() == cod) {
                System.out.println("Total a pagar al proveedor: " + 
                                   vecProd[i].calcularTotalPagar(cant));
                break;
            }
            
        }
        
        System.out.println("Modificar cant minima en bodega del producto Código? ");
        cod = lector.nextInt();
        int i;
        for (i = 0; i < num; i++) {
            if (vecProd[i].getCodigo() == cod) {
                System.out.println("Nuevo valor de la cantidad mínima en bodega: ?");
                int cantMinBodega = lector.nextInt();
                vecProd[i].setCantidadMinimaBodega(cantMinBodega);
                break;
            }
            
        }
        if (i>=num) {
            System.out.println("--> Error. No se encontró un producto con ese código");
        }
        
        
        System.out.println("\nVENDER PRODUCTO");
        System.out.println("Código del producto a vender? ");
        cod = lector.nextInt();
        for (i = 0; i < num; i++) {
            if (vecProd[i].getCodigo() == cod) {
                System.out.println("Cantidades a vender? ");
                cant = lector.nextInt();
                    if (vecProd[i].getCantidadBodega() >= cant) {
                    int saldo = vecProd[i].getCantidadBodega() - cant;
                    vecProd[i].setCantidadBodega(saldo);
                    System.out.println("\tFACTURA");
                    System.out.println("\tValor con descuento: " + vecProd[i].facturaDescuento(cant));
                    System.out.println("\tValor sin descuento: " + vecProd[i].facturaSinDescuento(cant));
                } else {
                    System.out.println("--> No hay las cantidades en bodega suficientes para vender");
                }
                break;
            }
        }
        if (i>=num) {
            System.out.println("--> Error. No se encontró un producto con ese código");
        }
        
        lector.close();
        
    }
    
}
