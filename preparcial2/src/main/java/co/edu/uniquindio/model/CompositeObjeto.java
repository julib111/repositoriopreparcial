package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeObjeto {
        public abstract void mostrar();
}

    public class ObjetoSimple extends CompositeObjeto {
        private final String nombre;

        public ObjetoSimple(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void mostrar() {
            System.out.println("Objeto Simple: " + nombre);
        }
    }

    public class ObjetoCompuesto extends CompositeObjeto {
        private final List<CompositeObjeto> componentes = new ArrayList<>();


    public void agregar(CompositeObjeto componente) {
        componentes.add(componente);
    }

    @Override
        public void mostrar() {
        for(CompositeObjeto componente : componentes) {
            componente.mostrar();
        }
    }
}