package co.edu.uniquindio.services;
import co.edu.uniquindio.model.Gerente;
import co.edu.uniquindio.model.Departamento;

import java.util.ArrayList;

public interface ICrudGerente {
    public boolean createGerente(String nombre, String idEmpleado, Departamento departamento);
    public boolean updateGerente(String nombre, String idEmpleado, Departamento departamento);
    public boolean deleteGerente(String idEmpleado);
    public Gerente getGerente(String idEmpleado);
    public ArrayList<Gerente> getGerentes();
}
