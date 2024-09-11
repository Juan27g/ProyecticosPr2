package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empresa;

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
        Departamento depto1 = Departamento.departamentobuilder().setNombre("").setCodigo("178291").build();

        //termina esto ey

    }
}
