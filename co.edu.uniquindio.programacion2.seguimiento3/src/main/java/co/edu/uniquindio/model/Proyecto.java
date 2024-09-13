package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.ProyetoBuiler;
import co.edu.uniquindio.services.IPrototypeProyecto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Clase Proyecyo
 */
public class Proyecto implements IPrototypeProyecto {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados;


    // Constructor
    /**
     * Crea una nueva instancia de {@code Proyecto} con el nombre y código especificados.
     * Inicializa la lista de empleados asignados como una lista vacía.
     *
     * @param nombre El nombre del proyecto.
     * @param codigo El código único del proyecto.
     */
    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = new ArrayList<>();
    }

    /**
     *
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public List<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }


    /**
     * Asigna una lista de empleados al proyecto.
     * @param empleados La lista de empleados que se asignarán al proyecto.
     */
    public void asignarEmpleados(List<Empleado> empleados) {
        this.empleadosAsignados = empleados;
    }

    /**
     * Muestra el progreso actual del proyecto.
     * @return Una cadena que indica el progreso del proyecto.
     */
    public String mostrarProgreso() {
        return "Progreso del proyecto " + nombre;
    }

    /**
     * Genera un resumen del estado actual del proyecto.
     * @return Una cadena que contiene un resumen del proyecto.
     */
    public String generarResumen() {
        return "Resumen del proyecto " + nombre;
    }

    public static ProyetoBuiler proyetoBuiler() {
        return new ProyetoBuiler();
    }

    @Override
    public IPrototypeProyecto clone() {
        Proyecto proyecto =null;
        try {
            proyecto = (Proyecto) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return proyecto;

    }
}
