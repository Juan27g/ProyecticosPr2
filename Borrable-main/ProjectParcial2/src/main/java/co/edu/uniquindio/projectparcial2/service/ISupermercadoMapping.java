package co.edu.uniquindio.projectparcial2.service;

import co.edu.uniquindio.projectparcial2.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectparcial2.model.Producto;

import java.util.List;

public interface ISupermercadoMapping {
    // Producto Mapping
    List<ProductoDto> getProductosDto(List<Producto> productos);
    ProductoDto productoToProductoDto(Producto producto);
    Producto productoDtoToProducto(ProductoDto productoDto);
}
