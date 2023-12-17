import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String menu = "\n1- Suma \n2- Resta \n3- Multiplicación \n4- División \n5- Módulo";
        float n1, n2, resultado;
        int opcion;

        System.out.println("Ingrese un numero");
        n1 = teclado.nextFloat();

        System.out.println("Ingrese otro numero");
        n2 = teclado.nextFloat();

        System.out.println("Elige una opción" + menu);
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                resultado = n1 + n2;
                System.out.println("Resultado de la suma: " + resultado);
                break;

            case 2:
                resultado = n1 - n2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case 4:
                if (n1 != 0) {
                    resultado = n1 / n2;
                    System.out.println("Resultado de la división: " + resultado);
                    break;
                }else{
                    System.out.println("No se puede dividir entre cero");
                }
            case 5:
                resultado = n1 % n2;
                System.out.println("El módulo es : " + resultado);
                break;

            default:
                System.out.println("Opción incorrecta");
                break;
        }

    }
}
