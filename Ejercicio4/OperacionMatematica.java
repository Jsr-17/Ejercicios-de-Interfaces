package Ejercicio4;

public interface OperacionMatematica {
   
      
      
     static int sumar(int n, int y) {
          return n + y;
     }

     static int restar(int n, int y) {
          return n - y;
     }

     static int multiplicar(int n, int y) {
          return n * y;
     };

     static double dividir(int n, int y) {
          return n / y;
     };
/*
     default int sumar(int n, int y) {
          return n + y;
     }

     default int restar(int n, int y) {
          return n - y;
     }

     default int multiplicar(int n, int y) {
          return n * y;
     }

     default double dividir(int n, int y) {
          return n / y;
     }
     */
}
