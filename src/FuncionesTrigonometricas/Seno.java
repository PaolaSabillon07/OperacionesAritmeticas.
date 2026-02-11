package FuncionesTrigonometricas;

import java.util.Scanner;

public class Seno {
    public static void calcular() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angulo en grados: ");
        double g = sc.nextDouble();
        System.out.println("Resultado: " + Math.sin(Math.toRadians(g)));
    }
}
