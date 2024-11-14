
package my.com.maer.poo.polimorfismo;

/**
 *
 * @author miguel.esparza
 */
public class Estudiante extends AsistenteClase{
    
    String nombre;
    String correo;

    
    public Estudiante(String nombre, String luisusg, int par){
            this.nombre = nombre;
            this.correo = correo;
    }   
     public Estudiante(String nombre, int correo){
            this.nombre = nombre;
           
    }  
      public Estudiante(String nombre, double correo){
          /*this.nombre = nombre;
          this.correo = correo;*/
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
        return "Estudiante(" + nombre + ", " + correo + ")";
    }
    
}
