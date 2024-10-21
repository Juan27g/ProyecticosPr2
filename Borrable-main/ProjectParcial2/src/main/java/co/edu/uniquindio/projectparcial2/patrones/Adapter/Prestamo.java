package co.edu.uniquindio.projectparcial2.patrones.Adapter;

public class Prestamo {
    private String nombre;
    private Cliente cliente;
    private Producto producto;

    public Prestamo(String nombre, Cliente cliente, Producto producto) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.producto = producto;
    }
    public void mostrarPrestamo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto: " + producto.getNombre());
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
