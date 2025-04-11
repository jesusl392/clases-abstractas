public class Laptop extends Producto implements Vendible {
    private String procesador;
    private int ram;

    public Laptop(String nombre, String marca, double precio, int cantidad, String procesador, int ram) {
        super(nombre, marca, precio, cantidad);
        this.procesador = procesador;
        this.ram = ram;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop: " + nombre + ", Marca: " + marca + ", Precio: $" + precio +
                ", Cantidad: " + cantidad + ", Procesador: " + procesador + ", RAM: " + ram + "GB");
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.9; // 10% de descuento
        }
        return total;
    }
}
