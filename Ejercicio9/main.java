package Ejercicio9;

public class main {
    public static void main(String[] args) {
        ConductorAutobus conductorAutobus=new ConductorAutobus();
        ConductorTaxi conductorTaxi = new ConductorTaxi();
        
        System.out.println(conductorAutobus.conducir());
        System.out.println(conductorTaxi.conducir());
    }
}
