/*
    John Herrera
    Misión TIC 2022
    Reto 2 - Java

Se requiere leer un vector de tamaño n de entrada en el que cada elemento indique el porcentaje de
la clasificación IRCA. 

    Indicar cuál fue el nivel de riesgo de cada cuerpo de agua.
    Indicar cuántos cuerpos de agua tienen un nivel de riesgo MEDIO o inferior.
    Indicar el nombre de los cuerpos de agua que tienen un nivel de riesgo MEDIO, en caso de no haber ninguno devolver NA.
    Indicar el nombre del cuerpo de agua con la clasificación IRCA más baja encontrada y su número identificador.

*/

package retos;

import java.util.Scanner;

public class reto2 {
    
    //main

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("\033[H\033[2J");  
        System.out.flush();

        System.out.print("Cantidad cuerpos de agua: ");
        int nroCuerpoAgua = Integer.parseInt(entrada.nextLine());

        CuerpoDeAgua[] vecCuerposAgua = new CuerpoDeAgua[nroCuerpoAgua];

        int cantCuerposAguaMenMedio=0;
        float menorIrca=1000;

        for (int i=0;i<nroCuerpoAgua;i++){
            System.out.print("Cuerpo de agua #: " + (i+1) + "Ingresar información: ");
            String[] parts = entrada.nextLine().split(" "); 
            CuerpoDeAgua cuerpoAgua = new CuerpoDeAgua(parts[0], Integer.parseInt(parts[1]),parts[2],Float.valueOf(parts[3]));
            vecCuerposAgua[i]=cuerpoAgua;
        }

        //imprime niveles de riesgo
        for (CuerpoDeAgua CuerpoDeAgua : vecCuerposAgua) {
            CuerpoDeAgua.imprimeNivelRiesgo();
            if (CuerpoDeAgua.getIrca() < 35){
                cantCuerposAguaMenMedio++;
            }
        }

        //imprime cantidad cuerpos de agua
        System.out.println(cantCuerposAguaMenMedio);

        //impreme nombres en nivel medio
        String nombreNivelMedio="";
        for (CuerpoDeAgua CuerpoDeAgua : vecCuerposAgua) {
            if (CuerpoDeAgua.getNivelRiesgo().equals("MEDIO")){
                nombreNivelMedio = nombreNivelMedio + CuerpoDeAgua.getNombre() + " ";
            }
        }

        System.out.println(nombreNivelMedio);

        //impreme nombre & ID con IRCA mas bajo
        CuerpoDeAgua menorCuerpoAguaIrca=null;

        for (CuerpoDeAgua CuerpoDeAgua : vecCuerposAgua) {

            if (CuerpoDeAgua.getIrca() < menorIrca){
                menorIrca = CuerpoDeAgua.getIrca();
                menorCuerpoAguaIrca = CuerpoDeAgua;
            }
        }
        if (menorCuerpoAguaIrca!=null)
            menorCuerpoAguaIrca.imprimeNombreId();
        
        entrada.close();
    }
}
