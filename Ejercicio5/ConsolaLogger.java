package Ejercicio5;

public class ConsolaLogger implements Logger {

    @Override
    public void SeveredadGrave(String mensaje) {
        System.out.println(mensaje);
        
    }

    @Override
    public void SeveredadMedia(String mensaje) {
        System.out.println(mensaje);
        
    }

    @Override
    public void Severedadleve(String mensaje) {
        System.out.println(mensaje);
        
    }
    
}
