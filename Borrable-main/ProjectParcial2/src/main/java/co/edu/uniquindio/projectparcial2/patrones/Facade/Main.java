package co.edu.uniquindio.projectparcial2.patrones.Facade;

public class Main {
    public static void main(String[] args) {
        FacadePrestamo fachada = new FacadePrestamo();

        fachada.buscarPrestamo("02");
        fachada.crearPrestamo();
        fachada.devolverPrestamo("10");
    }
}
