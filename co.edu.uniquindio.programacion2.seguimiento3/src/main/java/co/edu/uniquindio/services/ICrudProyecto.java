package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Proyecto;

import java.util.ArrayList;

public interface ICrudProyecto {
    public boolean createProyecto(String nombre, String codigo);
    public boolean updateProyecto();
    public boolean deleteProyecto();
    public Proyecto getProyecto();
    public ArrayList<Proyecto> getProyectos();
}
