package Ejercicio9;

public class ConductorTaxi implements Conductor {
    @Override
    public String conducir() {

        return Conductor.super.conducir()+" y es un taxi";
    }
}
