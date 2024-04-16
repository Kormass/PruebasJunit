package Junit.Pruebas.Funciones;

public class CalculoPromedio {
    public static double calcularPromedioAritmetico(double[] notas) {
        double suma = SumaNotas.sumarNotas(notas);
        return suma / notas.length;
    }

    public static double calcularPromedioPonderado(double[] notas) {
        double[] porcentajes = { 0.15, 0.30, 0.35, 0.20 };
        double sumaPonderada = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaPonderada += notas[i] * porcentajes[i];
        }
        return sumaPonderada;
    }
}
