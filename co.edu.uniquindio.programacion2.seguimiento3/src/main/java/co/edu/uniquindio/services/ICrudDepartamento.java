package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Departamento;

import java.util.List;

public interface ICrudDepartamento {
    public  boolean createDepartamento(String nombre, String codigo);
    public  boolean updateDepartamento(String nombre, String codigo);
    public  boolean deleteDepartamento(String codigo);
    public  Departamento getDepartamento(String codigo);
    public List<Departamento> getDepartamentos();
}
