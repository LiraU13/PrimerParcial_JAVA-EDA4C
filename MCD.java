import java.util.Scanner;

public class MCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número 1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el número 2: ");
        int num2 = scanner.nextInt();
        
        int mcd = calcularMCD_Iterativo(num1, num2);
        System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + mcd);
        
        scanner.close();
    }

    // Modo iterativo con ciclo Do While
    public static int calcularMCD_Iterativo(int a, int b) {
        do {
            int temp = b;
            b = a % b;
            a = temp;
        } while (b != 0);
        return a;
    }

    // Modo recursivo con if 
    public static int calcularMCD_Recursivo(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMCD_Recursivo(b, a % b);
        }
    }    
}