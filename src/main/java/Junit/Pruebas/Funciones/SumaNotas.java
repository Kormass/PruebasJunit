package Junit.Pruebas.Funciones;

public class SumaNotas {
    public static double sumarNotas(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma;
    }
}
