/*
 Introducción Java - clases
 John Herrera
 Misión TIC 2022
 Programa básico para probar la clase producto
*/

package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestProducto {
    
    public static void main(String[] args) {
        Producto p1 = new Producto();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el codigo del producto: ");
        p1.setCodigo(entrada.nextInt());

        System.out.println("Ingrese el precio del producto: ");
        p1.setPrecio(entrada.nextInt());

        System.out.println("Ingrese el cantidad del producto: ");
        p1.setCantidad(entrada.nextInt());

        System.out.println("Ingrese el cantidad mínima del producto: ");
        p1.setCantidadMinima(entrada.nextInt());

        p1.solicitarProducto();

        if (p1.solicitarProducto()) {
            System.out.println("Debe solcitar producto al proveedor");
        }
        else {
            System.out.println("No debe solcitar producto al proveedor");
        }
        /* 
        
        if (p1.solicitarProducto()) {
            JOptionPane.showMessageDialog(null, "si es esta disponible");
        } else {
            JOptionPane.showMessageDialog(null, "si es esta disponible");
        }
        */
        entrada.close();

    }
}
