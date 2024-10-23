package co.edu.uniquindio.InterfacesCRUD;

import co.edu.uniquindio.model.Prestamo;
import java.util.List;

public interface PrestamoCRUD {
    void crearPrestamo(Prestamo prestamo);
    Prestamo obtenerPrestamoPorNumero(String numero);
    List<Prestamo> listarPrestamos();
    void actualizarPrestamo(Prestamo prestamo);
    void eliminarPrestamo(Prestamo prestamo);
}
