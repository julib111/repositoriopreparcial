package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

    public class Cliente extends Persona {
        private final List<Prestamo> listaPrestamosAsociados;

        public Cliente(String nombre, String apellido, String cedula, String edad) {
            super(nombre, apellido, cedula, edad);
            listaPrestamosAsociados = new ArrayList<>();
        }

    public void agregarPrestamo(Prestamo prestamo){
            listaPrestamosAsociados.add(prestamo);
    }

    public List<Prestamo> getPrestamos(){
            return listaPrestamosAsociados;
    }
}