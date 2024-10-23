package co.edu.uniquindio.projectparcial2.patrones.Decorator;

public class PrestamoSencillo implements IPrestamo {
    private String numPrestamo;
    private String fechaPrestamo;
    private String descripcion;

    public PrestamoSencillo(String numPrestamo, String fechaPrestamo, String descripcion) {
        this.numPrestamo = numPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.descripcion = descripcion;
    }

    @Override
    public String getNumPrestamos() {
        return numPrestamo;
    }


    @Override
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

}
