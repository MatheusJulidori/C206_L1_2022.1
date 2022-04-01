package br.inatel.cdg.Funcionarios;

public class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    public void mostraInfo(){

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salario: "+salario);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
