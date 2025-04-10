abstract class Producto {
    protected String nombre;
    protected String marca;
    protected int precio;

    public Producto(String nombre, String marca, int precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public abstract void detalles();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
