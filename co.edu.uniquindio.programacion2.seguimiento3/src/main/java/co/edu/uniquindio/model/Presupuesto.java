package co.edu.uniquindio.model;

import co.edu.uniquindio.model.builder.PresupuestoBuilder;

public class Presupuesto {

    private String idPresupuesto;
    private int valor;
    private String descripcion;
    public Estado estado;

    public Presupuesto(String idPresupuesto, int valor, String descripcion, Estado estado) {
        this.idPresupuesto = idPresupuesto;
        this.valor = valor;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getIdPresupuesto() {
        return idPresupuesto;
    }

    public int getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public  static PresupuestoBuilder presupuesto() {
        return new PresupuestoBuilder();
    }


}
