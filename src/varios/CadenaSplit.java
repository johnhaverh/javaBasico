/*
 Introducción Java - clases
 John Herrera
 Misión TIC 2022
 Separación de una cadena usando Split
*/

package varios;

import java.util.Arrays;

public class CadenaSplit {
    public static void main(String[] args) {
        String cadena = "Hola Stackoverflow en español";
        String[] parts = cadena.split(" ");              
        System.out.println(Arrays.asList(parts));
        for (int i=0; i< parts.length;i++){
            System.out.println(parts[i]);
        }
            
    }
}
