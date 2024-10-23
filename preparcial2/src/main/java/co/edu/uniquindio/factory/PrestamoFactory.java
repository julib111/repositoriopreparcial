package co.edu.uniquindio.factory;

import co.edu.uniquindio.model.Prestamo;

import java.time.LocalDate;
import java.util.Date;

public class PrestamoFactory {

    public static Prestamo crearPrestamo(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion) {
        return new Prestamo(numeroPrestamo, fechaPrestamo, fechaEntrega, descripcion);
    }


}