package co.edu.uniquindio.projectparcial2.patrones.Proxy;

public class ProxyPrestamo implements IPrestamo{
    private Prestamo prestamo;
    private String nombre;
    private String cliente;
    private String producto;

    public ProxyPrestamo(String nombre, String cliente, String producto) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.producto = producto;
        prestamo = new Prestamo(nombre, cliente, producto);
    }

    @Override
    public void mostrarPrestamos() {
        prestamo.mostrarPrestamos();
    }

    @Override
    public void registrarAccesos() {
        if (prestamo.getContador() >= 5){
            System.out.println("Ya no puedes usar mas este producto");
        }else{
            prestamo.registrarAccesos();
            prestamo.setContador(prestamo.getContador()+1);
            System.out.println("Se han registrado: "+prestamo.getContador());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

}
