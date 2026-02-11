package Menus;

import java.util.Scanner;

public class MenuPrincipal {
    public static void mostrar() {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Funciones Aritmeticas");
            System.out.println("2. Funciones Trigonometricas");
            System.out.println("3. Funciones Algoritmicas");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opc= sc.nextInt();

            switch (opc) {
                case 1 -> MenuFuncionesAritmeticas.mostrar();
                case 2 -> MenuFuncionesTrigonometricas.mostrar();
                case 3 -> MenuFuncionesAlgoritmicas.mostrar();
                case 4 -> System.out.println("Gracias por usar nuestra Calculadora.");
                default -> System.out.println("Opcion invalida.");
            }

        } while (opc != 4);
    }
}


