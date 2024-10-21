package co.edu.uniquindio.projectparcial2.mapping.dto;

public record ProductoDto(
        String idProducto,
        String nombre,
        double precio,
        int cantDisponible
) {
}
