package Junit.Pruebas.Main;

import java.util.Scanner;
import Junit.Pruebas.Funciones.CalculoPromedio;
import Junit.Pruebas.Funciones.IngresoNotas;
import Junit.Pruebas.Funciones.Redondeo;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calcularNotas(scanner);
        scanner.close();
    }

    public static void calcularNotas(Scanner scanner) {
        System.out.println("¡Bienvenido a la Calculadora de Notas!");
        System.out.println("---------------------------------------");

        System.out.println("\nCurso 1:");
        double[] notasCurso1 = IngresoNotas.ingresarNotas(scanner, 4);
        double notaDefinitivaCurso1 = Redondeo.redondear(CalculoPromedio.calcularPromedioAritmetico(notasCurso1));

        System.out.println("\nCurso 2:");
        double[] notasCurso2 = IngresoNotas.ingresarNotas(scanner, 4);
        double notaDefinitivaCurso2 = Redondeo.redondear(CalculoPromedio.calcularPromedioPonderado(notasCurso2));

        System.out.println("\nResumen de Notas:");
        System.out.println("Nota definitiva del primer curso: " + notaDefinitivaCurso1);
        System.out.println("Nota definitiva del segundo curso: " + notaDefinitivaCurso2);

        if (notaDefinitivaCurso1 >= 3 && notaDefinitivaCurso2 >= 3) {
            System.out.println("\n¡Felicitaciones! El estudiante pasa ambos cursos.");
        } else {
            System.out.println("\nLo siento, el estudiante no pasa ambos cursos.");
        }
    }
}
