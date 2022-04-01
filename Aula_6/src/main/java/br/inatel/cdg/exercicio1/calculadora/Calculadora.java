package br.inatel.cdg.exercicio1.calculadora;

public class Calculadora {

    private static double PI = 3.14;
    private static int qtdUsada = 0;

    public static double circunferencia(double raio){
        qtdUsada++;
        return 2*PI*raio*raio;
    }

    public static double volume(double raio){
        qtdUsada++;
        return (4.0/3)*PI*raio*raio*raio;
    }

    public static int getQtdUsada(){
        return qtdUsada;
    }

    public static void setPI(double _PI){//Operador "this." não funciona em atributos estáticos
        PI = _PI;
    }

}
