package com.semaforo;

public class Simulador {
    public static void main(String[] args) {
        Interseccion interseccion = new Interseccion();
        TraficoController controlador = new TraficoController(interseccion);

        controlador.actualizarSemaforos();
    }
}
