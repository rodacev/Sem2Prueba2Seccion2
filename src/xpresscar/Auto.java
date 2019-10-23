package xpresscar;


public class Auto extends Vehiculo{
    
    private char modelo;
    
    
    public Auto(){
        
        super();
        this.modelo = ' ';
    }

    public Auto(char modelo, String nroCliente, String patente, int anio, String fono, int precio) {
        super(nroCliente, patente, anio, fono, precio);
        this.modelo = modelo;
    }

    
    public char getModelo() {
        return modelo;
    }

    public void setModelo(char modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + modelo + '}';
    }
    
    
    @Override
    public void mostrarInfoEspec(){
        
        this.mostrarInfo();
        System.out.println("AUTO");
        if (this.modelo=='S'|| this.modelo=='s'){
            System.out.println("MODELO: SEDAN");
        }
        else if (this.modelo=='H' || this.modelo=='h'){
            System.out.println("MODELO: HATCHBACK");
        }
    }
    
    
    @Override
    public int descontar(){
        int precioConDescuento = (int)(this.getPrecio()*DESCUENTO);
        return precioConDescuento;
    }

    @Override
    public void calcularPrecioVenta(String dia) {
        int precioVenta = 0;
        if (dia.equalsIgnoreCase("viernes")){
            precioVenta = (int)((this.getPrecio()-descontar())*IVA);
            System.out.println("\nPRECIO VENTA: $" + precioVenta);
        }else{
            precioVenta = (int)(this.getPrecio()*IVA);
            System.out.println("\nPRECIO VENTA: $" + precioVenta);
        }
    }
    
    
    
    
    
    
    
    

    
    

    
    
    
    
    
}
