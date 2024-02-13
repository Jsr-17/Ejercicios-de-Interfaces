package Ejercicio10;

public class OperacionAritmetica implements Calculo{

    @Override
    public void imprimirResultado(int numero1, int numero2, char signo) {
        Calculo.super.imprimirResultado(numero1, numero2, signo);
    }
    
    public static void main(String[] args) {
        OperacionAritmetica operacion = new OperacionAritmetica();
        operacion.imprimirResultado(2, 3, '/');
    }
}
