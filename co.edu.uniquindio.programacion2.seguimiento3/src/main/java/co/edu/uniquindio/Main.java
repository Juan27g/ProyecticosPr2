package co.edu.uniquindio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Solicitar detalles del proyecto
        String nombreProyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");
        String codigoProyecto = JOptionPane.showInputDialog("Ingrese el código del proyecto:");

        // Crear un objeto Proyecto
        Proyecto proyecto = new Proyecto(nombreProyecto, codigoProyecto);

        // Solicitar nombre del empleado
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");

        // Solicitar ID del empleado
        String idEmpleado = JOptionPane.showInputDialog("Ingrese el ID del empleado:");

        // Solicitar nombre del departamento
        String nombreDepartamento = JOptionPane.showInputDialog("Ingrese el nombre del departamento:");

        // Solicitar código del departamento
        String codigoDepartamento = JOptionPane.showInputDialog("Ingrese el código del departamento:");

        // Crear un objeto Departamento
        Departamento departamento = new Departamento(nombreDepartamento, codigoDepartamento);

        // Crear el empleado y añadirlo al proyecto
        Empleado empleado = crearEmpleado(nombre, idEmpleado, departamento);

        if (empleado != null) {
            // Añadir el empleado al proyecto
            proyecto.getEmpleadosAsignados().add(empleado);

            // Menú de opciones
            String[] opciones = {"Asignar Empleado a Proyecto", "Evaluar Desempeño", "Asignar Proyecto y Distribuir Tareas", "Revisar Progreso del Proyecto", "Generar Informe del Proyecto", "Organizar Reunión", "Resolver Conflictos", "Realizar Tarea Técnica", "Asistir a Reunión", "Proporcionar Soporte Técnico"};
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una acción:",
                    "Menú de Opciones", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (opcion != null) {
                switch (opcion) {
                    case "Asignar Empleado a Proyecto":
                        JOptionPane.showMessageDialog(null, "Ejecutando asignación de empleado al proyecto...");
                        asignarEmpleadoAProyecto(proyecto);
                        break;

                    case "Evaluar Desempeño":
                        JOptionPane.showMessageDialog(null, "Ejecutando evaluación del desempeño...");
                        evaluarDesempeno(empleado);
                        break;

                    case "Asignar Proyecto y Distribuir Tareas":
                        if (empleado instanceof Gerente) {
                            JOptionPane.showMessageDialog(null, "Ejecutando asignación de proyecto y distribución de tareas...");
                            asignarProyectoYDistribuirTareas((Gerente) empleado, proyecto);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta acción solo es válida para Gerentes.");
                        }
                        break;

                    case "Revisar Progreso del Proyecto":
                        if (empleado instanceof Gerente) {
                            JOptionPane.showMessageDialog(null, "Ejecutando revisión de progreso del proyecto...");
                            Gerente gerente = (Gerente) empleado;
                            gerente.revisarProgreso(proyecto);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta acción solo es válida para Gerentes.");
                        }
                        break;

                    case "Generar Informe del Proyecto":
                        if (empleado instanceof Gerente) {
                            JOptionPane.showMessageDialog(null, "Ejecutando generación de informe del proyecto...");
                            Gerente gerente = (Gerente) empleado;
                            gerente.generarInforme(proyecto);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta acción solo es válida para Gerentes.");
                        }
                        break;

                    case "Organizar Reunión":
                        if (empleado instanceof Gerente) {
                            JOptionPane.showMessageDialog(null, "Ejecutando organización de reunión...");
                            Gerente gerente = (Gerente) empleado;
                            String fechaReunion = JOptionPane.showInputDialog("Ingrese la fecha de la reunión:");
                            List<Empleado> empleadosReunion = new ArrayList<>();
                            String nombreEmpleado;
                            do {
                                nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado para la reunión (dejar vacío para terminar):");
                                if (nombreEmpleado != null && !nombreEmpleado.isEmpty()) {
                                    Empleado emp = new Tecnico(nombreEmpleado, "ID_" + nombreEmpleado, departamento); // Ejemplo de creación de Técnico
                                    empleadosReunion.add(emp);
                                }
                            } while (nombreEmpleado != null && !nombreEmpleado.isEmpty());
                            gerente.organizarReunion(fechaReunion, empleadosReunion);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta acción solo es válida para Gerentes.");
                        }
                        break;

                    case "Resolver Conflictos":
                        if (empleado instanceof Gerente) {
                            JOptionPane.showMessageDialog(null, "Ejecutando resolución de conflictos...");
                            Gerente gerente = (Gerente) empleado;
                            gerente.resolverConflictos();
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta acción solo es válida para Gerentes.");
                        }
                        break;

                    case "Realizar Tarea Técnica":
                        if (empleado instanceof Tecnico) {
                            JOptionPane.showMessageDialog(null, "Ejecutando tarea técnica...");
                            Tecnico tecnico = (Tecnico) empleado;
                            String tarea = JOptionPane.showInputDialog("Ingrese la tarea técnica que realizará:");
                            tecnico.realizarTareaTecnica(tarea);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta acción solo es válida para Técnicos.");
                        }
                        break;

                    case "Asistir a Reunión":
                        if (empleado instanceof Tecnico) {
                            JOptionPane.showMessageDialog(null, "Ejecutando asistencia a reunión...");
                            Tecnico tecnico = (Tecnico) empleado;
                            String fechaReunion = JOptionPane.showInputDialog("Ingrese la fecha de la reunión técnica:");
                            tecnico.asistirReunion(fechaReunion);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta acción solo es válida para Técnicos.");
                        }
                        break;

                    case "Proporcionar Soporte Técnico":
                        if (empleado instanceof Tecnico) {
                            JOptionPane.showMessageDialog(null, "Ejecutando soporte técnico...");
                            Tecnico tecnico = (Tecnico) empleado;
                            tecnico.proporcionarSoporteTecnico();
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta acción solo es válida para Técnicos.");
                        }
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo crear el empleado.");
        }
    }


    /**
     * Método para asignar empleados a un proyecto.
     * Este método solicita al usuario los nombres de los empleados y los asigna a un proyecto.
     * Crea objetos de tipo Técnico para simular la asignación de empleados.
     *
     */
    private static Empleado crearEmpleado(String nombre, String idEmpleado, Departamento departamento) {
        // Selección del rol del empleado
        String[] roles = {"Gerente", "Técnico"};
        String rol = (String) JOptionPane.showInputDialog(null, "Seleccione el rol del empleado:",
                "Asignar Rol", JOptionPane.QUESTION_MESSAGE, null, roles, roles[0]);

        if (rol != null) {
            switch (rol) {
                case "Gerente":
                    return new Gerente(nombre, idEmpleado, departamento);

                case "Técnico":
                    return new Tecnico(nombre, idEmpleado, departamento);

                default:
                    JOptionPane.showMessageDialog(null, "Rol no reconocido.");
                    return null;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún rol.");
            return null;
        }
    }
    /**
     * Método para asignar empleados a un proyecto.
     *
     * Este método solicita al usuario ingresar el nombre de los empleados a ser asignados a un proyecto.
     * Cada empleado creado es un objeto de tipo Técnico que se agrega a la lista de empleados asignados del proyecto.
     *
     * El proceso se repite hasta que el usuario deje el campo de nombre vacío, momento en el cual se detiene la asignación.
     *
     * @param proyecto Proyecto al que se asignarán los empleados.
     *                 Los empleados creados serán añadidos a la lista de empleados asignados del proyecto.
     */
    private static void asignarEmpleadoAProyecto(Proyecto proyecto) {
        // Asignar empleados al proyecto
        List<Empleado> empleadosProyecto = new ArrayList<>();
        String nombreEmpleado;

        JOptionPane.showMessageDialog(null, "Asignación de empleados al proyecto:");

        do {
            nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado para asignar al proyecto (dejar vacío para terminar):");
            if (nombreEmpleado != null && !nombreEmpleado.isEmpty()) {
                // Crear empleado para el proyecto (puedes mejorar la búsqueda de empleados reales aquí)
                Empleado emp = new Tecnico(nombreEmpleado, "ID_" + nombreEmpleado, new Departamento("Departamento", "000")); // Ejemplo de creación de Técnico
                empleadosProyecto.add(emp);
            }
        } while (nombreEmpleado != null && !nombreEmpleado.isEmpty());

        proyecto.getEmpleadosAsignados().addAll(empleadosProyecto);

        JOptionPane.showMessageDialog(null, "Empleados asignados al proyecto con éxito.");
    }


    /**
     * Método para evaluar el desempeño de un empleado.
     * Dependiendo del tipo de empleado (Gerente o Técnico), muestra una evaluación general de sus habilidades.
     *
     * @param empleado Empleado al que se evaluará el desempeño.
     */
    private static void evaluarDesempeno(Empleado empleado) {
        if (empleado instanceof Gerente) {
            Gerente gerente = (Gerente) empleado;
            // Evaluar desempeño del gerente
            JOptionPane.showMessageDialog(null, "Evaluación del desempeño del Gerente: " + gerente.getNombre() + "\n\n" +
                    "El gerente ha demostrado habilidades en la gestión de proyectos, liderazgo y toma de decisiones.");
        } else if (empleado instanceof Tecnico) {
            Tecnico tecnico = (Tecnico) empleado;
            // Evaluar desempeño del técnico
            JOptionPane.showMessageDialog(null, "Evaluación del desempeño del Técnico: " + tecnico.getNombre() + "\n\n" +
                    "El técnico ha demostrado habilidades en la realización de tareas técnicas, soporte y asistencia en reuniones.");
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no reconocido para evaluación.");
        }
    }


    /**
     * Método para asignar un proyecto a un gerente y distribuir tareas a los empleados del proyecto.
     * Este método permite asignar empleados al proyecto y distribuirles tareas específicas.
     * Los empleados creados son de tipo Técnico y se les asignan tareas técnicas que ejecutan inmediatamente.
     *
     * @param gerente Gerente a cargo de la asignación de tareas y la gestión del proyecto.
     * @param proyecto Proyecto que será gestionado por el gerente.
     */
    private static void asignarProyectoYDistribuirTareas(Gerente gerente, Proyecto proyecto) {
        // Asignar empleados al proyecto y distribuir tareas
        Map<Empleado, String> tareas = new HashMap<>();
        String nombreEmpleado;
        String tarea;

        JOptionPane.showMessageDialog(null, "Asignación de proyecto y distribución de tareas:");

        do {
            nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado para asignar al proyecto (dejar vacío para terminar):");
            if (nombreEmpleado != null && !nombreEmpleado.isEmpty()) {
                // Crear empleado para el proyecto (puedes mejorar la búsqueda de empleados reales aquí)
                Empleado emp = new Tecnico(nombreEmpleado, "ID_" + nombreEmpleado, new Departamento("Departamento", "000")); // Ejemplo de creación de Técnico

                tarea = JOptionPane.showInputDialog("Ingrese la tarea para el empleado " + nombreEmpleado + ":");
                if (tarea != null && !tarea.isEmpty()) {
                    tareas.put(emp, tarea);
                }
            }
        } while (nombreEmpleado != null && !nombreEmpleado.isEmpty());

        gerente.asignarProyecto(proyecto, new ArrayList<>(tareas.keySet()));

        // Distribuir tareas
        for (Map.Entry<Empleado, String> entry : tareas.entrySet()) {
            Empleado emp = entry.getKey();
            String tareaAsignada = entry.getValue();
            if (emp instanceof Tecnico) {
                JOptionPane.showMessageDialog(null, "Distribuyendo tarea técnica: " + tareaAsignada + " para el Técnico " + emp.getNombre());
                ((Tecnico) emp).realizarTareaTecnica(tareaAsignada);
            }
        }

        JOptionPane.showMessageDialog(null, "Proyecto asignado y tareas distribuidas con éxito.");
    }
}
