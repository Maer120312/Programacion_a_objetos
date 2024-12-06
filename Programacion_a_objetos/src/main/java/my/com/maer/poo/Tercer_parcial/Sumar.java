/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.com.maer.poo.Tercer_parcial;

/**
 *
 * @author miguel.esparza
 */
public class Sumar {
    public Sumar() {
//        SumaEnteros se = new SumaEnteros();
//        int res_int = se.Suma(3, 4);
//        System.out.println("res_int: " + res_int);
//        
//        
//        SumaDoubles sd = new SumaDoubles();
//        double res_double = sd.Suma(3.8, 4);
//        System.out.println("res_double: " + res_double);
//        
//        SumaStrings ss = new SumaStrings();
//        String res_string = ss.Suma("3.8", "4");
//        System.out.println("res_string: " + res_string);
        
        SumaGenerica sg = new SumaGenerica();
        
        int entero = sg.Suma(3, 4);
        double doble = sg.Suma(3.8, 4.0);
        
        String texto = sg.Suma("3.8", "4");
        
        System.out.println(entero);
        System.out.println(doble);
        System.out.println(texto);
        
        System.out.println(sg.SumaDiferentes("3.8", 4));
        System.out.println(sg.SumaDiferentes(3.8, 4));
        System.out.println(sg.SumaDiferentes(3.8, "4"));
    }
}
