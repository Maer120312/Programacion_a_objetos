
package my.com.maer.poo.programacion_a_objetos;

import my.com.maer.poo.animals.Aguilla;
import my.com.maer.poo.animals.Animal;
import my.com.maer.poo.polimorfismo.Estudiante;
import my.com.maer.poo.polimorfismo.Profesor;
import my.com.maer.poo.patrones_de_diseno.Builder.ConstructorPersona;
import my.com.maer.poo.patrones_de_diseno.Builder.Persona;
import my.com.maer.poo.patrones_diseño_decorator.Decorator;
import my.com.maer.poo.patrones_diseño_decorator.Primo;
import my.com.maer.poo.patrones_diseño_decorator.PrimoOptimizado;
import my.com.maer.poo.patrones_diseño_decorator.Tarea;
import my.com.maer.poo.patrones_diseño_observer.Manager;
import my.com.maer.poo.patrones_diseño_observer.Usuario;
import my.com.maer.poo.patrones_diseño_observer.Subscriptor;



/**
 *
 * @author miguel.esparza
 */
public class Programacion_a_objetos {

    public static void main(String[] args) 
    {
        
        Estudiante e1 = new Estudiante("Pedro", "luis@usg", 3);
        Estudiante e2 = new Estudiante("miguel Esparza", "luis@usg", 3 );
        Estudiante e3 = new Estudiante("Lus Fernando" , "luis@usg" , 3 );
        
        Profesor p0 = new Profesor("miguel Esparza");
        //Profesor p1 = new Profesor("Pedro");
        Profesor p2 = new Profesor("miguel Esparza");
        //Profesor p3 = new Profesor("Lus Fernando");
        Profesor p4 = new Profesor("Lus Fernando","1221213");
        //p4.id = 9;
        
        System.exit(0);
        
        
        Profesor profesor= new Profesor("Pedro Valenzuela", "pvalenzuela@gmail.com");
        System.out.println(profesor);
        
                
        Estudiante estudiante= new Estudiante ("Miguel Esparza", "luis@usg", 3 );
        System.out.println(estudiante);
        //estudiante.presentacion();
        
        Estudiante estudiante2= new Estudiante ("Luis Alejandro", "luis@usg", 3 );
        System.out.println(estudiante2);
        //estudiante.presentacion();
                
                
        Animal aguila = new Aguilla();
        
        aguila.comer();
        
        
    }
    

    
}
