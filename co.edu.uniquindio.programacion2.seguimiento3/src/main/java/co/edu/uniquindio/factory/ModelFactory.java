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

        //Proyectos
        Proyecto proyecto1 = Proyecto.proyetoBuiler().setNombre("El propio").setCodigo("0001").build();
        Proyecto proyecto2 = Proyecto.proyetoBuiler().setNombre("Proyecto carimañola").setCodigo("9271").build();
    }
}
