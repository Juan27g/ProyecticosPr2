package co.edu.uniquindio.projectparcial2.controller;

import co.edu.uniquindio.projectparcial2.factory.ModelFactory;
import co.edu.uniquindio.projectparcial2.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectparcial2.service.IProductoControllerService;

import java.io.Serializable;
import java.util.List;

public class ProductoController implements IProductoControllerService {
    ModelFactory modelFactory;

    public ProductoController(){
        modelFactory = ModelFactory.getInstance();
    }


    @Override
    public List<ProductoDto> getProductosDto() {
        return modelFactory.getProductosDto();
    }

    @Override
    public boolean agregarProducto(ProductoDto productoDto) {
        return modelFactory.agregarProducto(productoDto);
    }

    @Override
    public boolean eliminarProducto(String idProducto) {
        return modelFactory.eliminarProducto(idProducto);
    }

    @Override
    public boolean actualizarProducto(String idActual, ProductoDto productoDto) {
        return modelFactory.actualizarProducto(idActual, productoDto);
    }
}
