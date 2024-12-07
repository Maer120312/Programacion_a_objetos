package memorama;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.BasicStroke;

public class ImagenPlaceholder {
    private static final Color COLOR_PRINCIPAL = Color.decode("#f40c3c");
    
    public static ImageIcon crearImagenCarta(int numero, Color color) {
        BufferedImage imagen = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagen.createGraphics();
        
        // Dibujar fondo
        g2d.setColor(color);
        g2d.fillRect(0, 0, 100, 100);
        
        // Dibujar borde más grueso
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawRect(1, 1, 97, 97);
        
        // Dibujar número con mejor contraste
        g2d.setColor(Color.WHITE);
        g2d.setFont(g2d.getFont().deriveFont(36f)); // Número más grande
        String texto = String.valueOf(numero);
        int stringWidth = g2d.getFontMetrics().stringWidth(texto);
        g2d.drawString(texto, (100 - stringWidth) / 2, 65);
        
        g2d.dispose();
        return new ImageIcon(imagen);
    }

    public static ImageIcon crearImagenReverso() {
        BufferedImage imagen = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = imagen.createGraphics();
        
        // Dibujar fondo con el color principal más oscuro
        Color colorFondo = new Color(
            COLOR_PRINCIPAL.getRed() / 2,
            COLOR_PRINCIPAL.getGreen() / 2,
            COLOR_PRINCIPAL.getBlue() / 2
        );
        g2d.setColor(colorFondo);
        g2d.fillRect(0, 0, 100, 100);
        
        // Dibujar patrón con el color principal
        g2d.setColor(COLOR_PRINCIPAL);
        g2d.setStroke(new BasicStroke(1.5f));
        for (int i = 0; i < 100; i += 15) {
            g2d.drawLine(i, 0, i, 100);
            g2d.drawLine(0, i, 100, i);
        }
        
        // Dibujar borde
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawRect(1, 1, 97, 97);
        
        g2d.dispose();
        return new ImageIcon(imagen);
    }
}