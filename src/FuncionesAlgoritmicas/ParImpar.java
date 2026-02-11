package FuncionesAlgoritmicas;

import java.util.Scanner;

public class ParImpar {
    public static void calcular() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}

