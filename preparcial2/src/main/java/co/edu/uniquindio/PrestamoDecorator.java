package co.edu.uniquindio;

abstract class PrestamoDecorator extends Prestamo {
    protected Prestamo prestamo;

    public PrestamoDecorator(Prestamo prestamo) {
        super(prestamo.getNumeroPrestamo(), prestamo.getFechaPrestamo(), prestamo.getFechaEntrega(), prestamo.getDescripcion(), prestamo.clienteAsociado);

    }

    protected void realizarPrestamo() {
    }
}

class PrestamoConSeguro extends PrestamoDecorator {
    public PrestamoConSeguro(Prestamo prestamo) {
        super(prestamo);
    }

    @Override
    public void realizarPrestamo() {
        super.realizarPrestamo();
        System.out.println("Seguro agregado al préstamo.");
    }
}
