/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package my.com.maer.poo.programacion_a_objetos;

import my.com.maer.poo.animals.Aguilla;
import my.com.maer.poo.animals.Animal;
import my.com.maer.poo.polimorfismo.Estudiante;
import my.com.maer.poo.polimorfismo.Profesor;


/**
 *
 * @author miguel.esparza
 */
public class Programacion_a_objetos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Profesor profesor= new Profesor("Pedro Valenzuela", "pvalenzuela@gmail.com");
        System.out.println(profesor);
        
                
        Estudiante estudiante= new Estudiante ("Miguel Esparza" , "migue_esparza@hotmail.com");
        System.out.println(estudiante);
        //estudiante.presentacion();
        
        Estudiante estudiante2= new Estudiante ("Luis Alejandro" , "lalejandro@hotmail.com");
        System.out.println(estudiante2);
        //estudiante.presentacion();
                
                
        Animal aguila = new Aguilla();
        
        aguila.comer();
    }
}
