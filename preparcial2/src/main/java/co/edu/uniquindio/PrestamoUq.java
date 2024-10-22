package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {
    private final List<Cliente> listaClientes;
    private final List<Prestamo> listaPrestamos;

    public PrestamoUq(String nombre) {
        listaClientes = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
        List<Empleado> listaEmpleados = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }
    public void agregarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }
    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }
}
