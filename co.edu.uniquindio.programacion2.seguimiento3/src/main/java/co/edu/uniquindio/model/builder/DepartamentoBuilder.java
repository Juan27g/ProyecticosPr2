package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;

import java.util.Collection;

public class DepartamentoBuilder {
    private String nombre;
    private String codigo;
    private Collection<Empleado> listaEmpleados;

    public String nombre() {
        return nombre;
    }

    public String codigo() {
        return codigo;
    }

    public Collection<Empleado> ListaEmpleados() {
        return listaEmpleados;
    }

    public DepartamentoBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DepartamentoBuilder setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public DepartamentoBuilder setListaEmpleados(Collection<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
        return this;
    }
    public Departamento build() {
        return new Departamento(nombre(), codigo());
    }
}
