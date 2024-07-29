package org.example;

import java.util.Iterator;

public class Laboratorio {

    public static Integer contarMedicoesAtivasExperimento(Experimento experimento) {
        int quantidade = 0;
        for (Medicao medicao : experimento) {
            if (medicao.isAtiva()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalMedicoesExperimento(Experimento experimento) {
        int quantidade = 0;
        for (Iterator<Medicao> it = experimento.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }
}

