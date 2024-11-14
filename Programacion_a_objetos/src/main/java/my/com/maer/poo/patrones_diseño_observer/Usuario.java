package my.com.maer.poo.patrones_diseño_observer;


/**
 *
 * @author miguel.esparza
 */
public class Usuario implements Subscriptor{
    private String nombre;
    
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void actualizar(String contenido) {
        System.out.println(nombre + ", has recibido una newsletter: ");
        System.out.println(contenido);
    }
    
}

