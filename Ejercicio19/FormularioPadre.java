package Ejercicio19;

public abstract class FormularioPadre implements Formulario {
    
    public String nombre;
    public int edad;
    public char genero;

    FormularioPadre(){

    }

    FormularioPadre(String nombre,int edad,char genero){
        this.nombre=nombre;
        this.edad=edad;
        this.genero=genero;
    }

    @Override
    public void enviarFormulario(Object uno) {
        FormularioPadre formulario= (FormularioPadre)uno;
        
    System.out.println(
        "Los datos enviados son: \n"+
        "Nombre: "+formulario.nombre+
        "\n Edad: "+formulario.edad+
        "\n Género: "+formulario.genero
    );
        
    }

    @Override
    public void validarFormulario(Object uno) {

        FormularioPadre formulario= (FormularioPadre)uno;

        if (formulario.nombre.length()<=2) {
            System.out.println("El nombre debe de tener 3 caracteres como minimo");
        }
        if(formulario.edad<18){
            System.out.println("No puedes ser menor de edad para rellenar este formulario");
        }
        if(formulario.genero !='H'||formulario.genero!='M'||formulario.genero !='h'||formulario.genero!='m'){
            System.out.println("Solo puedes utilizar H o M");
        }
        
    }
    
}
