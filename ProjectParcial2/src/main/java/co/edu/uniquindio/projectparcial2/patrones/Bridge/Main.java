package co.edu.uniquindio.projectparcial2.patrones.Bridge;

import co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion.EntregaInternacional;
import co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion.EntregaLocal;

public class Main {
    public static void main(String[] args) {
        EntregaInternacional entregaInternacional = new EntregaInternacional();
        EntregaLocal entrega = new EntregaLocal();
        PrestamoLocal prestamoLocal = new PrestamoLocal(entrega);
        prestamoLocal.realizarPrestamo();
    }
}
