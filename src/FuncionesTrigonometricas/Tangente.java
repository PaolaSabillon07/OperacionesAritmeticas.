package FuncionesTrigonometricas;

import java.util.Scanner;

public class Tangente {
    public static void calcular() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angulo en grados: ");
        double g = sc.nextDouble();
        System.out.println("Resultado: " + Math.tan(Math.toRadians(g)));
    }

}
