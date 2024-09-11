package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Gerente;

public class GerenteBuilder extends EmpleadoBuilder<GerenteBuilder> {

    public Gerente build (){
        return new Gerente(nombre,idEmpleado, departamento);
    }

    @Override
    protected GerenteBuilder self() {
        return this;
    }
}
