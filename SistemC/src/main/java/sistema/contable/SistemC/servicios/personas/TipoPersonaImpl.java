package sistema.contable.SistemC.servicios.personas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema.contable.SistemC.modelo.personas.TipoPersona;
import sistema.contable.SistemC.modelo.personas.TipoPersonaRepository;

/**
 *
 * @author juank
 */
@Service
public class TipoPersonaImpl implements TipoPersonaServicio
{
    @Autowired 
    private TipoPersonaRepository tipopersonar;

    public TipoPersonaImpl(TipoPersonaRepository tipopersonar) {
        this.tipopersonar = tipopersonar;
    }
    
    
    @Override
    public List<TipoPersona> ListarTipo() 
    {
           return (List<TipoPersona>) tipopersonar.findAll();
       
    }

    @Override
    public TipoPersona guardarTipopersonas(TipoPersona tipopersona) 
    {
        return tipopersonar.save(tipopersona);
    }

    @Override
    public List<TipoPersona> editarTipopersonas(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TipoPersona> eliminarTipopersonas(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
