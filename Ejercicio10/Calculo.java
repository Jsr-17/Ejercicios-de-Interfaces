package Ejercicio10;

public interface Calculo {

    private double calcular(int numero1,int numero2,char signo){
        double resultado=0;
        switch (signo) {
            case '-':
                resultado=numero1-numero2;
                break;
        
            case '+':
                resultado=numero1+numero2;
                break;
        
            case '*':
                resultado=numero1*numero2;
                break;
        
            case '/':
                resultado=(double) numero1/numero2;
                break;
        
            default:
                break;
        }
        
        return resultado;
    }
   default void imprimirResultado(int numero1,int numero2,char signo){
        System.out.println(calcular(numero1, numero2, signo));
   }
}
