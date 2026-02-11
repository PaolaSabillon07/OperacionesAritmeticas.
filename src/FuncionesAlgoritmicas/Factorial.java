package FuncionesAlgoritmicas;

import java.util.Scanner;

public class Factorial {
        public static void calcular() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Numero: ");
            int n = sc.nextInt();
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println("Factorial: " + f);
        }
    }

