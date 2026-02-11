package FuncionesAritmeticas;

import java.util.Scanner;

public class Division {
    public static void calcular() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero 1: ");
        double a = sc.nextDouble();
        System.out.print("Numero 2: ");
        double b = sc.nextDouble();
        if (b != 0) {
            System.out.println("Resultado: " + (a / b));
        } else {
            System.out.println("Error: division entre 0");
        }
    }
}

