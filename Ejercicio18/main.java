package Ejercicio18;

public class main {
    public static void main(String[] args) {
        CuentaAhorros cuenta= new CuentaAhorros(1000);
        CuentaCorriente cuentaC= new CuentaCorriente(100);
        CuentaInversion cInversion= new CuentaInversion(500);
        
        OperacionesBancarias operacion = new Cuenta(){

        };
 


        operacion.consultaSaldo(cuentaC);
        operacion.deposito(cuenta, 1750);
        operacion.consultaSaldo(cuenta);
        operacion.retiro(cuenta, 60000);
        operacion.consultaSaldo(cuenta);

    }
}
