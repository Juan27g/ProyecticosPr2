package co.edu.uniquindio.proyectosiuuuu2.model;

public class Cliente extends  Persona{
    private List<Prestamo> listaPrestamosAsociados;

    public Cliente(String nombre, String apellido, String cedula, String edad){
        super(nombre, apellido, cedula, edad);
        this.listaPrestamosAsociados = new ArrayList<Prestamo>();
    }

    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }

    public List<Prestamo> getListaPrestamosAsociados() {
        return listaPrestamosAsociados;
    }

    public void setListaPrestamosAsociados(List<Prestamo> listaPrestamosAsociados) {
        this.listaPrestamosAsociados = listaPrestamosAsociados;
    }
}
