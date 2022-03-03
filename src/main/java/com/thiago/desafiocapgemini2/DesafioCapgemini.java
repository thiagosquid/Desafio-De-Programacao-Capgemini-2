package com.thiago.desafiocapgemini2;

import java.util.Arrays;
import java.util.stream.Collectors;

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

    public String questao3(String entrada) {
        String encriptada = "";
        String[] arr = entrada.split(" ");
        String frase = Arrays.stream(arr).collect(Collectors.joining());
        int tamanho = frase.length();
        int matriz = (int) Math.ceil(Math.sqrt(tamanho));
        String[][] encriptArr = new String[matriz][matriz];
        int contador = 0;
        int j = 0;

        while (contador < tamanho) {
            for (int i = 0; i < matriz; i++) {
                encriptArr[j][i] = String.valueOf(frase.charAt(contador));
                contador++;
                if (contador == tamanho) {
                    break;
                }
            }
            j++;
        }

        int k = 0;
        int x = 1;

        while (x < tamanho) {
            for (int i = 0; i < matriz; i++) {

                if (encriptArr[i][k] == null) {
                    continue;
                }
                encriptada += encriptArr[i][k];
                x++;
            }
            k++;
            encriptada += " ";
        }

        return encriptada.trim();
    }
}
