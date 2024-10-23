package co.edu.uniquindio.InterfacesCRUD;

import co.edu.uniquindio.model.CompositeObjeto;

import java.util.List;

public interface ObjetoCRUD {
    void crearObjeto(CompositeObjeto objeto);
    CompositeObjeto obtenerObjetoPorNombre(String nombre);
    List<CompositeObjeto> listarObjetos();
    void actualizarObjeto(CompositeObjeto objeto);
    void eliminarObjeto(CompositeObjeto objeto);
}
