package br.inatel.cdg;

import br.inatel.cdg.carros.Carro;
import br.inatel.cdg.carros.Hatch;
import br.inatel.cdg.carros.SUV;
import br.inatel.cdg.carros.Sedan;

public class Main {

    public static void main(String[] args) {

        Carro[] carros = new Carro[5];

        SUV suv = new SUV();
        Sedan sedan = new Sedan();
        Hatch hatch = new Hatch();

        suv.setTracao("4x4");
        suv.setAno(2020);
        suv.setCor("Preto");
        suv.setValor(100000);

        sedan.setPortaMalas(400);
        sedan.setAno(2022);
        sedan.setCor("Preto");
        sedan.setValor(90000);

        hatch.setPortas(2);
        hatch.setAno(2018);
        hatch.setCor("Branco");
        hatch.setValor(50000);

        carros[0] = suv;
        carros[1] = sedan;
        carros[2] = hatch;

        for(Carro carro : carros){
            if(carro!=null){
                carro.mostraInfo();
                carro.taxa();
                if(carro instanceof SUV){
                    SUV s = (SUV)carro;
                    s.ligarTracao();
                }
            }
        }

    }

}
