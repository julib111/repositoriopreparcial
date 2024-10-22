package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

abstract class CompositeObjeto {
        public abstract void mostrar();
}

    class ObjetoSimple extends CompositeObjeto {
        private final String nombre;

        public ObjetoSimple(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public void mostrar() {
            System.out.println("Objeto Simple: " + nombre);
        }
    }

    class ObjetoCompuesto extends CompositeObjeto {
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