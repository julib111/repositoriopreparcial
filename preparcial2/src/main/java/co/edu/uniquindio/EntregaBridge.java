package co.edu.uniquindio;

    public interface EntregaBridge {
    void entregar();
}

    class EntregaLocal implements EntregaBridge {
        public void entregar() {
            System.out.println("Entrega realizada localmente");
        }
    }

    class EntregaInternacional implements EntregaBridge {
        public void entregar() {
            System.out.println("Entrega realizada internacionalmente");
        }
    }

    abstract class PrestamoBridge{
        protected EntregaBridge entrega;

        public PrestamoBridge(EntregaBridge entrega) {
            this.entrega = entrega;
        }
        public abstract void realizarPrestamo();
    }

    class PrestamoLocal extends PrestamoBridge{
        public PrestamoLocal(EntregaBridge entrega) {
            super(entrega);
        }

        @Override
        public void realizarPrestamo() {
            entrega.entregar();
            System.out.println("Prestamo local completado");
        }
    }

    class PrestamoInternacional extends PrestamoBridge{
        public PrestamoInternacional(EntregaBridge entrega) {
            super(entrega);
        }

        @Override
        public void realizarPrestamo() {
            entrega.entregar();
            System.out.println("Prestamo internacional completado");
        }
    }
