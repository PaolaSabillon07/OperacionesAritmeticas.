package Menus;

import FuncionesAritmeticas.Division;
import FuncionesAritmeticas.Multiplicacion;
import FuncionesAritmeticas.Resta;
import FuncionesAritmeticas.Suma;

import java.util.Scanner;

public class MenuFuncionesAritmeticas {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n--- Funciones Aritmeticas ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Volver");
            System.out.print("Opcion: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1 -> Suma.calcular();
                case 2 -> Resta.calcular();
                case 3 -> Multiplicacion.calcular();
                case 4 -> Division.calcular();
                case 5 -> System.out.println("Volviendo...");
                default -> System.out.println("Opcion invalida.");
            }

        } while (opc != 5);
    }
}


