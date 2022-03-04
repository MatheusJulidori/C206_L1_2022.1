public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Phyll",34,"12345678900");
        Funcionario f2 = new Funcionario();
       // f1.nome = "Phyll";
        //f1.cpf = "12345678900";
        f1.salario = 2000;
        f1.salario =900000;
       // f1.idade = 34;

        f1.tirarFerias("Janeiro");
        System.out.println(f1.calculaSalarioAnual());
        System.out.println(f2.nome);
    }

}
