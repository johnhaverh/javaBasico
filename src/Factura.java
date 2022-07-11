/*Se requiere un algoritmo que para 1 cliente, calcule el valor a pagar de N tipos de productos 
  comprados de acuerdo a la cantidad a llevar de cada tipo.
  John Herrera
  Misión TIC 2022
*/

import java.util.Scanner;

public class Factura{

  public static void main(String args[]){

    Scanner leer=new Scanner(System.in);
    int cantidad, precio, acumulado=0, total;

    System.out.println("Cantidad de tipo de productos: ");
    total=leer.nextInt();

    for (int i=1; i<=total; i++){

        System.out.println("Cantidad del producto "+i+": ");
        cantidad=leer.nextInt();  

        System.out.println("Valor del producto "+i+": ");
        precio=leer.nextInt();

        acumulado = acumulado +(precio*cantidad);

    }

    System.out.println("Total de la factura: "+ acumulado);  
    leer.close();

    }

}
