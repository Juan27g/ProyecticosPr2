package co.edu.uniquindio.projectparcial2.patrones.Bridge;

import co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion.EntregaLocal;
import co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion.IMetodoEntrega;

public class PrestamoLocal extends Prestamo{

    public PrestamoLocal(IMetodoEntrega metodo){
        super(metodo);
        calcularFechaEntrega();
    }

    @Override
    public void calcularFechaEntrega() {
        if(super.getMetodo() instanceof EntregaLocal){
            super.setFechaEntrega("Fecha corta porque es local");
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
