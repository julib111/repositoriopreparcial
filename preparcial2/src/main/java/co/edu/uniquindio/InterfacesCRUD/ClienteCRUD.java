package co.edu.uniquindio.InterfacesCRUD;

import co.edu.uniquindio.model.Cliente;

import java.util.List;

public interface ClienteCRUD {
    void crearCliente(Cliente cliente);
    Cliente buscarClientePorId(String cedula);

    Cliente obtenerClientePorId(String cedula);

    List<Cliente> listarClientes();
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(String cedula);
}
