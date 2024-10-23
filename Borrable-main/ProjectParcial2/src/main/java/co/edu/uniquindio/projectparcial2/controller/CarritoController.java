package co.edu.uniquindio.projectparcial2.controller;

import co.edu.uniquindio.projectparcial2.factory.ModelFactory;
import co.edu.uniquindio.projectparcial2.service.ICarritoControllerServices;

public class CarritoController implements ICarritoControllerServices {
    ModelFactory modelFactory;

    public CarritoController() {
        this.modelFactory = ModelFactory.getInstance();
    }

    @Override
    public void pagarCarrito(String id) {
        modelFactory.pagarCarrito(id);
    }
}
