package servicios;

import java.util.List;
import sistema.contable.SistemC.modelo.personas.Personas;

/**
 *
 * @author juank
 */
public interface PersonasServicio {
    List<Personas> ListarTodos();
    Personas guardarpersonas(Personas personas);
    List<Personas> editarpersonas(Long id);
    List<Personas> eliminararpersonas(Long id);
    
    
}
