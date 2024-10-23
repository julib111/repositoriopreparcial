package co.edu.uniquindio.service;

import co.edu.uniquindio.InterfacesCRUD.ClienteCRUD;
import co.edu.uniquindio.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteService implements ClienteCRUD {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void crearCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente creado" + cliente.getNombre());
    }

    @Override
    public Cliente buscarClientePorId(String cedula) {
        return null;
    }

    @Override
    public Cliente obtenerClientePorId(String cedula) {
        return clientes.stream()
                .filter(cliente -> cliente.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
    }
    @Override
    public List<Cliente> listarClientes() {
        return clientes;
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        Cliente c = obtenerClientePorId(cliente.getCedula());
        if (c != null) {
            clientes.remove(c);
            clientes.add(cliente);
            System.out.println("Cliente actualizado: " + cliente.getNombre());
        }
    }

    @Override
    public void eliminarCliente(String cedula) {
        clientes.removeIf(cliente -> cliente.getCedula().equals(cedula));
        System.out.println("Cliente eliminado con cédula: " + cedula);
    }
}