package co.edu.uniquindio.model;

import java.time.LocalDate;
import java.util.Date;

public class Prestamo {
    private final String numeroPrestamo;
    private final LocalDate fechaPrestamo;
    private final LocalDate fechaEntrega;
    private final String descripcion;
    public Cliente clienteAsociado;

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

    public Prestamo(String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion, String numeroPrestamo1, LocalDate fechaPrestamo1, LocalDate fechaEntrega1, String descripcion1) {
        this.numeroPrestamo = numeroPrestamo1;
        this.fechaPrestamo = fechaPrestamo1;
        this.fechaEntrega = fechaEntrega1;
        this.descripcion = descripcion1;
    }

    public String getNumeroPrestamo() {return numeroPrestamo; }
    public LocalDate getFechaPrestamo() {return fechaPrestamo; }
    public LocalDate getFechaEntrega() {return fechaEntrega; }
    public String getDescripcion() {return descripcion; }

}