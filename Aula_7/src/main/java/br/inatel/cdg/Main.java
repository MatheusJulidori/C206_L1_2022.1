package br.inatel.cdg;

import br.inatel.cdg.Funcionarios.Arquiteto;
import br.inatel.cdg.Funcionarios.Engenheiro;
import br.inatel.cdg.Funcionarios.Funcionario;
import br.inatel.cdg.Funcionarios.Professor;

public class Main {

    public static void main(String[] args) {

        Engenheiro eng = new Engenheiro("Matheus",29,5000,"Computação");
        Arquiteto arq = new Arquiteto("Fulano",21,3000,"Prédios");
        Professor pro = new Professor("Renzo",35,10000,"Banco de Dados");

        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = eng;
        funcionarios[1] = arq;

        for(Funcionario funcionario: funcionarios){
            if(funcionario != null){
                if(funcionario instanceof Engenheiro){
                   Engenheiro e = (Engenheiro)funcionario;
                   e.mostraInfo();
                   e.exibeSalarioAnual();
                }
            }
        }



    }

}
