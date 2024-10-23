package co.edu.uniquindio.service;

    public interface EntregaBridge {
    void entregar();
}

    public class EntregaLocal implements EntregaBridge {
        public void entregar() {
            System.out.println("Entrega realizada localmente");
        }
    }

    public class EntregaInternacional implements EntregaBridge {
        public void entregar() {
            System.out.println("Entrega realizada internacionalmente");
        }
    }

    public abstract class PrestamoBridge{
        protected EntregaBridge entrega;

        public PrestamoBridge(EntregaBridge entrega) {
            this.entrega = entrega;
        }
        public abstract void realizarPrestamo();
    }

    public class PrestamoLocal extends PrestamoBridge{
        public PrestamoLocal(EntregaBridge entrega) {
            super(entrega);
        }

        @Override
        public void realizarPrestamo() {
            entrega.entregar();
            System.out.println("Prestamo local completado");
        }
    }

    public class PrestamoInternacional extends PrestamoBridge{
        public PrestamoInternacional(EntregaBridge entrega) {
            super(entrega);
        }

        @Override
        public void realizarPrestamo() {
            entrega.entregar();
            System.out.println("Prestamo internacional completado");
        }
    }
