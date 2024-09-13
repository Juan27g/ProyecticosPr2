package co.edu.uniquindio.services;

import co.edu.uniquindio.model.Estado;
import co.edu.uniquindio.model.Presupuesto;

import java.util.List;

public interface ICrudPresupuesto {
    public boolean createPresupuesto(String idPresupuesto, int valor, String descripcion, Estado estado);
    public boolean deletePresupuesto(String idPresupuesto);
    public Presupuesto getPresupuesto(String idPresupuesto);
    public boolean updatePresupuesto(String idPresupuesto, int valor, String descripcion, Estado estado);
    public List<Presupuesto> getPresupuestos();

}
