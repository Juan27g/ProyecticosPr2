package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.*;

public class ModelFactory {
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

    private static void inicializarDatos() {
        empresa = new Empresa("Empresita");

        //Departamentos
        Departamento depto1 = Departamento.departamentobuilder().setNombre("Finanzas").setCodigo("1111").build();
        Departamento depto2 = Departamento.departamentobuilder().setNombre("Investigación").setCodigo("2222").build();

        //Gerente
        Gerente gerente1 = Gerente.gerentebuilder().setNombre("Tatiana").setIdEmpleado("2707").setDepartamento(depto2).build();
        Gerente gerente2 = Gerente.gerentebuilder().setNombre("Samue").setIdEmpleado("1007").setDepartamento(depto2).build();

        //Tecnicos
        Tecnico tecnico1 = Tecnico.tecnicobuilder().setNombre("Jose").setIdEmpleado("7777").setDepartamento(depto1).build();
        Tecnico tecnico2 = Tecnico.tecnicobuilder().setNombre("Jesu").setIdEmpleado("6666").setDepartamento(depto1).build();
        Tecnico tecnico3 = Tecnico.tecnicobuilder().setNombre("Yulieth").setIdEmpleado("5555").setDepartamento(depto2).build();
        Tecnico tecnico4 = Tecnico.tecnicobuilder().setNombre("Yonaiker").setIdEmpleado("4444").setDepartamento(depto2).build();

        //Proyectos
        Proyecto proyecto1 = Proyecto.proyetoBuiler().setNombre("El propio").setCodigo("0001").build();
        Proyecto proyecto2 = Proyecto.proyetoBuiler().setNombre("Proyecto carimañola").setCodigo("9271").build();
    }
}
