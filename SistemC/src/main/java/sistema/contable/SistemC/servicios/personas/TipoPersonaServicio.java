package sistema.contable.SistemC.servicios.personas;

import java.util.List;
import sistema.contable.SistemC.modelo.personas.TipoPersona;

/**
 *
 * @author juank
 */
public interface TipoPersonaServicio 
{
    List<TipoPersona> ListarTipo();
    TipoPersona guardarTipopersonas(TipoPersona tipopersona);
    List<TipoPersona> editarTipopersonas(Long id);
    List<TipoPersona> eliminarTipopersonas(Long id);
          
}
