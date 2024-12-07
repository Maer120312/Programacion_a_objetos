package memorama;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Memorama {
    private List<Carta> cartas;
    private int filas;
    private int columnas;
    private int paresEncontrados;
    private int intentos;
    private int mejorPuntaje;
    private Carta primeraCarta;
    private Carta segundaCarta;
    private boolean juegoTerminado;
    
    private static final Color COLOR_PRINCIPAL = Color.decode("#f40c3c");
    private static final Color[] COLORES = {
        COLOR_PRINCIPAL,
        COLOR_PRINCIPAL,
        COLOR_PRINCIPAL,
        COLOR_PRINCIPAL,
        COLOR_PRINCIPAL,
        COLOR_PRINCIPAL,
        COLOR_PRINCIPAL,
        COLOR_PRINCIPAL
    };

    public Memorama(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.mejorPuntaje = Integer.MAX_VALUE;
        inicializarJuego();
    }

    public Memorama() {
    }

    public void inicializarJuego() {
        cartas = new ArrayList<>();
        paresEncontrados = 0;
        intentos = 0;
        juegoTerminado = false;
        primeraCarta = null;
        segundaCarta = null;

        // Crear pares de cartas
        int totalPares = (filas * columnas) / 2;
        for (int i = 0; i < totalPares; i++) {
            Color colorCarta = COLORES[i % COLORES.length];
            cartas.add(new Carta(i, colorCarta));
            cartas.add(new Carta(i, colorCarta));
        }

        // Mezclar las cartas
        Collections.shuffle(cartas);
    }

    public boolean seleccionarCarta(Carta carta) {
        // No permitir seleccionar cartas ya emparejadas o volteadas
        if (carta.estaVolteada() || !carta.isEnabled() || juegoTerminado) {
            return false;
        }

        // Si ya hay dos cartas seleccionadas, ocultar las cartas anteriores
        if (primeraCarta != null && segundaCarta != null) {
            ocultarCartasNoEmparejadas();
            primeraCarta = null;
            segundaCarta = null;
        }

        // Voltear la carta seleccionada
        carta.voltear();

        // Si es la primera carta
        if (primeraCarta == null) {
            primeraCarta = carta;
            return true;
        }

        // Si es la segunda carta y es diferente a la primera
        if (primeraCarta != carta) {
            segundaCarta = carta;
            intentos++;
            
            // Verificar si son pareja
            if (primeraCarta.getId() == segundaCarta.getId()) {
                // Son pareja, bloquearlas
                primeraCarta.bloquear();
                segundaCarta.bloquear();
                paresEncontrados++;
                
                if (paresEncontrados == (filas * columnas) / 2) {
                    juegoTerminado = true;
                    if (intentos < mejorPuntaje) {
                        mejorPuntaje = intentos;
                    }
                }
                
                primeraCarta = null;
                segundaCarta = null;
            }
            return true;
        }

        return false;
    }

    public void ocultarCartasNoEmparejadas() {
        if (primeraCarta != null && !primeraCarta.isEnabled()) {
            return; // No ocultar cartas que ya están emparejadas
        }
        
        if (primeraCarta != null) {
            primeraCarta.mostrarReverso();
        }
        if (segundaCarta != null) {
            segundaCarta.mostrarReverso();
        }
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getMejorPuntaje() {
        return mejorPuntaje == Integer.MAX_VALUE ? 0 : mejorPuntaje;
    }

    public boolean isJuegoTerminado() {
        return juegoTerminado;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}