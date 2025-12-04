// src/test/java/com/cashmind/CalculadoraTest.java

package com.cashmind;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de Teste para a classe Calculadora.
 * O nome da classe deve terminar em 'Test'.
 */
public class CalculadoraTest {

    // Teste 1: Verifica se a soma de 2 + 3 é igual a 5.
    @Test
    void testarSomaSimples() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        
        // Assertions.assertEquals verifica se o valor esperado é igual ao valor real
        assertEquals(5, resultado, "A soma de 2 e 3 deve ser 5");
    }

    // Teste 2: Verifica se um número positivo é reconhecido corretamente.
    @Test
    void testarNumeroPositivo() {
        Calculadora calc = new Calculadora();
        
        // Assertions.assertTrue verifica se a condição é verdadeira
        assertTrue(calc.isPositivo(10), "10 deve ser considerado positivo");
    }
    
    // Teste 3: Verifica se a soma de números negativos funciona.
    @Test
    void testarSomaNegativos() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(-5, -2);
        assertEquals(-7, resultado, "A soma de -5 e -2 deve ser -7");
    }
}
