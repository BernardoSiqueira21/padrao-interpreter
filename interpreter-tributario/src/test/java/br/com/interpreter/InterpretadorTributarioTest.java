package br.com.interpreter;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterpretadorTributarioTest {

    @Test
    public void deveCalcularImposto() {

        InterpretadorCalculoTributario calculadora =
                new InterpretadorCalculoTributario();

        assertEquals(
                1075.0,
                calculadora.calcularImposto(),
                0.01
        );
    }

    @Test
    public void deveSomarValores() {

        InterpretadorExpressao expressao =
                new SomaTributo(
                        new Valor(1000),
                        new Valor(500)
                );

        assertEquals(1500.0,
                expressao.interpretar(),
                0.01);
    }

    @Test
    public void deveSubtrairValores() {

        InterpretadorExpressao expressao =
                new SubtracaoTributo(
                        new Valor(1000),
                        new Valor(300)
                );

        assertEquals(700.0,
                expressao.interpretar(),
                0.01);
    }

    @Test
    public void deveMultiplicarValores() {

        InterpretadorExpressao expressao =
                new MultiplicacaoTributo(
                        new Valor(500),
                        new Valor(0.10)
                );

        assertEquals(50.0,
                expressao.interpretar(),
                0.01);
    }

    @Test
    public void deveDividirValores() {

        InterpretadorExpressao expressao =
                new DivisaoTributo(
                        new Valor(1000),
                        new Valor(2)
                );

        assertEquals(500.0,
                expressao.interpretar(),
                0.01);
    }
}