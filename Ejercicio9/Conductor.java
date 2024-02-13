package Ejercicio9;

public interface Conductor {
    
    default String conducir(){
        return "Estoy conduciendo un vehículo";
    }
}
