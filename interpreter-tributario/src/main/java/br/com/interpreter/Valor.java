package br.com.interpreter;

public class Valor implements InterpretadorExpressao {

    private double valor;

    public Valor(double valor) {
        this.valor = valor;
    }

    @Override
    public double interpretar() {
        return valor;
    }
}