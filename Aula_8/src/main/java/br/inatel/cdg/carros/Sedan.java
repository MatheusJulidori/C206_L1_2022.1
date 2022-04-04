package br.inatel.cdg.carros;

public class Sedan extends Carro{

    private int portaMalas;

    public int getPortaMalas() {
        return portaMalas;
    }

    public void setPortaMalas(int portaMalas) {
        this.portaMalas = portaMalas;
    }

    @Override
    public void taxa() {
        System.out.println("Valor do IPVA = " + 0.034*this.getValor());
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Capacidade do porta malas: "+this.portaMalas+"L");
    }


}
