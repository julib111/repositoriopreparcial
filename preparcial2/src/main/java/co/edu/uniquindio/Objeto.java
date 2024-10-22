package co.edu.uniquindio;

public class Objeto {
    private String nombre;
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
