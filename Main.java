public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("thinkpad x240", "lenovo", 200, 10, "intel core i7 1440u", 8);
        Celular c1 = new Celular("a12", "samsung", 35, 4000, "48mpx",2);

        Cliente cl1 = new Cliente("Ana", "ana@mail.com");
        Cliente cl2 = new Cliente("Luis", "luis@mail.com");

        cl1.comprarProducto(l1, 3);
        cl1.comprarProducto(c1, 6); // con descuento

        cl2.comprarProducto(c1, 5);
        cl2.comprarProducto(l1, 7); // con descuento

        System.out.println("\nResumen de compras:");
        cl1.mostrarCompra();
        System.out.println();
        cl2.mostrarCompra();

        System.out.println("\nInventario actualizado:");
        l1.mostrarDetalles();
        c1.mostrarDetalles();
    }
}
