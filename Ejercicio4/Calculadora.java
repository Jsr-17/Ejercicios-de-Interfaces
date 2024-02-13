package Ejercicio4;

public class Calculadora implements OperacionMatematica {

public static void main(String[] args) {
 /* 
    Calculadora calculadora= new Calculadora();
    int suma = calculadora.sumar(1, 3);
    int restar= calculadora.restar(23, 5);
    int multiplicar= calculadora.multiplicar(5, 3); 
    double dividir=calculadora.dividir(9, 3);

    System.out.println("La suma es "+ suma);
    System.out.println("La resta es "+restar);
    System.out.println("La multiplicación es "+multiplicar);
    System.out.println("La division es "+dividir);
*/


System.out.println("La suma es "+OperacionMatematica.restar(23, 5));
System.out.println("La resta es "+OperacionMatematica.sumar(1, 3));
System.out.println("La multiplicación es "+OperacionMatematica.multiplicar(5, 3)); 
System.out.println("La division es "+OperacionMatematica.dividir(9, 3));

}

}
