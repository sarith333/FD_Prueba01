
package clase01;


public class ProgEstructurada {
    
    public static void main(String[] args) {        
        //Alumno 1
        System.out.println("Hola Luis");
        
        double Nota1=11;
        double Nota2=12;
        double Nota3=20;
        
        double promedio = (Nota1+Nota2+Nota3)/3;
        if (promedio > 15)
            System.out.println("Felicitacones");
        else
            System.out.println("Debe estudiar");
        
        //Alumno 2
        System.out.println("Hola Ana");
        
        double NotaAn1=11;
        double NotaAn2=12;
        double NotaAn3=20;
        
        double promedioAn = (NotaAn1+NotaAn2+NotaAn3)/3;
        if (promedioAn > 15)
            System.out.println("Felicitacones");
        else
            System.out.println("Debe estudiar");
    }
}
