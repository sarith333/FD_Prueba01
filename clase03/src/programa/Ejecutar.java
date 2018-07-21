/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author Administrador
 */
public class Ejecutar {
    static double radio_circulo = 6.5;
    static final double valor_pi = 3.141516;
    
    public static void main(String[] args) {
        System.out.println("El valor de la variable es: " + radio_circulo);
        
        System.out.println("El valor de la constante es: " + valor_pi);
   
        //cambiando valores
        radio_circulo = 1.4;
        //valor_pi = 0; //no se pueded
        
        System.out.println("El nuevo valor de la variable es: " + radio_circulo);
        
    }
    //Mi primer cvomentario para git
    //otro comentario desde otra pc (ruta nueva)
    
}
