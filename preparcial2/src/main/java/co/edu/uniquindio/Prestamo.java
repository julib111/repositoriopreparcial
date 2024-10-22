package co.edu.uniquindio;

import java.time.LocalDate;

public class Prestamo {
    private final String numeroPrestamo;
    private final LocalDate fechaPrestamo;
    private final LocalDate fechaEntrega;
    private final String descripcion;
    Cliente clienteAsociado;

    public Prestamo(String numero, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente cliente) {
        this.numeroPrestamo = numero;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.clienteAsociado = cliente;
    }


    public Prestamo(String numeroPrestamo, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
    }

    public String getNumeroPrestamo() {return numeroPrestamo; }
    public LocalDate getFechaPrestamo() {return fechaPrestamo; }
    public LocalDate getFechaEntrega() {return fechaEntrega; }
    public String getDescripcion() {return descripcion; }

}