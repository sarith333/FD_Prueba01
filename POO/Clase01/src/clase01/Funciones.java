
package clase01;
public class Funciones {
    public static void main(String[] args) { 
        ProcesarOperacion("Luis", 11, 15, 12);
        ProcesarOperacion("Ana", 20, 18, 15);
        
        
        
        
        
        String saludo = "";
        double promedio = 0;
        String mensajeFinal = "";
        
        //Alumno1
        saludo = SaludarAlumno("Luis");
        promedio = CalcularPromedio (11,12,20);
        mensajeFinal = MensajeFinal(promedio);
        System.out.println(saludo);//aqui saluda a luis
        System.out.println(mensajeFinal);//aqui pinta el mensajeFinal en base al promedio de Luis
        
        //Alumno2
        saludo = SaludarAlumno("Ana");
        promedio = CalcularPromedio (20,18,15);
        mensajeFinal = MensajeFinal(promedio);
        System.out.println(saludo);
        System.out.println(mensajeFinal);
    }
    
//un METODO que se encargue de hacer todo:saludar, calcular el promedio y dar el mensaje final en base al resultado del promedio
    static void ProcesarOperacion(String nombre, double n1, double n2, double n3){
        String saludo= "";
        double promedio = 0;
        String mensajeFinal = "";
         //Alumno2
        saludo = SaludarAlumno(nombre);
        promedio = CalcularPromedio (n1, n2, n3);
        mensajeFinal = MensajeFinal(promedio);
        System.out.println(saludo);
        System.out.println(mensajeFinal);    
    }
            
     //Todo el trabajo lo hace las funciones
    //La ventja que lo puede utilizar n veces, sin necesidad de estar copiando codigo a cada rato.
    static String SaludarAlumno(String nombreAlumno){
        String mensaje = "Hola " + nombreAlumno;
        return mensaje;       
    }
    
    static double CalcularPromedio(double n1, double n2, double n3){
    double promedio = (n1 +n2 + n3) / 3;
    return promedio;   
    }
    
    static String MensajeFinal(double promedio){
        String mensaje;
    if (promedio > 15){
        mensaje = "Felicidades";
    }else {
        mensaje = "Debes estudiar";
    }
    return mensaje;
    }
    
}
