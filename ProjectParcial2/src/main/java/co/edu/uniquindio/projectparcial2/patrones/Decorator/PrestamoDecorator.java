package co.edu.uniquindio.projectparcial2.patrones.Decorator;

abstract class PrestamoDecorator implements IPrestamo{
    protected IPrestamo prestamo;

    public PrestamoDecorator(IPrestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String getNumPrestamos() {
        return prestamo.getNumPrestamos();
    }


    @Override
    public String getFechaPrestamo() {
        return prestamo.getFechaPrestamo();
    }

    @Override
    public String getDescripcion() {
        return prestamo.getDescripcion();
    }

}
