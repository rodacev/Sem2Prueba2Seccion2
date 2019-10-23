package xpresscar;


public class Camioneta extends Vehiculo{
    
    private boolean traccion;
    
    public Camioneta(){
        
        super();
        this.traccion = false;
    }

    public Camioneta(boolean traccion, String nroCliente, String patente, int anio, String fono, int precio) {
        super(nroCliente, patente, anio, fono, precio);
        this.traccion = traccion;
    }

    
    public boolean isTraccion() {
        return traccion;
    }

    public void setTraccion(boolean traccion) {
        this.traccion = traccion;
    }

    @Override
    public String toString() {
        return "Camioneta{" + "traccion=" + traccion + '}';
    }
    
    
    @Override
    public void mostrarInfoEspec(){
        System.out.println("");
        this.mostrarInfo();
        System.out.println("CAMIONETA");
        if (this.traccion == false){
            System.out.println("TRACCIÓN 4x4: NO");
        }else{
            System.out.println("TRACCIÓN 4x4: SI");
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
            System.out.println("PRECIO VENTA: $" + precioVenta);
        }else{
            precioVenta = (int)(this.getPrecio()*IVA);
            System.out.println("PRECIO VENTA: $" + precioVenta);
        }
    }
    
    
    
    
    
    
}
