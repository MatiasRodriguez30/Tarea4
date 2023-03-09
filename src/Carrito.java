
public class Carrito {
    private Producto[] productos;
    private int cantidad;

    public Carrito(int cantidad) {
        productos = new Producto[cantidad];
        this.cantidad = 0;
    }

    public Carrito() {

    }

    public void agregarProducto(Producto producto) {
        if (cantidad < productos.length) {
            productos[cantidad] = producto;
            cantidad++;
        } else {
            System.out.println("El carrito está lleno.");
        }
    }

    public void mostrarProductos() {
        System.out.println("Productos en el carrito:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(productos[i].getNombre() + " - " + productos[i].getPrecio());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int j = 0; j < cantidad; j++) {
            total += productos[j].getPrecio();
        }
        return total;
    }
}