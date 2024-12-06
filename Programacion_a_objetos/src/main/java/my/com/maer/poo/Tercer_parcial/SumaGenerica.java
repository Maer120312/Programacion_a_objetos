/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.com.maer.poo.Tercer_parcial;

/**
 *
 * @author miguel.esparza
 */
public class SumaGenerica {
    public <T> T Suma(T a, T b){
        
        T res = null;
        
        if(a instanceof Integer){
            Integer sum = (Integer) a + (Integer) b;
            res = (T) sum;
        } else if(a instanceof Double){
            Double sum = (Double) a + (Double) b;
            res = (T) sum;
        } else if (a instanceof String){
            String sum = (String) a + (String) b;
            res = (T) sum;
        }
        
        return res;
    }
    
    public <T, U> String SumaDiferentes(T a, U b){
        
        Double res = Double.parseDouble(a.toString()) + Double.parseDouble(b.toString());
        return res.toString();
    }
    
}
