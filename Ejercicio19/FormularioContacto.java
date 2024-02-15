package Ejercicio19;

public class FormularioContacto extends FormularioPadre {

    public String telefono;

    FormularioContacto(){

    }

    FormularioContacto(int edad,String nombre,char sexo,String telefono){
        super(nombre, edad, sexo);
        this.telefono=telefono;
    }

    @Override
    public void enviarFormulario(Object uno) {
        FormularioContacto formulario= (FormularioContacto)uno;
        super.enviarFormulario(uno);
        System.out.println("Numero de teléfono: "+formulario.telefono);
    }

    @Override
    public void validarFormulario(Object uno) {
        FormularioContacto formulario= (FormularioContacto)uno;
        super.validarFormulario(uno);
        if (formulario.telefono.length()<9) {
            System.out.println("Debes de tener un minimo de 9 números el telefono");
        }
    }


}
