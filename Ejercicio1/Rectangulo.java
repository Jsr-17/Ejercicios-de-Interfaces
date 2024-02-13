package Ejercicio1;
public class Rectangulo implements FiguraGeometrica {
    int altura;
    int base;
    
    @Override
    public void calculaPerimetro(){
        int resultado=this.altura+this.altura+this.base+this.base;
        System.out.println(resultado);
    }

    @Override
    public void calculaArea(){
        int resultado= this.base * this.altura;
        System.out.println(resultado);
    }
    
    Rectangulo(int altura,int base){
        this.altura=altura;
        this.base=base;
    }
}
