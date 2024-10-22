package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {
    private String nombre;
    private List<Cliente> listaClientes;
    private List<Prestamo> listaPrestamos;
    private List<Empleado> listaEmpleados;

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
        listaClientes = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
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
