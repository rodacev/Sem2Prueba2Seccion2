package xpresscar;


public abstract class Vehiculo implements ICalculable{
    
    private String nroCliente;
    private String patente;
    private int anio;
    private String fono;
    private int precio;
    
    public Vehiculo(){
        
        this.nroCliente = "";
        this.patente = "";
        this.anio = 0;
        this.fono = "";
        this.precio = 0;
    }
    

    public Vehiculo(String nroCliente, String patente, int anio, String fono, int precio) {
        this.nroCliente = nroCliente;
        this.patente = patente;
        this.anio = anio;
        this.fono = fono;
        this.precio = precio;
    }
    
    
    public String getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(String nroCliente) {
        if (nroCliente.length()>=4){
            this.nroCliente = nroCliente;
        }
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente.length()>=6){
            this.patente = patente;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio>1900){
            this.anio = anio;
        }
    }

    public String getFono() {
        return fono;
    }

    public void setFono(String fono) {
        if (fono.length()==8){
            this.fono = fono;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "nroCliente=" + nroCliente + ", patente=" 
                + patente + ", anio=" + anio + ", fono=" 
                + fono + ", precio=" + precio + '}';
    }
    
    
    public void mostrarInfo(){
        
        System.out.println("VEHÍCULO: ");
        System.out.println("NRO. CLIENTE: " + this.nroCliente);
        System.out.println("PATENTE: " + this.patente);
        System.out.println("ANIO: " + this.anio);
        System.out.println("TELÉfono: " + this.fono);
        System.out.println("PRECIO NETO SIN DESCUENTO: $" + this.precio);
    }
    
    public abstract void mostrarInfoEspec();
    
    
    public abstract void calcularPrecioVenta(String dia);
    
    
    


    
    
    
    
    
    
}
