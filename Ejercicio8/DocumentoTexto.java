package Ejercicio8;

public class DocumentoTexto implements Formateable {

    @Override
    public void formatearTextoCursiva(String texto) {
        System.out.println("El siguiente texto se mostrará en cursiva: "+texto);
        
    }

    @Override
    public void formatearTextoNegrita(String texto) {
    System.out.println("El siguiente texto se mostrará en negrita: "+texto);        
    }

    @Override
    public void formatearTextoSubrayado(String texto) {
        System.out.println("El siguiente texto se mostrará subrayado: "+texto);
        
    }
    
}
