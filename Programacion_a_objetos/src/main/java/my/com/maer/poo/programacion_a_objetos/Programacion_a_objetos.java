
package my.com.maer.poo.programacion_a_objetos;

import my.com.maer.poo.animals.Aguilla;
import my.com.maer.poo.animals.Animal;
import my.com.maer.poo.polimorfismo.Estudiante;
import my.com.maer.poo.polimorfismo.Profesor;
import my.com.maer.poo.patrones_de_diseno.Builder.ConstructorPersona;
import my.com.maer.poo.patrones_de_diseno.Builder.Persona;
import my.com.maer.poo.patrones_de_diseno.PuertoSerie;
import my.com.maer.poo.patrones_diseño_decorator.Decorator;
import my.com.maer.poo.patrones_diseño_decorator.Primo;
import my.com.maer.poo.patrones_diseño_decorator.PrimoOptimizado;
import my.com.maer.poo.patrones_diseño_decorator.Tarea;
import my.com.maer.poo.patrones_diseño_observer.Manager;
import my.com.maer.poo.patrones_diseño_observer.Usuario;
import my.com.maer.poo.patrones_diseño_observer.Subscriptor;
import my.com.maer.poo.Tercer_parcial.Sumar;
import mx.com.vafis.poo.tercerparcial.proyectofinal.Memorama;



/**
 *
 * @author miguel.esparza
 */
public class Programacion_a_objetos {

    public static void main(String[] args) 
    {
        
                Manager manager = new Manager();
        
        Subscriptor usuario1 = new Usuario("Miguel");
        Subscriptor usuario2 = new Usuario("Victor");
        
        manager.agregarSubscriptor(usuario1);
        manager.agregarSubscriptor(usuario2);
        
        manager.publicarNewsletter("Primera newsletter");
        
        Subscriptor usuario3 = new Usuario("Pedro");
        manager.agregarSubscriptor(usuario3);
        
        manager.publicarNewsletter("Segunda newsletter");
        
        manager.eliminarSubscriptor(usuario2);
        
        manager.publicarNewsletter("Ultima newsletter");
        
        System.exit(0);
        
//        Tarea t1 = new Tarea1();
//        Decorator d1 = new Decorator(t1);
//        d1.ejecutar();
//        
//        Tarea t2 = new Tarea2();
//        Decorator d2 = new Decorator(t2);
//        d2.ejecutar();
//        
//        Tarea t3 = new Tarea3();
//        Decorator d3 = new Decorator(t3);
//        d3.ejecutar();
//        
//        Tarea t4 = new Tarea4();
//        Decorator d4 = new Decorator(t4);
//        d4.ejecutar();
       
        Tarea t1 = new Primo(999983); // 29989 999983
        Decorator d1 = new Decorator(t1);
        d1.ejecutar();
        
        Tarea t2 = new PrimoOptimizado(999983); // 29989 999983
        Decorator d2 = new Decorator(t2);
        d2.ejecutar();
        
        System.exit(0);
        
        ConstructorPersona cp = new ConstructorPersona();
        cp.setNombre("Pedro");
        cp.setApellido("Valenzuela");
        cp.setOcupacion("Profesor");
        
        Persona persona = cp.construir();
        
        System.out.println(persona);
        
        System.exit(0);
        
        PuertoSerie ps1 = PuertoSerie.obtenerInstancia();
        //PuertoSerie ps2 = new PuertoSerie();
        PuertoSerie ps2 = PuertoSerie.obtenerInstancia();
        PuertoSerie ps3 = PuertoSerie.obtenerInstancia();
        
        System.out.println(ps1);
        System.out.println(ps2);
        System.out.println(ps3);
        
        System.exit(0);
        
        Static.funcionEstatica();
        
        Static s = new Static();
        s.funcionNoEstatica();
        
        
        Static s2 = new Static();
        Static s3 = new Static();
        Static s4 = new Static();
        Static s5 = new Static();
        
        System.exit(0);
        
       
        
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
