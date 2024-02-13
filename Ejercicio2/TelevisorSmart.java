package Ejercicio2;

public class TelevisorSmart implements AccionesTelevisor{
    
    
    @Override
    public void encender(){
        System.out.println("El televisor está encendido");
    }
    @Override
    public void apagar(){
        System.out.println("El televisor se ha apagado");
    }
    @Override
    public void cambiarCanal(){
        System.out.println("Has cambiado de canal");
    }
    @Override
    public void ajustarVolumen(){
        System.out.println("El volumen ha sido reajustado");
    }

}
