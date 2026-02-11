package FuncionesAritmeticas;

import java.util.Scanner;

public class Suma {
    public static void calcular() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        double a = sc.nextDouble();
        System.out.print("Numero 2: ");
        double b = sc.nextDouble();
        System.out.println("Resultado: " + (a + b));
    }
}
