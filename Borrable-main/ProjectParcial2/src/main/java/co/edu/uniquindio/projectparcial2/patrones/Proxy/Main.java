package co.edu.uniquindio.projectparcial2.patrones.Proxy;

public class Main {
    public static void main(String[] args) {
        IPrestamo prestamo = new ProxyPrestamo("prestamo1","Carlos","Burra");
        prestamo.mostrarPrestamos();
        prestamo.registrarAccesos();
        prestamo.registrarAccesos();
        prestamo.registrarAccesos();
        prestamo.registrarAccesos();
        prestamo.registrarAccesos();
        prestamo.registrarAccesos();


    }
}
