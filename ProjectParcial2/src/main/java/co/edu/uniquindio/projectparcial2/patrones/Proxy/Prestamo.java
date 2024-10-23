package co.edu.uniquindio.projectparcial2.patrones.Proxy;

public class Prestamo implements IPrestamo {
    @Override
    public void mostrarPrestamos() {
        System.out.println("Mostrando toda la informacion del prestamo...");
    }

    @Override
    public void registrarAccesos() {
        System.out.println("Registrando accesos del prestamo...");
    }

    private String nombre;
    private String cliente;
    private String producto;
    private int contador;

    public Prestamo(String nombre, String cliente, String producto) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.producto = producto;
        this.contador = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
