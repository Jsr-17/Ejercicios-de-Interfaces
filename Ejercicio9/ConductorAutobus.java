package Ejercicio9;

public class ConductorAutobus implements Conductor {

    @Override
    public String conducir() {

        return Conductor.super.conducir()+" y es un autobus ";
    }
    
}
