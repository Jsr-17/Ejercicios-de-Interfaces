package Ejercicio19;

public class FormularioCompra extends FormularioPadre {

    private String nombreProducto;
    private int nProductos;

    FormularioCompra(int nProductos, String nombreProducto) {
        this.nProductos = nProductos;
        this.nombreProducto = nombreProducto;
    }

    @Override
    public void enviarFormulario(Object uno) {
        FormularioCompra formulario = (FormularioCompra) uno;
        System.out.println(
                "Los datos enviados son: \n" +
                        "Nombre Producto : " + formulario.nombreProducto +
                        "\n Número de Productos: " + formulario.nProductos);

    }

    @Override
    public void validarFormulario(Object uno) {

        FormularioCompra formulario = (FormularioCompra) uno;

        if (formulario.nombreProducto.length() <= 2) {
            System.out.println("Los productos  deben de tener 3 caracteres como minimo");
        }

    }

    FormularioCompra() {

    }
}
