package co.edu.uniquindio;

import java.time.LocalDate;

public class Prestamo {
    private String numeroPrestamo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private String descripcion;
    private Cliente clienteAsociado;

    public Prestamo(String numero, LocalDate fechaPrestamo, LocalDate fechaEntrega, String descripcion, Cliente cliente) {
        this.numeroPrestamo = numero;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.clienteAsociado = cliente;
    }

    public String getNumeroPrestamo() {return numeroPrestamo; }
    public LocalDate getFechaPrestamo() {return fechaPrestamo; }
    public LocalDate getFechaEntrega() {return fechaEntrega; }
    public String getDescripcion() {return descripcion; }

}