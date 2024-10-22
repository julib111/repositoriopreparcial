package co.edu.uniquindio;

    public interface Entrega {
    void entregar();
}

    class EntregaLocal implements Entrega {
        public void entregar() {
            System.out.println("Entrega realizada localmente");
        }
    }

    class EntregaInternacional implements Entrega {
        public void entregar() {
            System.out.println("Entrega realizada internacionalmente");
        }
    }

    abstract class PrestamoBridge{
        protected Entrega entrega;

        public PrestamoBridge(Entrega entrega) {
            this.entrega = entrega;
        }
        public abstract void realizarPrestamo();
    }

    class PrestamoLocal extends PrestamoBridge{
        public PrestamoLocal(Entrega entrega) {
            super(entrega);
        }

        @Override
        public void realizarPrestamo() {
            entrega.entregar();
            System.out.println("Prestamo local completado");
        }
    }

    class PrestamoInternacional extends PrestamoBridge{
        public PrestamoInternacional(Entrega entrega) {
            super(entrega);
        }

        @Override
        public void realizarPrestamo() {
            entrega.entregar();
            System.out.println("Prestamo internacional completado");
        }
    }
