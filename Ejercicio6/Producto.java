package Ejercicio6;

public class Producto implements Ordenable {
    public String nombre;
    public int precio;

    Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void compareTo(Object uno, Object dos) {
        Producto objeto1 = (Producto) uno;
        Producto objeto2 = (Producto) dos;
        boolean nombreBool = false;
        boolean precioBool = false;

        if (objeto1.nombre == objeto2.nombre) {
            nombreBool = true;
        }
        if (objeto1.precio == objeto2.precio) {
            precioBool = true;
        }
        if (nombreBool && precioBool) {
            System.out.println("Ambos atributos son iguales");
        } else if (precioBool) {
            System.out.println("El precio es igual");
        } else if (nombreBool) {
            System.out.println("El nombre es igual");
        } else if (!nombreBool && !precioBool) {
            System.out.println("No coinciden en nada");

        }
    }

}
