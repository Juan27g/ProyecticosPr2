package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;

public class EmpleadoBuilder<T extends EmpleadoBuilder<T>> {

    protected String nombre;
    protected String idEmpleado;
    protected Departamento departamento;

    public T nombre(String nombre) {
        this.nombre = nombre;
        return self ();
    }

    public T id(String idEmpleado) {
        this.idEmpleado = idEmpleado;
        return self ();
    }

    public T departamento(Departamento departamento) {
        this.departamento = departamento;
        return self ();
    }

    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public Empleado build() {
        return new Empleado(nombre, idEmpleado, departamento) {
            @Override
            public void contribuir() {

            }
        };
    }
}