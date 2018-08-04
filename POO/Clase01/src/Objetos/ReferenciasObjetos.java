
package Objetos;

//importar clase o archivo Docente que se encuetra en el paquete POO, para poder usar el archivo Docente
import POO.Docente;
import POO.Vehiculo;

public class ReferenciasObjetos {
       
    public static void main(String[] args) {
        //forma de como crear un objeto
    //es como Docente fuese un tipo de dato, nombre del dato objDocente
    Docente objDocente1 = new Docente();
    
    //el set es un void, no retorna valor solo asigna
    objDocente1.setNombre("Luis");
    objDocente1.setApellido("Cordova");
    objDocente1.setDni("12345678");
    //objDocente1.setCursos (new String[]{"","","",});
    
    //todo get es una funcion le puedo asignar a una variable o lo pudo pintar dirctamante
    //por ser funcion el get puede asignarle una variable String nombreDocente
    String nombreDocente = objDocente1.getNombre();
    
    
    
    Vehiculo objVehiculo = new Vehiculo();
    objVehiculo.setMarca("Lamborghini");
    objVehiculo.setColor("Plata");
    objVehiculo.setNumeroPuertas(2);
    objVehiculo.setPrecio(50000);
    
    objVehiculo.Avanzar();
    objVehiculo.Detener();
    
    
    
    
    
    
    
    
    
    }
}


