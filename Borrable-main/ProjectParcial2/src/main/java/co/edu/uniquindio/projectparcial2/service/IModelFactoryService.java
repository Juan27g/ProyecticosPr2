package co.edu.uniquindio.projectparcial2.service;

import co.edu.uniquindio.projectparcial2.mapping.dto.ProductoDto;

import java.util.List;

public interface IModelFactoryService {
    List<ProductoDto> getProductosDto();
    boolean agregarProducto(ProductoDto producto);
    boolean eliminarProducto(String idProducto);
    boolean actualizarProducto(String idActual, ProductoDto producto);
    void getProductosEnRango(int inferior, int superior);
    void pagarCarrito(String id);
}
