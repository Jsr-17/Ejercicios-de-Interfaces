package Ejercicio1;

public class Circulo implements FiguraGeometrica {
    int radio;
    int diametro;

    Circulo(int radio, int diametro){
        this.radio=radio;
        this.diametro=diametro;
    }
    @Override
   public void calculaArea(){
    int resultado= (int)(Math.PI * Math.pow(radio, 2));
    System.out.println(resultado);    
}
    @Override
    public void calculaPerimetro(){
        int resultado= (int)(Math.PI * diametro);
        System.out.println(resultado);
    }

    
}
