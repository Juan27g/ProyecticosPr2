package co.edu.uniquindio.services;
import co.edu.uniquindio.model.Tecnico;
import co.edu.uniquindio.model.Departamento;

import java.util.List;

public interface ICrudTecnico {
    public boolean createTecnico(String nombre, String idEmpleado, Departamento departamento);
    public boolean updateTecnico(String nombre, String idEmpleado, Departamento departamento);
    public boolean deleteTecnico(String IdEmpleado);
    public Tecnico getTecnico(String IdEmpleado);
    public List<Tecnico> getTecnicos();

}
