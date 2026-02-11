package Menus;

import java.util.Scanner;
import FuncionesAlgoritmicas.*;

public class MenuFuncionesAlgoritmicas {

    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n--- Fucniones Algoritmicas  ---");
            System.out.println("1. Factorial");
            System.out.println("2. Par o Impar");
            System.out.println("3. Volver");
            System.out.print("Opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> Factorial.calcular();
                case 2 -> ParImpar.calcular();
                case 3 -> System.out.println("Volviendo...");
                default -> System.out.println("Opcion invalida.");
            }

        } while (opc != 3);
    }
}
