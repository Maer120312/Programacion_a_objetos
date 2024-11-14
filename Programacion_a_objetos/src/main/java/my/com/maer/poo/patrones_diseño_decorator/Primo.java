/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.com.maer.poo.patrones_diseño_decorator;

/**
 *
 * @author miguel.esparza
 */
public class Primo implements Tarea{
    private final int numero;
    
    public Primo(int n){
        numero = n;
    }
    
    public boolean esPrimo(){
        
        for(int i=2; i<numero; i++){
            if(numero%i == 0){
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void ejecutar() {
        esPrimo();
    }
}
