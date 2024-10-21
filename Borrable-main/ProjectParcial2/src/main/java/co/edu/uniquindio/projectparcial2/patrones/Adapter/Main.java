package co.edu.uniquindio.projectparcial2.patrones.Adapter;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Pollo");
        Empleado empleado = new Empleado("Carlos");
        EmpleadoAdapter adapter = new EmpleadoAdapter(empleado.getNombre(), empleado);
        Cliente cliente = new Cliente("Cliente");
        Prestamo prestamo = new Prestamo("Prestamo1", adapter, producto);
        prestamo.mostrarPrestamo();
    }
}
