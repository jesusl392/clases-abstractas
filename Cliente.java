import java.util.*;

public class Cliente {
    private String nombre;
    private String correo;
    private List<String> historial;
    private double totalGastado;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.historial = new ArrayList<>();
        this.totalGastado = 0.0;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto instanceof Vendible vendible && producto.actualizarStock(cantidad)) {
            double costo = vendible.calcularPrecioVenta(cantidad);
            historial.add(cantidad + " x " + producto.getNombre() + " = $" + String.format("%.2f", costo));
            totalGastado += costo;
        } else {
            System.out.println("Compra no realizada: stock insuficiente para " + producto.getNombre());
        }
    }

    public void mostrarCompra() {
        System.out.println("Cliente: " + nombre + " (" + correo + ")");
        for (String compra : historial) {
            System.out.println("- " + compra);
        }
        System.out.println("Total gastado: $" + String.format("%.2f", totalGastado));
    }
}


