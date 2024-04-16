package Junit.Pruebas.Test;


import Junit.Pruebas.Main.CalculadoraNotas;

public class CalculadoraNotasTest {

    @Test
    public void testPromedioAritmetico() {
        double[] notas = {3.5, 4.0, 3.8, 3.2};
        double resultadoEsperado = 3.625; // (3.5 + 4.0 + 3.8 + 3.2) / 4
        double resultadoObtenido = CalculadoraNotas.calcularPromedioAritmetico(notas);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
    }

    @Test
    public void testPromedioPonderado() {
        double[] notas = {3.5, 4.0, 3.8, 3.2};
        double resultadoEsperado = 3.615; // (3.5*0.15 + 4.0*0.30 + 3.8*0.35 + 3.2*0.20)
        double resultadoObtenido = CalculadoraNotas.calcularPromedioPonderado(notas);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
    }

    @Test
    public void testPasaAmbosCursos() {
        double[] notasCurso1 = {3.5, 4.0, 3.8, 3.2};
        double[] notasCurso2 = {3.7, 3.9, 4.0, 3.8};
        assertTrue(CalculadoraNotas.pasaAmbosCursos(notasCurso1, notasCurso2));
    }

    @Test
    public void testNoPasaAmbosCursos() {
        double[] notasCurso1 = {2.5, 3.0, 3.8, 3.2};
        double[] notasCurso2 = {3.7, 3.9, 4.0, 3.8};
        assertFalse(CalculadoraNotas.pasaAmbosCursos(notasCurso1, notasCurso2));
    }

    @Test
    public void testPasaUnCurso() {
        double[] notasCurso1 = {3.5, 4.0, 3.8, 3.2};
        double[] notasCurso2 = {2.7, 3.9, 4.0, 3.8};
        assertFalse(CalculadoraNotas.pasaAmbosCursos(notasCurso1, notasCurso2));
    }
}
