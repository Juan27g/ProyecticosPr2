package co.edu.uniquindio.projectparcial2.service;

import co.edu.uniquindio.projectparcial2.model.Producto;

import java.util.List;

public interface ICrudProducto {
  boolean crearProducto(Producto newProducto);
  boolean eliminarProducto(String id);
  boolean actualizarProducto(String idProducto, Producto producto);
  Producto buscarProducto(String id);
  boolean verificarProductoExistente(String idProducto);
}
