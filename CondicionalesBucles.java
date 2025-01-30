public class CondicionalesBucles {

    public static void main(String args[]) {

        // Condicional
        int edad = 10;

        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // bucles
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // Bucle while
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

    }

}
