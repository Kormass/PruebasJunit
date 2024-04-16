package Junit.Pruebas.Funciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IngresoNotas {
    public static double[] ingresarNotas(Scanner scanner, int cantidad) {
        double[] notas = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            while (true) {
                try {
                    System.out.print("Ingrese la nota " + (i + 1) + " (entre 0 y 5): ");
                    double nota = scanner.nextDouble();
                    if (nota < 0 || nota > 5) {
                        System.out.println("Por favor, ingrese una nota válida entre 0 y 5.");
                    } else {
                        notas[i] = nota;
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, ingresa un número válido.");
                    scanner.next();
                }
            }
        }
        return notas;
    }
}
