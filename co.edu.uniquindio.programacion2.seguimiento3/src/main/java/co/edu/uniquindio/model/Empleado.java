package co.edu.uniquindio.model;


import co.edu.uniquindio.model.builder.EmpleadoBuilder;

/**
 *
 * Clase Empleado
 */
public abstract class Empleado {
    private String nombre;
    private String idEmpleado;
    private Departamento departamento;


    /**
     * Crea una nueva instancia de {@code Empleado} con el nombre, ID del empleado y departamento especificados.
     *
     * @param nombre El nombre del empleado.
     * @param idEmpleado El identificador único del empleado.
     * @param departamento El departamento al que pertenece el empleado.
     */
    public Empleado(String nombre, String idEmpleado, Departamento departamento) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.departamento = departamento;
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
    public String getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public static EmpleadoBuilder empleadoBuilder(){
        return new EmpleadoBuilder();

    }

    public abstract void contribuir();
}
