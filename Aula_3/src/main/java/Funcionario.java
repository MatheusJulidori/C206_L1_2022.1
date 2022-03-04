public class Funcionario {

    int idade;
    String cpf;
    String nome;
    double salario;

    public Funcionario(String nome,int idade, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.cpf=cpf;
    }

    public Funcionario(){
        this.nome = "Nome gnérico";
    }


    void tirarFerias(String mes){
        System.out.println("Funcionario " + nome + " vai tirar ferias em" + mes);
    }

    double calculaSalarioAnual(){
        return 12*salario;
    }

}
