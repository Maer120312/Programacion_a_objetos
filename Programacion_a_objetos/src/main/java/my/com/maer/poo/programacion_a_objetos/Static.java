
package my.com.maer.poo.programacion_a_objetos;

/**
 *
 * @author miguel.esparza
 */
public class Static {

    static int cont;
    
    public Static(){
        cont++;
    }
    
    public static void funcionEstatica(){
        System.out.println("Funcion estática");
    }
    
    public void funcionNoEstatica(){
        System.out.println("Función no estática");
    }
}