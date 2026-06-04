package br.com.interpreter;

public class SomaTributo implements InterpretadorExpressao {

    private InterpretadorExpressao esquerda;
    private InterpretadorExpressao direita;

    public SomaTributo(
            InterpretadorExpressao esquerda,
            InterpretadorExpressao direita) {

        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double interpretar() {
        return esquerda.interpretar()
                + direita.interpretar();
    }
}