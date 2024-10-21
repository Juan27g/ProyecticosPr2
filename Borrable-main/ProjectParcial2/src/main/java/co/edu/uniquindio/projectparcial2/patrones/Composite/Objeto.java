package co.edu.uniquindio.projectparcial2.patrones.Composite;

public class Objeto implements ICompositeObjeto{
    private String nombre;

    public Objeto(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void show() {
        System.out.println("Nombre: " + nombre);
    }
}
