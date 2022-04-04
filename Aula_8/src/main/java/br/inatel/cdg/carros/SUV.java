package br.inatel.cdg.carros;

public class SUV extends Carro{

    private String tracao;

    public String getTracao() {
        return tracao;
    }

    public void setTracao(String tracao) {
        this.tracao = tracao;
    }

    @Override
    public void taxa() {
        System.out.println("Valor do IPVA = " + 0.035*this.getValor());
    }
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tração :" + this.tracao);
    }

    public void ligarTracao(){
        if(tracao.equals("4x4")){
            tracao= "2x4";
            System.out.println("Tração 4x4 desligada");
        }else{
            tracao="4x4";
            System.out.println("Tração 4x4 ligada");
        }
    }

}
