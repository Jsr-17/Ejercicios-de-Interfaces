package Ejercicio18;

public abstract class Cuenta  implements OperacionesBancarias{
    int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }
    public Cuenta(){

    }

    @Override
    public void consultaSaldo(Object objeto) {
        Cuenta cuenta =  (Cuenta)objeto;
        System.out.println("El saldo que tiene en la cuenta es "+cuenta.saldo);
        
    }

    @Override
    public int deposito(Object objeto,int valor) {
        Cuenta cuenta =  (Cuenta)objeto;
        cuenta.saldo+=valor;
        return 0;
    }

    @Override
    public int retiro(Object objeto,int valor) {
        Cuenta cuenta =  (Cuenta)objeto;
        if (cuenta.saldo<valor) {
            System.out.println("No puedes retirar dinero que no se tiene");
        }else{
        cuenta.saldo= cuenta.saldo-valor;
        }
        return 0;
    }
    
}
