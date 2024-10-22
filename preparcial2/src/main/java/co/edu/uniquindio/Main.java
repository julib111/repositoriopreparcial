package co.edu.uniquindio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Crear algunos objetos
        Objeto objeto1 = new Objeto("Laptop");
        Objeto objeto2 = new Objeto("Proyector");
        Objeto objeto3 = new Objeto("Kit de herramientas");

        //Crear algunos clientes
        Cliente cliente1 = new Cliente("Luis","Bustamante","123456789", "47");
        Cliente cliente2 = new Cliente("Paula","Niño","98765431", "46");

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


    }
}