package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;

public class EmpleadoBuilder {
    private String nombre;
    private String idEmpleado;
    private Departamento departamento;

    public String nombre(){
        return nombre;
    }
    public String idEmpleado(){
        return idEmpleado;
    }
    public Departamento departamento(){
        return departamento;
    }
    public EmpleadoBuilder setNombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public EmpleadoBuilder setIdEmpleado(String idEmpleado){
        this.idEmpleado = idEmpleado;
        return this;
    }
    public EmpleadoBuilder setDepartamento(Departamento departamento){
        this.departamento = departamento;
        return this;
    }
    public Empleado build(){
        return new Empleado(nombre, idEmpleado, departamento);
    }
}
