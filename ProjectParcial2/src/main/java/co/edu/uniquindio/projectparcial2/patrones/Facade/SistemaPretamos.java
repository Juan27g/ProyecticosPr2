package co.edu.uniquindio.projectparcial2.patrones.Facade;

public class SistemaPretamos {

    public void  buscarPrestamos(String id){
        System.out.println("Buscando Prestamo con la id: " + id);
    }
    public void devolverPrestamos(String id){
        System.out.println("Devolver Prestamo con la id: " + id);
    }
    public void crearPrestamo(){
        System.out.println("Prestamo creado exitosamente");
    }
}
