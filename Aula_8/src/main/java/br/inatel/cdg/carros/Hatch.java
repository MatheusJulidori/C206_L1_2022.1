package br.inatel.cdg.carros;

public class Hatch extends Carro{

    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public void taxa() {
        System.out.println("Valor do IPVA = " + 0.03*this.getValor());
    }

    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Numero de portas :" + this.portas);
    }

}
