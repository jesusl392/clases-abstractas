abstract class Laptop extends Producto{
    protected String procesador;
    protected int ram;

    public Laptop(String nombre, String marca, int precio, String procesador, int ram) {
        super(nombre, marca, precio);
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", ram=" + ram +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
