package co.edu.uniquindio.projectparcial2.patrones.Decorator;

public class PeligrosoDecorator extends PrestamoDecorator {
    private Peligrosidad peligrosidad;

    public PeligrosoDecorator(IPrestamo prestamo, Peligrosidad peligrosidad) {
        super(prestamo);
        this.peligrosidad = peligrosidad;
    }
    @Override
    public String getNumPrestamos() {
        return prestamo.getNumPrestamos() + "000002";
    }


    @Override
    public String getFechaPrestamo() {
        return prestamo.getFechaPrestamo() + "Suma 2 dias";
    }

    @Override
    public String getDescripcion() {
        return prestamo.getDescripcion() + "Peligrosidad = " + peligrosidad.name();
    }

}
