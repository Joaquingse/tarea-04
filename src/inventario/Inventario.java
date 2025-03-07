package inventario;

import java.util.ArrayList;

/**
 * @author Joaquín Gázquez San Emeterio
 * @version 1.0
 * @since 1.0
 */
public class Inventario {

    public ArrayList<Producto> listaProductos;

    /**
     * Constructor de la clase inventario
     */
    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    /**
     * Método para agregar productos a la lista de productos
     *
     * @param p
     */
    public void agregar(Producto p) {
        listaProductos.add(p);
    }

    /**
     * Método para mostrar los productos con su información
     *
     */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }

    /**
     * Método principal
     *
     * @param args
     */
    public static void main(String[] args) {

        Inventario inventario = new Inventario();
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);

        inventario.agregar(p1);
        inventario.agregar(p2);

        System.out.println("Inventario de productos:");
        inventario.mostrar();

    }
}
