package memorama;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public final class Carta extends JButton {
    private ImageIcon imagenCarta;
    private ImageIcon imagenReverso;
    private boolean estaVolteada;
    private final int id;
    private static final int CARD_WIDTH = 100;
    private static final int CARD_HEIGHT = 100;
    private static final Color COLOR_REVERSO = new Color(200, 200, 200); // Gris claro para el reverso

    public Carta(int id, Color color) {
        this.id = id;
        this.estaVolteada = false;
        
        // Usar ImagenPlaceholder para crear las imágenes con el color específico
        this.imagenCarta = ImagenPlaceholder.crearImagenCarta(id + 1, color);
        this.imagenReverso = ImagenPlaceholder.crearImagenReverso();
        
        // Configurar el botón
        setPreferredSize(new Dimension(CARD_WIDTH, CARD_HEIGHT));
        setBorderPainted(true);
        setFocusPainted(false);
        mostrarReverso();
    }

    public void voltear() {
        estaVolteada = !estaVolteada;
        if (estaVolteada) {
            setIcon(imagenCarta);
        } else {
            mostrarReverso();
        }
        repaint();
    }

    public void mostrarReverso() {
        setIcon(imagenReverso);
        estaVolteada = false;
        repaint();
    }

    public boolean estaVolteada() {
        return estaVolteada;
    }

    public int getId() {
        return id;
    }

    public void bloquear() {
        setEnabled(false);
        estaVolteada = true;
    }

    public void desbloquear() {
        setEnabled(true);
        mostrarReverso();
    }

    public ImageIcon getImagenCarta() {
        return imagenCarta;
    }

    public void setImagenCarta(ImageIcon imagenCarta) {
        this.imagenCarta = imagenCarta;
        if (estaVolteada) {
            setIcon(imagenCarta);
        }
    }

    public ImageIcon getImagenReverso() {
        return imagenReverso;
    }

    public void setImagenReverso(ImageIcon imagenReverso) {
        this.imagenReverso = imagenReverso;
        if (!estaVolteada) {
            setIcon(imagenReverso);
        }
    }
}