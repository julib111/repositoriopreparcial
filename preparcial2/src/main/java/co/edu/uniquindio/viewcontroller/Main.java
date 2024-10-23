package co.edu.uniquindio.viewcontroller;

import co.edu.uniquindio.controller.SistemaPrestamosFacade;
import co.edu.uniquindio.mapping.EmpleadoAdapter;
import co.edu.uniquindio.model.*;
import co.edu.uniquindio.service.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        TransaccionalService transaccion = new TransaccionalService();

        transaccion.iniciarTransaccion();

        //Crear algunos clientes
        Cliente cliente1 = new Cliente("Luis","Bustamante","123456789", "47");
        Cliente cliente2 = new Cliente("Paula","Niño","98765431", "46");

        //transaccion
        System.out.println("Listado de clientes:");
        clienteService.listarClientes().forEach(cliente -> System.out.println(cliente.getNombre()));

        Cliente clienteActualizado = new Cliente("Luis", "Bustamante", "123456789", "46");
        clienteService.actualizarCliente(clienteActualizado);

        clienteService.eliminarCliente("789123");

        transaccion.confirmarTransaccion();

        //Crear algunos objetos
        Objeto objeto1 = new Objeto("Laptop");
        Objeto objeto2 = new Objeto("Proyector");
        Objeto objeto3 = new Objeto("Kit de herramientas");

        //Crear empleados
        Empleado empleado1 = new Empleado("Gabriela","Bustamante","147852369","14");

        //Crear un préstamo
        Prestamo prestamo1 = new Prestamo("J001", LocalDate.now(), LocalDate.now().plusDays(7), "Laptop prestada para un proyecto", cliente1);

        //Asociar el préstamo al cliente
        cliente1.agregarPrestamo(prestamo1);

        //Mostrar información del cliente y sus préstamos
        System.out.println("Cliente: "+ cliente1.getNombre());
        for (Prestamo prestamo : cliente1.getPrestamos()) {
            System.out.println("Préstamo: "+prestamo.getDescripcion());
        }

        //Uso del patrón adapter: Empleado actuando como cliente
        Cliente empleadoComoCliente = new EmpleadoAdapter(empleado1);
        System.out.println("Empleado usando el sistema como cliente: " + empleadoComoCliente.getNombre());

        //Uso del patron Bridge: prestamos locales e internacionales
        PrestamoBridge prestamoLocal = new PrestamoLocal(new EntregaLocal());
        PrestamoBridge prestamoInternacional = new PrestamoInternacional(new EntregaInternacional());

        prestamoLocal.realizarPrestamo();
        prestamoInternacional.realizarPrestamo();

        //Uso del patrón Composite: Objeto compuesto (kit de herramientas)
        ObjetoCompuesto kit = new ObjetoCompuesto();
        kit.agregar(new ObjetoSimple("Martillo"));
        kit.agregar(new ObjetoSimple("Destornillador"));
        kit.agregar(new ObjetoSimple("LLave inglesa"));

        System.out.println("\nContenido del Kit de Herramientas: ");
        kit.mostrar();

        //Uso del patrón Decorator: préstamo con seguro
        PrestamoConSeguro prestamoConSeguro = new PrestamoConSeguro(prestamo1);
        System.out.println("\nPréstamo con seguro: ");
        prestamoConSeguro.realizarPrestamo();

        //Uso del patrón Facade: simplificar la operacion del sistema
        PrestamoUq sistema = new PrestamoUq("Sistema de Préstamos UQ");
        SistemaPrestamosFacade facade = new SistemaPrestamosFacade(sistema);

        facade.realizarPrestamo(cliente2, objeto2);

        //Uso del patrón proxy: control de acceso a un objeto
        ObjetoProxy proxyObjeto = new ObjetoProxy(objeto1, false);
        System.out.println("\nIntentando acceder al objeto: " + proxyObjeto.getNombre());


    }
}