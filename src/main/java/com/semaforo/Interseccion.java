package com.semaforo;

import java.util.ArrayList;
import java.util.List;

public class Interseccion {
    private List<Semaforo> semaforos;

    public Interseccion() {
        semaforos = new ArrayList<>();
        inicializarSemaforos();
    }

    private void inicializarSemaforos() {
        Semaforo s1 = new Semaforo("s1");
        Semaforo s2 = new Semaforo("s2");
        Semaforo s3 = new Semaforo("s3");
        Semaforo s4 = new Semaforo("s4");

        semaforos.add(s1);
        semaforos.add(s2);
        semaforos.add(s3);
        semaforos.add(s4);
    }

    public List<Semaforo> getSemaforos() {
        return semaforos;
    }
}
