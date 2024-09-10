package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Clase Departamento
 */
public class Departamento {
    private String nombre;
    private String codigo;
    private Collection<Empleado> listaEmpleados;


    // Constructor
    /**
     * Crea una nueva instancia de {@code Departamento} con el nombre y código especificados.
     * Inicializa la lista de empleados como una lista vacía.
     *
     * @param nombre El nombre del departamento.
     * @param codigo El código único del departamento.
     */
    public Departamento(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleados = new ArrayList<>();
    }

    /**
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

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Agrega un empleado a la lista de empleados del departamento.
     *
     * @param empleado El empleado que se agregará al departamento.
     */
    public void agregarEmpleado(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }
}


