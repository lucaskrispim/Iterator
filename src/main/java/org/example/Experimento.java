package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Experimento implements Iterable<Medicao> {

    private List<Medicao> medicoes = new ArrayList<Medicao>();

    public Experimento(Medicao... medicoes) {
        this.medicoes = Arrays.asList(medicoes);
    }

    @Override
    public Iterator<Medicao> iterator() {
        return medicoes.iterator();
    }
}
