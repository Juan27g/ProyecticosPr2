package co.edu.uniquindio.DTO;

public class DireccionDTO {
    public String calle;
    public String barrio;
    public String ciudad;

    public DireccionDTO(String calle, String barrio, String ciudad) {
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;

    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
