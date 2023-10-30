package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void soma() {
        Calculadora calc = new Calculadora();
        assertEquals(100, calc.Soma(50, 50));
    }

    @Test
    void subtracao() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.Subtracao(50, 50));
    }

    @Test
    void multiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(2500, calc.Multiplicacao(50, 50));
    }

    @Test
    void divisao() {
        Calculadora calc = new Calculadora();
        assertEquals(25, calc.Divisao(51, 2), 1);
    }
}