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
public class Arreglos {
    public static void main(String[] args) {
        //Definiendo arreglos en dos lineas
        String[] apellidos;
        apellidos = new String[5];
        
        //Definiendo arreglos en una linea
        String[] nombres = new String[5];
        
        //Asignar valores a los arreglos
        apellidos[0] = "Cordova"; //Agregando 1 valor al indice 0
        apellidos[1] = "Ramirez"; //Agregando 1 valor al indice 1
        apellidos[2] = "Leon"; //Agregando 1 valor al indice 2
        apellidos[3] = "Perez"; //Agregando 1 valor al indice 3
        apellidos[4] = "Sanchez"; //Agregando 1 valor al indice 4
        //apellidos[5] = "Lopez"; //Agregando 1 valor al indice 5
        
        //Definir arreglos con valores por defecto
        //Aqui el limite es cuando cierras las llaves, ahi ya no se puede agregar mas
        String[] departamentos = {"Lima", "Piura", "Tacna", "Puno", "Cuzco", "Loreto"};
        
        System.out.println("Tamaño del arreglo departamento: " + departamentos.length);
        System.out.println("Tamaño del arreglo apellidos: " + apellidos.length);
        System.out.println("Tamaño del arreglo nombres: " + nombres.length);
        
        departamentos[0]= "Arequipa"; //modificando de Lima a Arequipa, sirve para modificar o leer los indices
        //obtener el valor del indice 1
        System.out.println("Valor Departamento indice 1 = " + departamentos[1]);
        
        
          //String[] departamentos = {"Arequipa", "Piura", "Tacna", "Puno", "Cuzco", "Loreto"};
        //recorrer arreglos valor por valor
        for (int i = 0; i < departamentos.length; i++) {
            System.out.println("El valor en la posición " + i + " => " + departamentos[i]);         
        }
        
        //tengo un arreglo de 5 notas en desorden cual es la mayor de todas
        
        double[] notas = {11.5, 15, 18, 11, 13};
        double notaMayor = 0;
    
        for (int i = 0; i < notas.length; i++) {
                    
            if (notas[i] > notaMayor)
                notaMayor = notas[i];
            }
        
        
         System.out.println("La nota mayor es " +  notaMayor); 
    }
 }
    
