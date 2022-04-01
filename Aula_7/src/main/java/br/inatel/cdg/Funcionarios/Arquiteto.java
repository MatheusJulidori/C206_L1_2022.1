package br.inatel.cdg.Funcionarios;

public class Arquiteto extends Funcionario{

    public Arquiteto(String nome,int idade,double salario,String especialidade){
        this.setIdade(idade);
        this.setNome(nome);
        this.setSalario(salario);
        this.especialidade = especialidade;

    }

    private String especialidade;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especialidade: "+especialidade);
    }

}
