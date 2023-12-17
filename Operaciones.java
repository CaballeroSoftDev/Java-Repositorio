public class Operaciones {

    public static void main(String[] args) {
        int numero1, numero2;
        int total;

        numero1 = 3;
        numero2 = 8;
        total = numero1 + numero2;

        System.out.println("Resultado de la suma: " + total);

        numero1 = 10;
        numero2 = 4;
        total = numero1 - numero2;

        System.out.println("Resultado de la resta: " + total);

        numero1 = 9;
        numero2 = 8;
        total = numero1 * numero2;

        System.out.println("Resultado de la multiplicación: " + total);

        numero1 = 12;
        numero2 = 4;
        total = numero1 / numero2;

        System.out.println("Cociente de división entera: " + total);

        total = numero1 % numero2;

        System.out.println("Residuo de una división entera: " + total);

    }
}