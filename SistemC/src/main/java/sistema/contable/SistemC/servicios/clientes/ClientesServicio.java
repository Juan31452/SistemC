package sistema.contable.SistemC.servicios.clientes;

import java.util.List;
import sistema.contable.SistemC.modelo.clientes.Clientes;

/**
 *
 * @author juank
 */
public interface ClientesServicio {
    List<Clientes> ListarTodos();
    Clientes guardarclientes(Clientes clientes);
    List<Clientes> editarclientes(Long id);
    //public void eliminarcliente(Long id);
    void deleteClienteById(Long id);
    
}
