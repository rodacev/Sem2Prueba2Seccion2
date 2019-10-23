package xpresscar;


public class Test {


    public static void main(String[] args) {
        
        

        
        Auto autoUno = new Auto();
        autoUno.setNroCliente("A001");
        autoUno.setPatente("PIDO69");
        autoUno.setAnio(2019);
        autoUno.setFono("88888888");
        autoUno.setPrecio(9900000);
        autoUno.setModelo('s');
        
        Camioneta camionetaUno = new Camioneta();
        camionetaUno.setNroCliente("A002");
        camionetaUno.setPatente("DOFI96");
        camionetaUno.setAnio(2000);
        camionetaUno.setFono("77777777");
        camionetaUno.setPrecio(12900000);
        camionetaUno.setTraccion(true);
        
        autoUno.mostrarInfoEspec();
        camionetaUno.mostrarInfoEspec();
        
        autoUno.calcularPrecioVenta("jueves");
        camionetaUno.calcularPrecioVenta("viernes");
        
        Automotora automotoraUno = new Automotora();
        
        automotoraUno.almacenaVehiculo(autoUno);
        automotoraUno.almacenaVehiculo(camionetaUno);
        automotoraUno.listarVehiculos();
        automotoraUno.eliminarVehiculo("DOFI96");
        automotoraUno.listarVehiculos();

        

       
        
        

    }
    
}
