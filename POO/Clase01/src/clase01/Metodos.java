package clase01;
public class Metodos {
    public static void main(String[] args) {
        //Alumno1
        SaludarAlumno("Luis");
        Funciones.CalcularPromedio(11, 12, 20);
    
        //Alumno2
        SaludarAlumno("Ana");
        Funciones.CalcularPromedio(20, 18, 15);    
    }
    
//un METODO que se encargue de hacer todo:saludar, calcular el promedio y dar el mensaje final en base al resultado del promedio
    static void ProcesarOperacion(String nombre, double n1, double n2, double n3){
        SaludarAlumno(nombre);
        CalcularPromedio(n1, n2, n3);
        }
    
    
      
    //metodo jpara slaudar
    static void SaludarAlumno(String nombreAlumno){
        System.out.println("Hola " + nombreAlumno);    
    }
    
    //metodo para evaluar el mensaje en base al promedio
   static void CalcularPromedio(double n1,double n2,double n3){
        double promedio = (n1 + n2 + n3)/3;
        if (promedio > 15){
            System.out.println("Felicidades");
        }else{
            System.out.println("Debe estudiar");
        }
    }
    
}
