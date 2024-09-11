package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Proyecto;

import java.util.List;

public class ProyetoBuiler {
    private String nombre;
    private String codigo;
    private List<Empleado> empleadosAsignados;

    public String Nombre() {
        return nombre;
    }

    public String Codigo() {
        return codigo;
    }

    public List<Empleado> EmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEmpleadosAsignados(List<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }
    public Proyecto build() {
        return new Proyecto(nombre, codigo);
    }
}
