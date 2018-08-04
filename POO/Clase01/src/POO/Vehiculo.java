package POO;


public class Vehiculo {

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    /**
     * @return the NumeroPuertas
     */
    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    /**
     * @param NumeroPuertas the NumeroPuertas to set
     */
    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }
    
    //
    public void Encender(){
        System.out.println("El carro esta listo");    
    }
    
    
    public void Avanzar(){
        System.out.println("El carro esta en marcha");    
    }
    
    public void Detener(){
        //this signfica obj.Vehiculo
        System.out.println("El carro " + this.getColor() + " " + this.getMarca() + " esta detenido");    
    }
    
    private String Color;
    private String Marca;
    private double Precio;
    private int NumeroPuertas;
}
