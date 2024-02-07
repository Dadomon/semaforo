package com.semaforo;



public class Semaforo {
    public enum EstadoSemaforo {
        ROJO, AMBAR, VERDE, VERDE_IZQUIERDA
    }
    private String id;
    private EstadoSemaforo estado;

    public Semaforo(String id) {
        this.id = id;
        this.estado = EstadoSemaforo.ROJO;
    }

    public EstadoSemaforo getEstado() {
        return estado;
    }

    public void cambiarEstado(EstadoSemaforo nuevoEstado) {
        this.estado = nuevoEstado;
    }
}


