package co.edu.uniquindio.projectparcial2.patrones.Bridge;

import co.edu.uniquindio.projectparcial2.patrones.Bridge.implementacion.IMetodoEntrega;

public abstract class Prestamo {
    private String numPrestamos;
    private String fechaPrestamo;
    private IMetodoEntrega metodo;
    private String fechaEntrega;

    public Prestamo(IMetodoEntrega metodo){
        this.metodo = metodo;
    }

    public abstract void calcularFechaEntrega();
    public abstract void realizarPrestamo();

    public String getNumPrestamos() {
        return numPrestamos;
    }

    public void setNumPrestamos(String numPrestamos) {
        this.numPrestamos = numPrestamos;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public IMetodoEntrega getMetodo() {
        return metodo;
    }

    public void setMetodo(IMetodoEntrega metodo) {
        this.metodo = metodo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
