package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Tecnico;

public class TecnicoBuilder extends EmpleadoBuilder<TecnicoBuilder> {

    public Tecnico build (){
        return new Tecnico(nombre, id, departamento);
    }

    @Override
    protected TecnicoBuilder self() {
        return this;
    }
}
