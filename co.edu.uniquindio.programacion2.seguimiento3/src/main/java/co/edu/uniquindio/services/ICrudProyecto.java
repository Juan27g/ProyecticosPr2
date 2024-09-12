package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Proyecto;

import java.util.ArrayList;

public interface ICrudProyecto {
    public boolean createProyecto(String nombre, String codigo);
    public boolean updateProyecto(String nombre, String codigo);
    public boolean deleteProyecto(String codigo);
    public Proyecto getProyecto(String codigo);
    public ArrayList<Proyecto> getProyectos();
}
