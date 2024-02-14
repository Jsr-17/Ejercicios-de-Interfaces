package Ejercicio19;

public class FormularioCompra extends FormularioPadre{

    private String nombreProducto;
    private int nProductos;

    FormularioCompra(int nProductos,String nombreProducto){
        this.nProductos=nProductos;
        this.nombreProducto=nombreProducto;
    }


    @Override
    public void enviarFormulario(Object uno) {
        FormularioCompra formulario= (FormularioCompra)uno;
    System.out.println(
        "Los datos enviados son: \n"+
        "Nombre Producto : "+formulario.nombreProducto+
        "\n Género: "+formulario.nProductos
    );
        
    }

    @Override
    public void validarFormulario(Object uno) {

        FormularioCompra formulario= (FormularioCompra)uno;

        if (formulario.nombre.length()<=2) {
            System.out.println("El nombre debe de tener 3 caracteres como minimo");
        }
        if(formulario.edad<18){
            System.out.println("No puedes ser menor de edad para rellenar este formulario");
        }
        
    }
}
