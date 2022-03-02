package com.thiago.desafiocapgemini2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class DesafioCapgeminiTest {

    private final DesafioCapgemini desafioCapgemini = new DesafioCapgemini();

    @Test
    void quandoForDadoUmArrayImparDeInteirosDeveRetornarAMediana(){
        assertEquals(4, desafioCapgemini.questao1(new int[]{9, 2, 1, 4, 6}));
        assertEquals(6, desafioCapgemini.questao1(new int[]{6, 3, 8, 12, 1}));
        assertEquals(7, desafioCapgemini.questao1(new int[]{5, 15, 10, 7, 3,1,23}));
    }

    @Test
    void quandoForDadoUmArrayEUmValorDeveRetornarONumeroDeParesDeSubtracaoIgualAoValorDado(){
        assertEquals(3,desafioCapgemini.questao2(new int[]{1, 5, 3, 4, 2},2));
    }

}