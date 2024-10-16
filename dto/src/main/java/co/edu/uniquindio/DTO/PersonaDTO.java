package co.edu.uniquindio.DTO;

public class PersonaDTO {
    public String nombre;
    public String apellido;
    public int edad;
    public DireccionDTO direccionDTO;


    public PersonaDTO(String nombre, String apellido, int edad, DireccionDTO direccionDTO) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
