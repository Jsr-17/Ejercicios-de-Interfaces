package Ejercicio1;

public class main {
  
  public static void main(String[] args) {
    Circulo circulo=new Circulo(2, 6);
    Rectangulo rectangulo= new Rectangulo(4, 10);
    Triangulo triangulo= new Triangulo(5, 6, 3);

    /*circulo.calculaArea();
    circulo.calculaPerimetro();
    rectangulo.calculaArea();
    rectangulo.calculaPerimetro();*/
    triangulo.calculaArea();
    triangulo.calculaPerimetro();

  }


}
