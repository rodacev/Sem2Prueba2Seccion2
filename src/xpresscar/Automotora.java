package xpresscar;

import java.util.ArrayList;


public class Automotora {
    
    private ArrayList<Vehiculo>listaVehiculos;
    
    public Automotora(){
        
        this.listaVehiculos = new ArrayList<>();
    }

    public Automotora(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "Automotora{" + "listaVehiculos=" + listaVehiculos + '}';
    }
    
    
    
    public void almacenaVehiculo(Vehiculo vehiculo){
        
        boolean validador = false;
        
        for (Vehiculo x: listaVehiculos){
            if (x.getPatente().equalsIgnoreCase(vehiculo.getPatente())){
                validador = true;
                break;
            }
        }
        if (!validador){
            this.listaVehiculos.add(vehiculo);
            System.out.println("\nVEHÍCULO ALMACENADO CORRECTAMENTE");
        }else{
            System.out.println("\nIMPOSIBLE ALMACENAR, EL VEHÍCULO YA EXISTE");
        }
    }
    
    
    public void listarVehiculos(){
        
        for (Vehiculo x:listaVehiculos){
            
            System.out.println("");
            
            if(x instanceof Auto){
                System.out.println("AUTO");
            }
            else if (x instanceof Camioneta){
                System.out.println("CAMIONETA");
            }
            x.mostrarInfoEspec();
        }
    }
    
    
    
    public void eliminarVehiculo(String patente){
        
        int posicion = 0;
        boolean validador = false;
        
        for (int i=0;i<this.listaVehiculos.size();i++){
            
            if (listaVehiculos.get(i).getPatente().equalsIgnoreCase(patente)){
                validador = true;
                posicion = i;
            }
        }
        if (validador){
            this.listaVehiculos.remove(posicion);
            System.out.println("\nVEHÍCULO ELIMINADO CORRECTAMENTE");
        }
        else{
            System.out.println("\nIMPOSIBLE ELIMINAR, LA PATENTE INGRESADA NO EXISTE");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
