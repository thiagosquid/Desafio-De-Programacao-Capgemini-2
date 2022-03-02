package com.thiago.desafiocapgemini2;

import java.util.Arrays;

public class DesafioCapgemini {

    public DesafioCapgemini() {
    }

    public int questao1(int[] numeros) {

        if (numeros.length % 2 == 0) {
            throw new RuntimeException("Quantidade de números não é ímpar");
        }
        Arrays.sort(numeros);
        int meio = (int) numeros.length / 2;

        return numeros[meio];
    }

    public int questao2(int[] numeros, int valor) {
        int quantidade = 0;
        int inicio = 0;

        while (inicio < numeros.length) {
            for (int i = inicio + 1; i < numeros.length; i++) {
                int subtracao = Math.abs(numeros[inicio] - numeros[i]);
                if (subtracao == valor) {
                    quantidade++;
                }
            }
            inicio++;
        }

        return quantidade;
    }
}
