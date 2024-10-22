package co.edu.uniquindio;

public class SistemaPrestamosFacade {

    public SistemaPrestamosFacade(PrestamoUq prestamoUq) {
    }

    public void realizarPrestamo(Cliente cliente, Objeto objeto) {
        System.out.println("Prestamo realizado para " + cliente.getNombre() + "con objeto: "+objeto.getNombre());
    }
}
