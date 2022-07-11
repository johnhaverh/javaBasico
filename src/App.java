import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1=10;
        int numero2=5;

        String cadena="Es una cadena de texto";
        System.out.println("Hello, World!");
        System.out.println("numero1: " + numero1);
        System.out.println(cadena);

        //concatenación de cadenas
        String usuario="Juan ";
        String titulo=" Ingeniero ";
        String union=titulo+usuario;
        System.out.println("Union: "+union);

        System.out.println(numero1 + numero2); //suma antes de imprimir
        System.out.println(numero1 + numero2 + union); // suma y concatena
        System.out.println(union + numero1 + numero2); // concatena todos
        System.out.println(union + (numero1 + numero2)); // concatena texto con la suma

        //lectura de información por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número!");
        String numero3 = scanner.nextLine();
        System.out.println("Numero3: " + numero3);

        //tipo primitivos
        System.out.println("Maximo Byte " + Byte.MAX_VALUE);
        System.out.println("Maximo Byte " + Byte.MIN_VALUE);

        System.out.println("Maximo Integer " + Integer.MAX_VALUE);
        System.out.println("Maximo Integer " + Integer.MIN_VALUE);

        System.out.println("Maximo Double " + Double.MAX_VALUE);
        System.out.println("Maximo Double " + Double.MIN_VALUE);

        System.out.println("Maximo Float " + Float.MAX_VALUE);
        System.out.println("Maximo Float " + Float.MIN_VALUE);

        System.out.println("Maximo Short " + Short.MAX_VALUE);
        System.out.println("Maximo Short " + Short.MIN_VALUE);

        System.out.println("Maximo Long " + Long.MAX_VALUE);
        System.out.println("Maximo Long " + Long.MIN_VALUE);
        scanner.close();
    }
}

