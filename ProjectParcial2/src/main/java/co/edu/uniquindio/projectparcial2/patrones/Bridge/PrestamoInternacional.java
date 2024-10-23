package co.edu.uniquindio.projectparcial2.patrones.Bridge;

import co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion.EntregaInternacional;
import co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion.EntregaLocal;
import co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion.IMetodoEntrega;

public class PrestamoInternacional extends Prestamo {

    public PrestamoInternacional(IMetodoEntrega metodo) {
        super(metodo);
        calcularFechaEntrega();
    }

    @Override
    public void calcularFechaEntrega() {
        if (super.getMetodo() instanceof EntregaInternacional){
            super.setFechaEntrega("Fecha entrega larga porque es internacional");
        }
    }

    @Override
    public void realizarPrestamo() {
        super.getMetodo().procesarPedido(this);
        if (super.getFechaEntrega() != null){
            System.out.println("Su pedido se ha realizado correctamente, tiene una fecha de entrega de: "+super.getFechaEntrega());
        }else{
            System.out.println("Este tipo de pedido no es compatible con el tipo de entrega");
        }

    }
}
