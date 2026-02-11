package Menus;

import java.util.Scanner;
import FuncionesTrigonometricas.*;

public class MenuFuncionesTrigonometricas {

    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n--- Funciones Trigonometricas ---");
            System.out.println("1. Seno");
            System.out.println("2. Coseno");
            System.out.println("3. Tangente");
            System.out.println("4. Volver");
            System.out.print("Opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> Seno.calcular();
                case 2 -> Coseno.calcular();
                case 3 -> Tangente.calcular();
                case 4 -> System.out.println("Volviendo...");
                default -> System.out.println("Opcion invalida.");
            }

        } while (opc != 4);
    }
}
