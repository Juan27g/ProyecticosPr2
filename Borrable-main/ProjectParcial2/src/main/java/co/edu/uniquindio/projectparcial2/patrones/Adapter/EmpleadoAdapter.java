package co.edu.uniquindio.projectparcial2.patrones.Adapter;

public class EmpleadoAdapter extends Cliente{
    private Empleado empleado;

    public EmpleadoAdapter(String nombre, Empleado empleado) {
        super(nombre);
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
