package co.edu.uniquindio.services;

import co.edu.uniquindio.factory.ModelFactory;
import co.edu.uniquindio.model.Departamento;
import co.edu.uniquindio.model.Empleado;
import co.edu.uniquindio.model.Gerente;
import co.edu.uniquindio.model.Proyecto;

import java.util.ArrayList;
import java.util.List;

public class MainEmpresa {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
    }
    public static void crudProyecto (ModelFactory modelFactory) {
        //createProyecto (modelFactory);
        //deleteProyecto (modelFactory);
        //updateProyecto (modelFactory);
        //getProyecto (modelFactory);
        getProyectos(modelFactory);

    }

    private static void crearProyecto (ModelFactory modelFactory) {
        boolean crear =modelFactory.createProyecto("UQ1", "0010");
        System.out.println("creacion del proyecto es: " + crear);
    }

    private static void eliminarProyecto (ModelFactory modelFactory) {
        boolean eliminar =modelFactory.deleteProyecto("0010");
        System.out.println("eliminacion del proyecto es: " + eliminar);
    }

    private static void actualizarProyecto (ModelFactory modelFactory) {
        if (!modelFactory.updateProyecto("Capitalizacion", "666")){
            System.out.println("No se pudo modificar");
        }else{
            System.out.println("si se modifico");
        }
    }
    private static void getProyecto (ModelFactory modelFactory) {
        if (modelFactory.getProyecto("0010")== null){
            System.out.println("No se encontro el proyecto");
        } else {
            System.out.println("Se encontro el proyecto exitosamente");
            System.out.println(modelFactory.getProyecto("0010").getNombre());
        }
    }

    private static void getProyectos (ModelFactory modelFactory) {
        if (modelFactory.getProyectos() == null){
            System.out.println("No se encontro la lista de proyectos");
        } else {
            System.out.println("Se encontro la lista de proyectos");
            System.out.println(modelFactory.getProyectos());
        }
    }

    private static void ejemploClonarAsignar(ModelFactory modelFactory) {
        Proyecto proyectoE = Proyecto.proyetoBuiler().setNombre("UQ").setCodigo("9271").build();
        proyectoE.clone();



        
    }
}
