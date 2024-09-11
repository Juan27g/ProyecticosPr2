package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.GerenteBuilder;
import co.edu.uniquindio.services.Contribuyente;

import java.util.ArrayList;
import java.util.List;



/**
 * La clase {@code Gerente} extiende la clase {@code Empleado} e implementa la interfaz {@code Contribuyente}.
 */
public class Gerente extends Empleado implements Contribuyente {

    /**
     * Lista de proyectos gestionados por el gerente.
     */
    private List<Proyecto> proyectosGestionados;

    /**
     * Crea una nueva instancia de {@code Gerente} con el nombre, ID del empleado y departamento especificados.
     * Inicializa la lista de proyectos gestionados como una lista vacía.
     *
     * @param nombre El nombre del gerente.
     * @param idEmpleado El identificador único del gerente.
     * @param departamento El departamento al que pertenece el gerente.
     */
    public Gerente(String nombre, String idEmpleado, Departamento departamento) {
        super(nombre, idEmpleado, departamento);
        this.proyectosGestionados = new ArrayList<>();
    }

    /**
     * Asigna un proyecto al gerente y asocia un grupo de empleados a dicho proyecto.
     *
     * @param proyecto El proyecto que será asignado.
     * @param empleados La lista de empleados que serán asignados al proyecto.
     */
    public void asignarProyecto(Proyecto proyecto, List<Empleado> empleados) {
        proyecto.asignarEmpleados(empleados);
        if (!proyectosGestionados.contains(proyecto)) {
            proyectosGestionados.add(proyecto);
        }
    }

    /**
     * Revisa el progreso de un proyecto específico y lo muestra en la consola.
     *
     * @param proyecto El proyecto cuyo progreso será revisado.
     */
    public void revisarProgreso(Proyecto proyecto) {
        System.out.println(proyecto.mostrarProgreso());
    }

    /**
     * Genera un informe del estado actual de un proyecto específico y lo muestra en la consola.
     *
     * @param proyecto El proyecto del cual se generará el informe.
     */
    public void generarInforme(Proyecto proyecto) {
        System.out.println(proyecto.generarResumen());
    }

    /**
     * Evalúa el desempeño del equipo que trabaja en los proyectos gestionados por el gerente.
     * Se imprime una evaluación básica en la consola.
     */
    public void evaluarDesempenoEquipo() {
        for (Proyecto proyecto : proyectosGestionados) {
            for (Empleado empleado : proyecto.getEmpleadosAsignados()) {
                System.out.println("Evaluando desempeño de: " + empleado.getNombre());
                // Lógica adicional para la evaluación
            }
        }
    }

    /**
     * Organiza una reunión para una fecha específica con un grupo de empleados.
     * Muestra en la consola la fecha y los empleados participantes.
     *
     * @param fecha La fecha en que se organizará la reunión.
     * @param empleados La lista de empleados que participarán en la reunión.
     */
    public void organizarReunion(String fecha, List<Empleado> empleados) {
        System.out.println("Reunión organizada para el " + fecha + " con: ");
        for (Empleado empleado : empleados) {
            System.out.println("- " + empleado.getNombre());
        }
    }

    /**
     * Resuelve conflictos dentro del equipo de trabajo.
     * Muestra un mensaje en la consola indicando que se están resolviendo conflictos.
     */
    public void resolverConflictos() {
        System.out.println("Resolviendo conflictos en el equipo.");
    }

    /**
     * Implementación del método {@code contribuir()} de la interfaz {@code Contribuyente}.
     * Define cómo contribuye el gerente a la organización, específicamente en la planificación y ejecución de proyectos.
     */
    @Override
    public void contribuir() {
        System.out.println("Gerente contribuye a la planificación y ejecución de proyectos.");
    }

    public  static GerenteBuilder gerentebuilder(){
        return new GerenteBuilder();
    }
}
