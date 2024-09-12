package co.edu.uniquindio.model;

import co.edu.uniquindio.services.ICrudDepartamento;
import co.edu.uniquindio.services.ICrudProyecto;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements ICrudProyecto, ICrudDepartamento {
    private String nombre;

    private List<Empleado> listaEmpleados = new ArrayList <Empleado>();
    private List<Departamento> listaDepartamentos = new ArrayList <Departamento>();
    private List<Proyecto> listaProyectos = new ArrayList <Proyecto>();

    public Empresa( String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public List<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }

    public List<Proyecto> getListaProyectos() {
        return listaProyectos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void setListaDepartamentos(List<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public void setListaProyectos(List<Proyecto> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    private boolean verificarDepartamentoRepetido (String nombre){
        for (Departamento departamento : listaDepartamentos){
            if (departamento.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    private boolean verificarProyectoRepetido (String nombre){
        for (Proyecto proyecto : listaProyectos){
            if (proyecto.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean createProyecto(String nombre, String codigo) {
        if (!verificarProyectoRepetido(nombre)){
            Proyecto proyecto = Proyecto.proyetoBuiler().setNombre(nombre).setCodigo(codigo).build();
            listaProyectos.add(proyecto);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateProyecto(String nombre, String codigo) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getNombre().equals(nombre) && proyecto.getCodigo().equals(codigo)){
                proyecto.setNombre(nombre);
                proyecto.setCodigo(codigo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteProyecto(String codigo) {
        for (Proyecto proyecto : listaProyectos) {
            if (proyecto.getCodigo().equals(codigo)) {
                listaProyectos.remove(proyecto);
                return true;
            }
        }
        return false;
    }

    @Override
    public Proyecto getProyecto(String codigo) {
        for (Proyecto proyecto : listaProyectos){
            if (proyecto.getCodigo().equals(codigo)){
                return proyecto;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Proyecto> getProyectos() {
        return new ArrayList(listaProyectos);
    }

//ICrud Departamento
    @Override
    public boolean createDepartamento(String nombre, String codigo) {
        if (!verificarDepartamentoRepetido(nombre)){
            Departamento departamento = Departamento.departamentobuilder().setNombre(nombre).setCodigo(codigo).build();
            listaDepartamentos.add(departamento);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateDepartamento(String nombre, String codigo) {
        for (Departamento departamento : listaDepartamentos){
            if (departamento.getNombre().equals(nombre) && departamento.getCodigo().equals(codigo)){
                departamento.setNombre(nombre);
                departamento.setCodigo(codigo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteDepartamento(String codigo) {
        for (Departamento departamento : listaDepartamentos){
            if (departamento.getCodigo().equals(codigo)){
                listaDepartamentos.remove(departamento);
                return true;
            }
        }
        return false;
    }

    @Override
    public Departamento getDepartamento(String codigo) {
        for (Departamento departamento : listaDepartamentos){
            if (departamento.getCodigo().equals(codigo)){
                return departamento;
            }
        }
        return null;
    }

    @Override
    public List<Departamento> getDepartamentos() {
        return  new ArrayList(listaDepartamentos);
    }
}
