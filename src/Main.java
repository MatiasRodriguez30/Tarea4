public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito(3);

        Producto producto1 = new Producto("jabón en polvo", 40.0);
        Producto producto2 = new Producto("esponjas", 10.0);
        Producto producto3 = new Producto("chocolates", 100.0);

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        System.out.println("Precio total: " + carrito.calcularTotal());
    }
}