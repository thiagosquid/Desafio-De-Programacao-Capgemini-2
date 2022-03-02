package com.thiago.desafiocapgemini2;

public class Main {

    private static final DesafioCapgemini DESAFIO_CAPGEMINI = new DesafioCapgemini();

    public static void main(String[] args) {
        System.out.println("==== Questão 1 ====");
        int[] listaNumeros = {9,2,1,4,6};
        int mediana = DESAFIO_CAPGEMINI.questao1(listaNumeros);
        System.out.println(mediana);
    }

}
