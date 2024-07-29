package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaboratorioTest {

    @Test
    void deveContarMedicoesAtivasExperimento() {
        Experimento experimento = new Experimento(
                new Medicao("Medição 1", true),
                new Medicao("Medição 2", true),
                new Medicao("Medição 3", false),
                new Medicao("Medição 4", true)
        );
        assertEquals(3, Laboratorio.contarMedicoesAtivasExperimento(experimento));
    }

    @Test
    void deveContarTotalMedicoesExperimento() {
        Experimento experimento = new Experimento(
                new Medicao("Medição 1", true),
                new Medicao("Medição 2", true),
                new Medicao("Medição 3", false),
                new Medicao("Medição 4", true)
        );
        assertEquals(4, Laboratorio.contarTotalMedicoesExperimento(experimento));
    }

    @Test
    void deveLancarExcecaoParaDescricaoNulaNoSetter() {
        Medicao medicao = new Medicao("Descrição válida", true);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            medicao.setDescricao(null);
        });

        String expectedMessage = "Descrição não pode ser nula ou vazia";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void deveLancarExcecaoParaDescricaoVaziaNoSetter() {
        Medicao medicao = new Medicao("Descrição válida", true);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            medicao.setDescricao("");
        });

        String expectedMessage = "Descrição não pode ser nula ou vazia";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void deveLancarExcecaoParaDescricaoComEspacosApenasNoSetter() {
        Medicao medicao = new Medicao("Descrição válida", true);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            medicao.setDescricao("   ");
        });

        String expectedMessage = "Descrição não pode ser nula ou vazia";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}