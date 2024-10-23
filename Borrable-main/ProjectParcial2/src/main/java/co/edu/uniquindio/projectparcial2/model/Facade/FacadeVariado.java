package co.edu.uniquindio.projectparcial2.model.Facade;

import co.edu.uniquindio.projectparcial2.model.Supermercado;

public class FacadeVariado {
    private Supermercado supermercado;

    public FacadeVariado(Supermercado supermercado) {
        this.supermercado =supermercado;
    }

    public void buscarProductoEnRango(int inferior, int superior){
        supermercado.buscarProductosEnRango(inferior,superior);
    }
    public void pagarCarrito(String id){
        supermercado.pagarCarrito(id);
    }
}
