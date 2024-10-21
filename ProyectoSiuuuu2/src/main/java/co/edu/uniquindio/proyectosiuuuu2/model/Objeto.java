package co.edu.uniquindio.proyectosiuuuu2.model;

public abstract class Objeto implements IComponenteObjeto {
    private String nombre;
    private Prestamo prestamoAsociado;

    public Objeto(String nombre, Prestamo prestamoAsociado) {
        this.nombre = nombre;
        this.prestamoAsociado = prestamoAsociado;
    }

    public static ObjetoBuilder builder(){
        return new ObjetoBuilder();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public void setPrestamoAsociado(Prestamo prestamoAsociado) {
        this.prestamoAsociado = prestamoAsociado;
    }

    @Override
    public void mostrarCaracteristicas(){
        System.out.println("Nombre: " + nombre);
    }
}