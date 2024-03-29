package br.inatel.cdg.carros;

import br.inatel.cdg.carros.interfaces.Controle;

public abstract class Carro implements Controle{


    private double valor;
    private String cor;
    private int ano;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void taxa() {

    }

    @Override
    public void mostraInfo() {
        System.out.println("Cor: "+this.getCor());
        System.out.println("Ano: "+this.getAno());
        System.out.println("Valor: "+this.getValor());
    }
}
