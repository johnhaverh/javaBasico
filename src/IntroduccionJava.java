/*
 Introducción Java
 John Herrera
 Misión TIC 2022
*/
import java.util.Scanner;

public class IntroduccionJava {
    public static void main(String[] args) {
        int a = 1, b = 2; 
        double c = 3;
        double exp;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un valor para A: ");
        a = leer.nextInt();

        System.out.print("Ingrese un valor para B: ");
        b = leer.nextInt();

        System.out.print("Ingrese un valor para c: ");
        c = leer.nextDouble();


        exp = 2 * Math.pow(c, 3) + b * a + Math.sqrt(3 *4 + Math.pow(b, 2));

        leer.close();

        System.out.println("El valor de la formula es: " + exp);
        //System.out.println(exp);
        System.out.println("Fin del programa");
        
        
    }
    
}
