package co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion;

import co.edu.uniquindio.projectparcial2.patrones.Bridge.Prestamo;
import co.edu.uniquindio.projectparcial2.patrones.Bridge.PrestamoInternacional;

public class EntregaInternacional implements IMetodoEntrega{
    @Override
    public void procesarPedido(Prestamo prestamo) {
         if (prestamo instanceof PrestamoInternacional) {
            System.out.println("Procesando prestamo internacional para una entrega internacional");
         }else{
             System.out.println("Invalido");
         }
    }
}
