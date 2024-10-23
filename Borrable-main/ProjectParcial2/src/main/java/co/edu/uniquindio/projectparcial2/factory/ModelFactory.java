package co.edu.uniquindio.projectparcial2.factory;

import co.edu.uniquindio.projectparcial2.mapping.dto.ProductoDto;
import co.edu.uniquindio.projectparcial2.mapping.mapper.SupermercadoMappingImpl;
import co.edu.uniquindio.projectparcial2.model.CarritoCompras;
import co.edu.uniquindio.projectparcial2.model.Cliente;
import co.edu.uniquindio.projectparcial2.model.Facade.FacadeVariado;
import co.edu.uniquindio.projectparcial2.model.Producto;
import co.edu.uniquindio.projectparcial2.model.Supermercado;
import co.edu.uniquindio.projectparcial2.service.IModelFactoryService;

import java.util.List;

public class ModelFactory implements IModelFactoryService {
    private static ModelFactory instance;
    Supermercado supermercado;
    SupermercadoMappingImpl mapper;
    FacadeVariado facade;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory() {
        mapper = new SupermercadoMappingImpl();
        supermercado = inicializarDatos();
        facade = new FacadeVariado(supermercado);
    }


    @Override
    public List<ProductoDto> getProductosDto() {
        return mapper.getProductosDto(getSupermercado().getListProductos());
    }

    @Override
    public boolean agregarProducto(ProductoDto productoDto) {
        if(getSupermercado().verificarProductoExistente(productoDto.idProducto())){
            Producto newProducto = mapper.productoDtoToProducto(productoDto);

            getSupermercado().crearProducto(newProducto);
            return true;
        }
        return false;
    }

    @Override
    public boolean actualizarProducto(String idActual, ProductoDto productoDto) {
        if(!getSupermercado().verificarProductoExistente(idActual)){
            Producto newProducto = mapper.productoDtoToProducto(productoDto);

            getSupermercado().actualizarProducto(idActual, newProducto);
            return true;
        }
        return false;
    }

    @Override
    public void getProductosEnRango(int inferior, int superior) {
        facade.buscarProductoEnRango(inferior, superior);
    }

    @Override
    public void pagarCarrito(String id) {
        facade.pagarCarrito(id);
    }

    @Override
    public boolean eliminarProducto(String idProducto) {
        return getSupermercado().eliminarProducto(idProducto);
    }


    public static Supermercado inicializarDatos(){
        Supermercado supermercado = new Supermercado();
        supermercado.setNombre("Supermercado");

        Producto newProducto = Producto.builder()
                .idProducto("1")
                .nombre("Cepillo")
                .precio(1000)
                .cantDisponible(10)
                .build();

        Producto newProducto2 = Producto.builder()
                .idProducto("2")
                .nombre("Camisa")
                .precio(70000)
                .cantDisponible(5)
                .build();

        supermercado.getListProductos().add(newProducto);
        supermercado.getListProductos().add(newProducto2);


        Producto pro1 = Producto.builder().idProducto("01").cantDisponible(1).nombre("nombre1").precio(1).build();
        Producto pro2 = Producto.builder().idProducto("02").cantDisponible(2).nombre("nombre2").precio(2).build();
        Producto pro3 = Producto.builder().idProducto("03").cantDisponible(3).nombre("nombre3").precio(3).build();

        Cliente cliente = Cliente.builder().nombre("Cliente").cedula("000").direccion("alli").telefono("000").build();
        CarritoCompras car1 = new CarritoCompras("00",cliente);
        car1.agregarProducto(pro1);

        supermercado.getListProductos().add(pro1);
        supermercado.getListProductos().add(pro2);
        supermercado.getListProductos().add(pro3);
        supermercado.getListCarritoCompras().add(car1);

        return supermercado;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }
}
