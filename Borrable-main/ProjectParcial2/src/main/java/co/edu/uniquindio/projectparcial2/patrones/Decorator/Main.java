package co.edu.uniquindio.projectparcial2.patrones.Decorator;

public class Main {
    public static void main(String[] args) {
        IPrestamo prestamo = new PrestamoSencillo("1", "Manana","Nada relevante");
        System.out.println(prestamo.getFechaPrestamo() + prestamo.getDescripcion() + prestamo.getNumPrestamos());

        prestamo = new PeligrosoDecorator(prestamo, Peligrosidad.MUCHO);
        System.out.println(prestamo.getFechaPrestamo() + prestamo.getDescripcion() + prestamo.getNumPrestamos());
    }
}
