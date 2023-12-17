import java.util.Scanner;

public class LecturaConsola {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lectura de texto
        System.out.println("Ingresa tu nombre:");
        String nombre = teclado.nextLine();

        // Lectura de numero
        System.out.println("Ingresa tu edad:");
        int edad = teclado.nextInt();

        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");

    }
}
