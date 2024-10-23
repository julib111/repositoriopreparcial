package co.edu.uniquindio.model;

public class Objeto {
    private final String nombre;
    private boolean disponible;

    public Objeto(String nombre){
        this.nombre = nombre;
        this.disponible = true;

    }
    public String getNombre() {return nombre;}
    public boolean isDisponible() {return disponible;}

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
