public class Celular extends Producto implements Vendible{
    protected int cBateria;
    protected String resolucion;

    public Celular(String nombre, String marca, int precio, int cBateria, String resolucion, int cantidad) {
        super(nombre, marca, precio,cantidad);
        this.cBateria = cBateria;
        this.resolucion = resolucion;
    }

    public int getcBateria() {
        return cBateria;
    }

    public void setcBateria(int cBateria) {
        this.cBateria = cBateria;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "cBateria=" + cBateria +
                ", resolucion='" + resolucion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public void mostrarDetalles() {

    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        return 0;
    }
}
