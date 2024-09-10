package co.edu.uniquindio;

/**
 * La clase {@code Tecnico} extiende la clase {@code Empleado} e implementa la interfaz {@code Contribuyente}.
 */
public class Tecnico extends Empleado implements Contribuyente {

    /**
     * Crea una nueva instancia de {@code Tecnico} con el nombre, ID del empleado y departamento especificados.
     *
     * @param nombre El nombre del técnico.
     * @param idEmpleado El identificador único del técnico.
     * @param departamento El departamento al que pertenece el técnico.
     */
    public Tecnico(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
    }

    /**
     * Realiza una tarea técnica específica y muestra un mensaje en la consola con la tarea realizada.
     * @param tarea La tarea técnica que se va a realizar.
     */
    public void realizarTareaTecnica(String tarea) {
        System.out.println("Técnico " + getNombre() + " está realizando la tarea: " + tarea);
        // Lógica adicional para la tarea técnica
    }

    /**
     * Asiste a una reunión técnica en la fecha especificada y muestra un mensaje en la consola con la fecha de la reunión.
     * @param fecha La fecha en la que se llevará a cabo la reunión técnica.
     */
    public void asistirReunion(String fecha) {
        System.out.println("Técnico " + getNombre() + " asistirá a la reunión técnica el " + fecha);
    }

    /**
     * Proporciona soporte técnico y muestra un mensaje en la consola indicando que se está proporcionando dicho soporte.
     */
    public void proporcionarSoporteTecnico() {
        System.out.println("Técnico " + getNombre() + " está proporcionando soporte técnico.");
        // Lógica adicional para el soporte técnico
    }

    /**
     * Implementación del método {@code contribuir()} de la interfaz {@code Contribuyente}.
     * Define cómo contribuye el técnico a la organización, especialmente en términos de habilidades técnicas en proyectos.
     */
    @Override
    public void contribuir() {
        System.out.println("Técnico contribuye con habilidades técnicas en proyectos.");
    }
}
