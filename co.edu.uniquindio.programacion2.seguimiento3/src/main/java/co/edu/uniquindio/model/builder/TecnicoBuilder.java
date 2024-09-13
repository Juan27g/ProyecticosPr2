package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Tecnico;

public class TecnicoBuilder extends EmpleadoBuilder<TecnicoBuilder> {

    public TecnicoBuilder(){
    }

    public  TecnicoBuilder setNombre(String nombre){
        super.self();
        return this;
    }

    public TecnicoBuilder setIdEmpleado(String idEmpleado){
        super.self();
        return this;
    }

    public TecnicoBuilder setDepartamento(Departamento departamento){
        super.self();
        return this;
    }

    public Tecnico build(){
        return new Tecnico(self().nombre, self().idEmpleado, self().departamento);
    }

    @Override
    protected TecnicoBuilder self() {
        return this;
    }
}
