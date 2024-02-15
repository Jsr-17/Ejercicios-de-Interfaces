package Ejercicio19;

public class main {
    public static void main(String[] args) {

        Formulario formulario=new FormularioCompra() {

            
        };
        Formulario formulario2= new FormularioRegistro(){

        };
        Formulario formulario3= new FormularioContacto() {
            
        };

        FormularioCompra formularioCompra= new FormularioCompra(12, "Boquerones");
        FormularioContacto formularioContacto=new FormularioContacto(10, "Juan", 'h',"676909095");
        FormularioRegistro formularioRegistro=new FormularioRegistro(12, "Eloisa", 'm');

        formulario.enviarFormulario(formularioCompra);
        formulario2.enviarFormulario(formularioRegistro);
        formulario3.enviarFormulario(formularioContacto);
    }
}
