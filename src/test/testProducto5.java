package test;

import java.util.Scanner;

import poo.herencia.Productos.Calzado;
import poo.herencia.Productos.PrendaVestir;

public class testProducto5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // 1.
        System.out.print("Número de prendas de vestir a manejar? ");
        int numpv = Integer.parseInt(lector.nextLine());

        // 2. 
        PrendaVestir[] vPrendas = new PrendaVestir[numpv];

        //3. Llenado del vector prendaVestir
        for (int i = 0; i < numpv; i++) {
            System.out.println("\nProducto #" + (i + 1));
            System.out.print("Codigo? ");
            int cod = Integer.parseInt(lector.nextLine());

            System.out.print("Precio? ");
            int precio = Integer.parseInt(lector.nextLine());

            System.out.print("Cantidad en Bodega? ");
            int cantBodega = Integer.parseInt(lector.nextLine());

            System.out.print("Cantidad minima requerida Bodega? ");
            int cantMinBodega = Integer.parseInt(lector.nextLine());

            System.out.print("Talla (XS, S, M, L, XL, XXL)? ");
            String tallaP = lector.nextLine();

            System.out.print("Planchado (S/N)? ");
            String splanchado = lector.nextLine();
            boolean planchado = splanchado.compareToIgnoreCase("S") == 0;

            PrendaVestir pv = new PrendaVestir(tallaP, planchado, cod, precio,
                    cantBodega, cantMinBodega);

            vPrendas[i] = pv;
        }

        // 4.
        System.out.print("Número de calzado a manejar? ");
        int numc = Integer.parseInt(lector.nextLine());

        // 5. 
        Calzado[] vCalzado = new Calzado[numc];

        //6. Llenado del vector Calzado
        for (int i = 0; i < numc; i++) {
            System.out.println("\nProducto #" + (i + 1));
            System.out.print("Codigo? ");
            int cod = Integer.parseInt(lector.nextLine());

            System.out.print("Precio? ");
            int precio = Integer.parseInt(lector.nextLine());

            System.out.print("Cantidad en Bodega? ");
            int cantBodega = Integer.parseInt(lector.nextLine());

            System.out.print("Cantidad minima requerida Bodega? ");
            int cantMinBodega = Integer.parseInt(lector.nextLine());

            System.out.print("Talla (35, 36, 37, etc)? ");
            int tallaC = Integer.parseInt(lector.nextLine());

            Calzado pc = new Calzado(tallaC, cod, precio, cantBodega, cantMinBodega);

            vCalzado[i] = pc;
        }

        String opcion = "";
        do {
            System.out.println("*** MENU ***");
            System.out.println("1. Verificar productos a pedir");
            System.out.println("2. Calzado con mayor cantidad de unidades");
            System.out.println("3. Prenda con mayor cantidad de unidades");
            System.out.println("4. Modificar cantidad mínima requerida en bodega");
            System.out.println("5. Vender producto:");
            System.out.println("6. Salir");
            System.out.print(">> OPCION (1 al 6)?");
            opcion = lector.nextLine();

            switch (opcion) {
                case "1":
                    // Verificar pedidos de las prendas
                    for (int i = 0; i < vPrendas.length; i++) {
                        if (vPrendas[i].solicitarPedido()) {
                            System.out.println("Solicitar pedido de la prenda "
                                    + vPrendas[i].getCodigo());
                        }
                    }
                    // Verificar pedidos del calzado
                    for (Calzado c : vCalzado) {
                        if (c.solicitarPedido()) {
                            System.out.println("Solicitar pedido del calzado "
                                    + c.getCodigo());
                        }
                    }
                    break;

                case "2":
                    // Prendas con mayor cantidad en Bodega
                    int maxCantBodega = -1;
                    PrendaVestir pvMax = null;
                    for (PrendaVestir p : vPrendas) {
                        if (p.getCantidadBodega() > maxCantBodega) {
                            maxCantBodega = p.getCantidadBodega();
                            pvMax = p;
                        }
                    }

                    if (pvMax != null) {
                        System.out.println("\nLa prenda de vestir con mayor "
                                + "cantidad en bodega es "
                                + pvMax.getCodigo());
                    }
                    
                case "3":
                    // Calzados con mayor cantidad en Bodega
                    maxCantBodega = -1;
                    Calzado cMax = null;
                    for (Calzado p : vCalzado) {
                        if (p.getCantidadBodega() > maxCantBodega) {
                            maxCantBodega = p.getCantidadBodega();
                            cMax = p;
                        }
                    }

                    if (cMax != null) {
                        System.out.println("\nEl calzado con mayor "
                                + "cantidad en bodega es "
                                + cMax.getCodigo());
                    }
                    break;
                    
                case "4":
                    //Modificar cantidad mínima requerida en bodega 
                    System.out.print("\nCodigo del producto: ");
                    int cod = Integer.parseInt(lector.nextLine()) ;
                    
                    System.out.print("Calzado o Prenda (C o P)? ");
                    char tipo = lector.nextLine().toUpperCase().charAt(0);
                    
                    System.out.print("Nuevo valor de cantidades "
                            + "minimas requeridad? ");
                    int cantMin = Integer.parseInt(lector.nextLine()) ;
                    
                    if (tipo=='C') {
                        for (Calzado c : vCalzado) {
                            if (c.getCodigo() == cod) {
                                c.setCantidadMinimaBodega(cantMin);
                                break;
                            }
                        }
                    } else {
                        for (int i = 0; i < vPrendas.length; i++) {
                            if(vPrendas[i].getCodigo() == cod) {
                               vPrendas[i].setCantidadMinimaBodega(cantMin);
                               break;
                            }
                        }
                    }
                    
                    break;
                    
                case "5":
                    // Vender producto
                    System.out.print("\nCodigo del producto: ");
                    cod = Integer.parseInt(lector.nextLine()) ;
                    
                    System.out.print("Calzado o Prenda (C o P)? ");
                    tipo = lector.nextLine().toUpperCase().charAt(0);
                    
                    System.out.println("Unidades a vender? ");
                    int unid = Integer.parseInt(lector.nextLine()) ;
                    
                    if (tipo=='C') {
                        boolean sw = false;
                        for (Calzado c : vCalzado) {
                            if (c.getCodigo() == cod) {
                                if (c.getCantidadBodega() >= unid) {
                                    int saldo = c.getCantidadBodega() - unid;
                                    c.setCantidadBodega(saldo);
                                    
                                    System.out.println("Facturas con descuento: " + 
                                            c.facturaDescuento(unid));
                                    System.out.println("Facturas sin descuento: " + 
                                            c.facturaSinDescuento(unid));
                                } else {
                                    System.out.println("No hay suficientes unidades de calzado para la venta");
                                }
                                break;
                            }
                        }
                        
                        if (sw == false) {
                            System.out.println("--> El codigo de ese calzado no existe.");
                        }
                                
                    } else {
                        boolean sw = false;
                        for (PrendaVestir c : vPrendas) {
                            if (c.getCodigo() == cod) {
                                if (c.getCantidadBodega() >= unid) {
                                    int saldo = c.getCantidadBodega() - unid;
                                    c.setCantidadBodega(saldo);
                                    
                                    System.out.println("Facturas con descuento: " + 
                                            c.facturaDescuento(unid));
                                    System.out.println("Facturas sin descuento: " + 
                                            c.facturaSinDescuento(unid));
                                } else {
                                    System.out.println("No hay suficientes unidades "
                                            + "prenda de vestir para la venta");
                                }
                                break;
                            }
                        }
                        
                        if (sw == false) {
                            System.out.println("--> El codigo de esa prenda no existe.");
                        }
                    }
                    
                default:
                    throw new AssertionError();
            }

        } while (opcion.compareTo("6") != 0);

        lector.close();

    }

}
