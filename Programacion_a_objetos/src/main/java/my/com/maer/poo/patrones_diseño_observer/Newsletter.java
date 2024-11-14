/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package my.com.maer.poo.patrones_diseño_observer;

/**
 *
 * @author miguel.esparza
 */
public interface Newsletter {
    
    void agregarSubscriptor(Subscriptor s);
    void eliminarSubscriptor(Subscriptor s);
    
    void notificar();
    
}
