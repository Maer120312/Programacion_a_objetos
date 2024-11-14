/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package my.com.maer.poo.patrones_diseño_decorator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miguel.esparza
 */
public class Tarea4 implements Tarea {
    public void proceso(){
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarea4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ejecutar() {
        proceso();
    }
}