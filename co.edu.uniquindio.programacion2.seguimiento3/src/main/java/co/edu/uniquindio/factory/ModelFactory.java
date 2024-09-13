package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;
import co.edu.uniquindio.model.builder.PresupuestoBuilder;
import co.edu.uniquindio.services.*;

import java.util.ArrayList;
import java.util.List;

public class ModelFactory implements ICrudGerente, ICrudProyecto, ICrudTecnico, ICrudDepartamento, ICrudPresupuesto {
    public  static ModelFactory instance;
    public static Empresa empresa;

    private ModelFactory() {
        inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    @Override
    public boolean createDepartamento(String nombre, String codigo) {
        return empresa.createDepartamento(nombre, codigo);
    }

    @Override
    public boolean updateDepartamento(String nombre, String codigo) {
        return empresa.updateDepartamento(nombre, codigo);
    }

    @Override
    public boolean deleteDepartamento(String codigo) {
        return empresa.deleteDepartamento(codigo);
    }

    @Override
    public Departamento getDepartamento(String codigo) {
        return empresa.getDepartamento(codigo);
    }

    @Override
    public List<Departamento> getDepartamentos() {
        return empresa.getDepartamentos();
    }

    @Override
    public boolean createGerente(String nombre, String idEmpleado, Departamento departamento) {
        return empresa.createGerente(nombre, idEmpleado, departamento);
    }

    @Override
    public boolean updateGerente(String nombre, String idEmpleado, Departamento departamento) {
        return empresa.updateGerente(nombre, idEmpleado, departamento);
    }

    @Override
    public boolean deleteGerente(String idEmpleado) {
        return empresa.deleteGerente(idEmpleado);
    }

    @Override
    public Gerente getGerente(String idEmpleado) {
        return empresa.getGerente(idEmpleado);
    }

    @Override
    public ArrayList<Gerente> getGerentes() {
        return empresa.getGerentes();
    }

    @Override
    public boolean createProyecto(String nombre, String codigo) {
        return empresa.createProyecto(nombre, codigo);
    }

    @Override
    public boolean updateProyecto(String nombre, String codigo) {
        return empresa.updateProyecto(nombre, codigo);
    }

    @Override
    public boolean deleteProyecto(String codigo) {
        return empresa.deleteProyecto(codigo);
    }

    @Override
    public Proyecto getProyecto(String codigo) {
        return empresa.getProyecto(codigo);
    }

    @Override
    public ArrayList<Proyecto> getProyectos() {
        return empresa.getProyectos();
    }

    @Override
    public boolean createTecnico(String nombre, String idEmpleado, Departamento departamento) {
        return empresa.createTecnico(nombre, idEmpleado, departamento);
    }

    @Override
    public boolean updateTecnico(String nombre, String idEmpleado, Departamento departamento) {
        return empresa.updateTecnico(nombre, idEmpleado, departamento);
    }

    @Override
    public boolean deleteTecnico(String IdEmpleado) {
        return empresa.deleteTecnico(IdEmpleado);
    }

    @Override
    public Tecnico getTecnico(String IdEmpleado) {
        return empresa.getTecnico(IdEmpleado);
    }

    @Override
    public List<Tecnico> getTecnicos() {
        return empresa.getTecnicos();
    }
    @Override

    public boolean createPresupuesto(String idPresupuesto, int valor, String descripcion, Estado estado) {
        return empresa.createPresupuesto(idPresupuesto, valor, descripcion, estado);
    }

    @Override
    public boolean deletePresupuesto(String idPresupuesto) {
        return empresa.deletePresupuesto(idPresupuesto);
    }

    @Override
    public Presupuesto getPresupuesto(String idPresupuesto) {
        return empresa.getPresupuesto(idPresupuesto);
    }

    @Override
    public boolean updatePresupuesto(String idPresupuesto, int valor, String descripcion, Estado estado) {
        return empresa.updatePresupuesto(idPresupuesto, valor, descripcion, estado);
    }

    @Override
    public List<Presupuesto> getPresupuestos() {
        return empresa.getPresupuestos();
    }


    private static void inicializarDatos() {
        empresa = new Empresa("Empresa MC");

        //Departamentos
        Departamento depto1 = Departamento.departamentobuilder().setNombre("Finanzas").setCodigo("1111").build();
        Departamento depto2 = Departamento.departamentobuilder().setNombre("Investigación").setCodigo("2222").build();
        Departamento depto3 = Departamento.departamentobuilder().setNombre("Comercio").setCodigo("2222").build();
        Departamento depto4 = Departamento.departamentobuilder().setNombre("Biotecnología").setCodigo("2222").build();

        //Proyectos
        Proyecto proyecto1 = Proyecto.proyetoBuiler().setNombre("Manhattan").setCodigo("0001").build();
        Proyecto proyecto2 = Proyecto.proyetoBuiler().setNombre("UQ").setCodigo("9271").build();

        //Gerentes
        Gerente gerente1 = Gerente.gerentebuilder().setNombre("Armando").setIdEmpleado("1234").setDepartamento(depto1).build();
        Gerente gerente2 = Gerente.gerentebuilder().setNombre("Gerald").setIdEmpleado("7355").setDepartamento(depto2).build();
        Gerente gerente3 = Gerente.gerentebuilder().setNombre("Tatiana").setIdEmpleado("3753").setDepartamento(depto3).build();
        Gerente gerente4 = Gerente.gerentebuilder().setNombre("Samuel").setIdEmpleado("4114").setDepartamento(depto4).build();

        //Tecnicos
        Tecnico tecnico1 = Tecnico.tecnicobuilder().setNombre("David").setIdEmpleado("0022").setDepartamento(depto1).build();
        Tecnico tecnico2 = Tecnico.tecnicobuilder().setNombre("Camilo").setIdEmpleado("7527").setDepartamento(depto2).build();
        Tecnico tecnico3 = Tecnico.tecnicobuilder().setNombre("Julian").setIdEmpleado("0022").setDepartamento(depto3).build();
        Tecnico tecnico4 = Tecnico.tecnicobuilder().setNombre("Sebastian").setIdEmpleado("0354").setDepartamento(depto4).build();


        empresa.agregarEmpleados(gerente1);
        empresa.agregarEmpleados(gerente2);
        empresa.agregarEmpleados(gerente3);
        empresa.agregarEmpleados(gerente4);
        empresa.agregarEmpleados(tecnico1);
        empresa.agregarEmpleados(tecnico2);
        empresa.agregarEmpleados(tecnico3);
        empresa.agregarEmpleados(tecnico4);

        empresa.agregarDepartamentos(depto1);
        empresa.agregarDepartamentos(depto2);
        empresa.agregarDepartamentos(depto3);
        empresa.agregarDepartamentos(depto4);

        empresa.agregarProyectos(proyecto1);
        empresa.agregarProyectos(proyecto2);





    }


}
