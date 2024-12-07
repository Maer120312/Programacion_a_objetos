package memorama;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class UI extends JFrame {
    private Memorama juego;
    private JPanel panelCartas;
    private JLabel labelIntentos;
    private JLabel labelMejorPuntaje;
    private Timer timerVolteo;
    private static final int DELAY_VOLTEO = 800; // Reduced from 1000 to 800ms for better UX

    public UI(int filas, int columnas) {
        juego = new Memorama(filas, columnas);
        inicializarUI();
    }

    private void inicializarUI() {
        setTitle("Memorama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Panel superior con información del juego
        JPanel panelInfo = new JPanel();
        panelInfo.setLayout(new FlowLayout());
        labelIntentos = new JLabel("Intentos: 0");
        labelMejorPuntaje = new JLabel("Mejor Puntaje: " + juego.getMejorPuntaje());
        JButton botonNuevo = new JButton("Nuevo Juego");
        
        panelInfo.add(labelIntentos);
        panelInfo.add(labelMejorPuntaje);
        panelInfo.add(botonNuevo);
        add(panelInfo, BorderLayout.NORTH);

        // Panel de cartas
        panelCartas = new JPanel(new GridLayout(juego.getFilas(), juego.getColumnas(), 5, 5));
        panelCartas.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        actualizarTablero();
        add(panelCartas, BorderLayout.CENTER);

        // Timer para voltear cartas no emparejadas
        timerVolteo = new Timer(DELAY_VOLTEO, (ActionEvent e) -> {
            juego.ocultarCartasNoEmparejadas();
            actualizarUI();
            timerVolteo.stop(); // Asegurar que el timer se detenga después de ocultar las cartas
        });
        timerVolteo.setRepeats(false);

        // Acción del botón Nuevo Juego
        botonNuevo.addActionListener((ActionEvent e) -> {
            reiniciarJuego();
        });

        pack();
        setLocationRelativeTo(null);
    }

    private void actualizarTablero() {
        panelCartas.removeAll();
        for (final Carta carta : juego.getCartas()) {
            carta.addActionListener((ActionEvent e) -> {
                manejarClickCarta(carta);
            });
            panelCartas.add(carta);
        }
        panelCartas.revalidate();
        panelCartas.repaint();
    }

    private void manejarClickCarta(Carta carta) {
        // Detener el timer si está corriendo
        if (timerVolteo.isRunning()) {
            timerVolteo.stop();
            juego.ocultarCartasNoEmparejadas();
        }

        if (juego.seleccionarCarta(carta)) {
            actualizarUI();
            if (!juego.isJuegoTerminado()) {
                timerVolteo.restart();
            } else {
                mostrarMensajeVictoria();
            }
        }
    }

    private void actualizarUI() {
        labelIntentos.setText("Intentos: " + juego.getIntentos());
        labelMejorPuntaje.setText("Mejor Puntaje: " + juego.getMejorPuntaje());
        panelCartas.repaint();
    }

    private void reiniciarJuego() {
        timerVolteo.stop();
        juego.inicializarJuego();
        actualizarTablero();
        actualizarUI();
    }

    private void mostrarMensajeVictoria() {
        JOptionPane.showMessageDialog(this,
            "¡Felicidades! Has completado el juego en " + juego.getIntentos() + " intentos.\n" +
            "Mejor puntaje: " + juego.getMejorPuntaje(),
            "¡Victoria!",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new UI(4, 4).setVisible(true);
        });
    }

    public Memorama getJuego() {
        return juego;
    }

    public void setJuego(Memorama juego) {
        this.juego = juego;
    }
}