import java.util.Scanner;

public class SumaRecursiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del límite inferior:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el valor del límite superior:");
        int numero2 = scanner.nextInt();

        int resultado = sumatoriaCuadrado(numero1, numero2);

        System.out.println("La sumatoria de los cuadrados desde " + numero1 + " hasta " + numero2 + " es: " + resultado);
        
        scanner.close();
    }

    private static int sumatoriaCuadrado(int num1, int num2) {
        if (num1 > num2) {
            return 0;
        } else {
            int cuadrado = num1 * num1;
            return cuadrado + sumatoriaCuadrado(num1 + 1, num2);
        }
    }
}