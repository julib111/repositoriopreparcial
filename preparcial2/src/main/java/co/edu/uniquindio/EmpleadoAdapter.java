package co.edu.uniquindio;

    public class EmpleadoAdapter extends Cliente {

        public EmpleadoAdapter(Empleado empleado) {
        super (empleado.getNombre(), empleado.getApellido(), empleado.getCedula(), empleado.getEdad());
        }
}
