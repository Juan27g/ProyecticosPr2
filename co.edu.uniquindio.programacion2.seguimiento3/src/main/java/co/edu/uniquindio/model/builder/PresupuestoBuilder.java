package co.edu.uniquindio.model.builder;

import co.edu.uniquindio.model.Estado;
import co.edu.uniquindio.model.Presupuesto;

public class PresupuestoBuilder {

    private String idPresupuesto;
    private int valor;
    private String descripcion;
    public Estado estado;

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

    public PresupuestoBuilder setIdPresupuesto(String idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
        return this;
    }
    public PresupuestoBuilder setValor(int valor) {
        this.valor = valor;
        return this;
    }
    public PresupuestoBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
    public PresupuestoBuilder setEstado(Estado estado) {
        this.estado = estado;
        return this;
    }

    public Presupuesto build() {
        return new Presupuesto(idPresupuesto, valor, descripcion, estado);
    }
}
