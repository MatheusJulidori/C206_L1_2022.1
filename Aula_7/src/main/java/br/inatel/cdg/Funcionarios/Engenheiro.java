package br.inatel.cdg.Funcionarios;

public class Engenheiro extends Funcionario{


    public Engenheiro(String nome,int idade,double salario,String ramo){
        this.setIdade(idade);
        this.setNome(nome);
        this.setSalario(salario);
        this.ramo = ramo;

    }

    private String ramo;

    public double exibeSalarioAnual(){
        return this.getSalario() * 12;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Ramo: "+ramo);
    }

}
