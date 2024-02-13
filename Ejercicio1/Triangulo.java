package Ejercicio1;
public class Triangulo implements FiguraGeometrica {
    int base;
    int altura;
    int lado;

    Triangulo(int base, int altura, int lado){
        this.base=base;
        this.altura=altura;
        this.lado=lado;
    }

    public void calculaArea(){
        int resultado=base*altura/2;

        System.out.println(resultado);
    }

    public void calculaPerimetro(){
        int resultado=lado+lado+lado;
        System.out.println(resultado);
    }
}
