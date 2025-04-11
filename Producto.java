public abstract class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidad;

    public Producto(String nombre, String marca, double precio, int cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public abstract void mostrarDetalles();

    public boolean actualizarStock(int cantidadVendida) {
        if (cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
