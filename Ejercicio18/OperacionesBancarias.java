package Ejercicio18;

public interface OperacionesBancarias {
    int deposito(Object objeto,int valor);
    int retiro(Object objeto,int valor);
    void consultaSaldo(Object objeto);
}
