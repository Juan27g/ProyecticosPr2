package co.edu.uniquindio.projectparcial2.patrones.Facade;

public class FacadePrestamo {
    private SistemaPretamos prestamos;

    public FacadePrestamo() {
        prestamos = new SistemaPretamos();
    }

    public void buscarPrestamo(String id){
        prestamos.buscarPrestamos(id);
    }
    public void devolverPrestamo(String id){
        prestamos.devolverPrestamos(id);
    }
    public void crearPrestamo(){
        prestamos.crearPrestamo();
    }

}
