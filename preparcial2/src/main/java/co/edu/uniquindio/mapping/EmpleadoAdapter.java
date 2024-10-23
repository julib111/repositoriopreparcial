package co.edu.uniquindio.mapping;

import co.edu.uniquindio.model.Cliente;
import co.edu.uniquindio.model.Empleado;

public class EmpleadoAdapter extends Cliente {

        public EmpleadoAdapter(Empleado empleado) {
        super (empleado.getNombre(), empleado.getApellido(), empleado.getCedula(), empleado.getEdad());
        }
}
