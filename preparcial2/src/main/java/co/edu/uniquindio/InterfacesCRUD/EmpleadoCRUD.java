package co.edu.uniquindio.InterfacesCRUD;

import co.edu.uniquindio.model.Empleado;

import java.util.List;

public interface EmpleadoCRUD {
    void crearEmpleado(Empleado empleado);
    Empleado obtenerEmpleadoPorId(String cedula);
    List<Empleado> listarEmpleados();
    void actualizarEmpleado(Empleado empleado);
    void eliminarEmpleado(String cedula);
}
