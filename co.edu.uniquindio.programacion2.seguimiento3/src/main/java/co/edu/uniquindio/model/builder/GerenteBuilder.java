package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Gerente;

public class GerenteBuilder extends EmpleadoBuilder {
    public GerenteBuilder() {}

    public GerenteBuilder setNombre(String nombre) {
        super.setNombre(nombre);
        return this;
    }
    public GerenteBuilder setIdEmpleado(String idEmpleado) {
        super.setIdEmpleado(idEmpleado);
        return this;
    }
    public GerenteBuilder setDepartamento(Departamento departamento) {
        super.setDepartamento(departamento);
        return this;
    }

    public Gerente build(){
        return new Gerente(nombre(), idEmpleado(), departamento());
    }

}
