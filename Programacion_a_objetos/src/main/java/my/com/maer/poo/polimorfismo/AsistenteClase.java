
package my.com.maer.poo.polimorfismo;

/**
 *
 * @author miguel.esparza
 */
public abstract class AsistenteClase {
    
    String nombre;
    String correo;
    protected int id;
    private String contra;
    
    public abstract void presentacion();
    public abstract void examen();
    public abstract void proyecto();
    
    public void setContra(String contra){
        this.contra = contra;
    }
}
