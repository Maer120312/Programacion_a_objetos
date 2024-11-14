
package my.com.maer.poo.polimorfismo;

/**
 *
 * @author miguel.esparza
 */
public class Profesor extends AsistenteClase{

    String nombre;
    String correo;
    private String contraseña;
    
    public Profesor(String miguel_Esparza){}
    
    public Profesor(String nombre, String correo){
            this.nombre = nombre;
            this.correo = correo;
    }
    public Profesor(String nombre, String correo, String contraseña){
            this.nombre = nombre;
            this.correo = correo;
            this.contraseña = contraseña;
            this.id = id;
    }
    
    @Override
    public void presentacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void examen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void proyecto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Profesor(" + nombre + ", " + correo + ")";
    }
    
}
