package br.inatel.cdg.Funcionarios;

public class Professor extends Funcionario{

    public Professor(String nome,int idade,double salario,String materia){
        this.setIdade(idade);
        this.setNome(nome);
        this.setSalario(salario);
        this.materia = materia;

    }

    private String materia;

}
