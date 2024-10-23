package co.edu.uniquindio.controller;

import co.edu.uniquindio.service.EntregaLocal;
import co.edu.uniquindio.service.PrestamoBridge;
import co.edu.uniquindio.service.PrestamoLocal;
import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Objeto;
import co.edu.uniquindio.model.PrestamoUq;

public class SistemaPrestamosFacade {

    public SistemaPrestamosFacade(PrestamoUq prestamoUq) {
    }

    public void realizarPrestamo(Cliente cliente, Objeto objeto) {
        PrestamoBridge prestamo = new PrestamoLocal(new EntregaLocal());
        System.out.println("Prestamo realizado para " + cliente.getNombre() + "con objeto: "+objeto.getNombre());
        prestamo.realizarPrestamo();
    }
}
