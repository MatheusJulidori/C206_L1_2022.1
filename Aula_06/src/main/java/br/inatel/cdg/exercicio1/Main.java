package br.inatel.cdg.exercicio1;

import br.inatel.cdg.exercicio1.calculadora.Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrar com o raio: ");
        double raio = sc.nextDouble();

        System.out.println("Quantidade de vezes usada: "+Calculadora.getQtdUsada());

        System.out.println("Circunferencia: "+Calculadora.circunferencia(raio));
        System.out.println("Volume: "+Calculadora.volume(raio));

        System.out.println("Quantidade de vezes usada: "+Calculadora.getQtdUsada());

        System.out.println("Mudando valor de Pi");
        Calculadora.setPI(3.1415);

        System.out.println("Circunferencia: "+Calculadora.circunferencia(raio));
        System.out.println("Volume: "+Calculadora.volume(raio));

        System.out.println("Quantidade de vezes usada: "+Calculadora.getQtdUsada());

        Calculadora.setPI(3.14159265359);
        System.out.println("Circunferencia: "+Calculadora.circunferencia(raio));
        System.out.println("Volume: "+Calculadora.volume(raio));

        System.out.println("Quantidade de vezes usada: "+Calculadora.getQtdUsada());

        Calculadora.setPI(3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679);
        System.out.println("Circunferencia: "+Calculadora.circunferencia(raio));
        System.out.println("Volume: "+Calculadora.volume(raio));

        System.out.println("Quantidade de vezes usada: "+Calculadora.getQtdUsada());

    }

}
