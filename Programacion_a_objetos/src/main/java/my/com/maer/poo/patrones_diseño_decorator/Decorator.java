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
public class Decorator implements Tarea{
    private Tarea t;
    
    public Decorator(Tarea tarea){
        t = tarea;
    }

    @Override
    public void ejecutar() {
        long inicio = System.nanoTime();
        t.ejecutar();
        long fin = System.nanoTime();
        
        System.out.println("Tiempo de ejecución: " + (fin-inicio) );
    }
}
