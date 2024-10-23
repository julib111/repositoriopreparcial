package co.edu.uniquindio.model;

public class ObjetoProxy extends Objeto {
    private final Objeto objetoReal;
    private final boolean accesoPermitido;

    public ObjetoProxy(Objeto objetoReal, boolean accesoPermitido) {
        super(objetoReal.getNombre());
        this.objetoReal = objetoReal;
        this.accesoPermitido = accesoPermitido;
    }

    @Override
    public String getNombre() {
        if (accesoPermitido) {
            return objetoReal.getNombre();
        } else {
            return "Acceso denegado";
        }
    }
}
