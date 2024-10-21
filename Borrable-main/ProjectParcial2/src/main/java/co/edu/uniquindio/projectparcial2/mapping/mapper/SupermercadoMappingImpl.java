package co.edu.uniquindio.projectparcial2.mapping.mapper;

import co.edu.uniquindio.projectparcial2.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectparcial2.model.Cliente;
import co.edu.uniquindio.projectparcial2.model.Producto;
import co.edu.uniquindio.projectparcial2.service.ISupermercadoMapping;

import java.util.ArrayList;
import java.util.List;

public class SupermercadoMappingImpl implements ISupermercadoMapping {
    @Override
    public List<ProductoDto> getProductosDto(List<Producto> listProductos) {
        if(listProductos==null){
            return null;
        }

        List<ProductoDto> productosDto = new ArrayList<>();
        for (Producto producto : listProductos) {
            productosDto.add(productoToProductoDto(producto));
        }

        return productosDto;
    }

    @Override
    public ProductoDto productoToProductoDto(Producto producto) {
        return new ProductoDto(
                producto.getIdProducto(),
                producto.getNombre(),
                producto.getPrecio(),
                producto.getCantDisponible());
    }

    @Override
    public Producto productoDtoToProducto(ProductoDto productoDto) {
        return Producto.builder()
                .idProducto(productoDto.idProducto())
                .nombre(productoDto.nombre())
                .precio(productoDto.precio())
                .cantDisponible(productoDto.cantDisponible())
                .build();
    }

}
