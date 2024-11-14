/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.com.maer.poo.patrones_diseño_decorator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguel.esparza
 */
public class Tarea1 implements Tarea {

    @Override
    public void ejecutar() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Decorator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
