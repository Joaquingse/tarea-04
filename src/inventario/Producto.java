package inventario;

/**
 * @author Joaquín Gázquez San Emeterio
 * @version 1.0
 * @since 1.0
 */
public class Producto {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Atributos de la clase Producto String nombre double precio int stock
     */
    private String nombre;
    private double precio;
    private int stock;

    /**
     *
     * Constructor de la clase Producto
     *
     * @param nombre
     * @param precio
     * @param stock
     */
    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     *
     * @param nombre
     * @param precio
     * @param stock
     * @return objeto Producto
     */
    public static Producto crearProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }

    /**
     * Método para mostrar por pantalla la información de un producto
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }

}
