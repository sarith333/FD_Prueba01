/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Si los metodos que van a llamar a una funcion es estatico, todos deben ser estaticos
        SaludaVersionMetodo();
        SaludaVersionMetodo();        
        //Saluda();
        String cadena = Saluda("Lucho");
        System.out.println(cadena);
        
        String[] nombres = {"Luis", "Jose", "Maria", "Pedro"};
        
        for (int i = 0; i < nombres.length; i++) {
            String mensaje = Saluda(nombres[i]);
            System.out.println(mensaje);
        }
    }
    
    //Un metodo, no retorna valor pero tambien es una accion
    //Funcion: Toda funcion por ley debe retornar algo. La idea de una funcion es que se pueda llamar mas de una vez
    //Ya esta declarada, existe pero si no la llama, solo existe.
    //El retorno debe ser del mismo tipo de la funcion (String), porque declaramos la funcion como String
    static String Saluda(String nombre){
        String saludo = "Hola " + nombre + " como estas";
        return saludo;        
        
    }
    
    //Metodo
    //El void no tiene la palabra return, no debe retornar nada
    static void SaludaVersionMetodo(){
        System.out.println("Hola, como estas (Metodo)");    
    }
    
    
       
}
//UN metodo: Se define con la palabra "void"
//UNA FUNCION SIEMPRE TIENE un tipo de dato acompañado de un nombre cualquiera (verbo o la accion que raliza)
//Toda funcion tiene un retorno
//String callar()
//int

//El main por defecto es un metodo, debo hacerlo fuera de "main"
//Una funcion no puede estar dentro de un metodo