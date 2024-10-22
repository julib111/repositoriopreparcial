package co.edu.uniquindio;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String edad;
    private String cedula;

    public Persona(String nombre, String apellido, String edad, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getEdad() {return edad;}
    public void setEdad(String edad) {this.edad = edad;}

    public String getCedula() {return cedula;}
    public void setCedula(String cedula) {this.cedula = cedula;}
}
