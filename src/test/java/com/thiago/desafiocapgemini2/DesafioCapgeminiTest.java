package com.thiago.desafiocapgemini2;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class DesafioCapgeminiTest {

    private final DesafioCapgemini desafioCapgemini = new DesafioCapgemini();

    @Test
    void whenGivenAnIntegerOddArrayItShouldReturnAMedian() {
        assertEquals(4, desafioCapgemini.questao1(new int[]{9, 2, 1, 4, 6}));
        assertEquals(6, desafioCapgemini.questao1(new int[]{6, 3, 8, 12, 1}));
        assertEquals(7, desafioCapgemini.questao1(new int[]{5, 15, 10, 7, 3, 1, 23}));
    }

    @Test
    void whenGivenAnArrayAndAValueItShouldReturnTheNumberOfCouplesOfSubtractionsEqualsToGivenValue() {
        assertEquals(3, desafioCapgemini.questao2(new int[]{1, 5, 3, 4, 2}, 2));
    }

    @Test
    void whenGivenAPhaseItShouldReturnAnEncryptedPhaseLikeARule() {
        assertEquals("taoa eum nmd hbi", desafioCapgemini.questao3("tenha um bom dia"));
        assertEquals("omd luo an", desafioCapgemini.questao3("ola mundo"));
        assertEquals("oouem repia auad tade oror roro", desafioCapgemini.questao3("o rato roeu a roupa do rei de roma"));
    }
}