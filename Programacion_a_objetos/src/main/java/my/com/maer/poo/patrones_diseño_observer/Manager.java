package my.com.maer.poo.patrones_diseño_observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author miguel.esparza
 */
public class Manager implements Newsletter{
    
    private List<Subscriptor> subscriptores = new ArrayList<>();
    private String ultimaNewsletter;
    
    @Override
    public void agregarSubscriptor(Subscriptor s) {
        subscriptores.add((Subscriptor) s);
    }

    @Override
    public void eliminarSubscriptor(Subscriptor s) {
        subscriptores.remove(s);
    }

    @Override
    public void notificar() {
        for(Subscriptor s : subscriptores){
            s.actualizar(ultimaNewsletter);
        }
    }
        public void publicarNewsletter(String contenido){
        this.ultimaNewsletter = contenido;
        
        notificar();
    }
    
}

