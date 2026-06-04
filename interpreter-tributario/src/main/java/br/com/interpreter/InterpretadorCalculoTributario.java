package br.com.interpreter;

public class InterpretadorCalculoTributario {

    public double calcularImposto() {

        InterpretadorExpressao valorBase =
                new Valor(1000);

        InterpretadorExpressao imposto =
                new MultiplicacaoTributo(
                        new Valor(500),
                        new Valor(0.15)
                );

        InterpretadorExpressao resultado =
                new SomaTributo(valorBase, imposto);

        return resultado.interpretar();
    }
}