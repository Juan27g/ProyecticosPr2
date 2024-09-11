package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {
    private String nombre;

    public Collection<Departamento> departamentos;
    public Collection<Proyecto> proyectos;
    public Collection<Empleado> empleados;

    public Empresa( String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<Departamento>();
        this.proyectos = new ArrayList<Proyecto>();
        this.empleados = new ArrayList<Empleado>();
    }
    public String getNombre() {
        return nombre;
    }

    public Collection<Departamento> getDepartamentos() {
        return departamentos;
    }

    public Collection<Proyecto> getProyectos() {
        return proyectos;
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDepartamentos(Collection<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void setProyectos(Collection<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }





}
