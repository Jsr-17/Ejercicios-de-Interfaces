package Ejercicio3;

public class Clase1 implements Ordenable {
    String sentencia = "Esta es una prueba";

    @Override
    public  int comparar(Object uno) {
        String objeto = (String) uno;
        int resultado = Integer.compare(objeto.length(), sentencia.length());
        return resultado;
    }
}
