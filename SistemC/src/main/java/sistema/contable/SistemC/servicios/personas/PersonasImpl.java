package sistema.contable.SistemC.servicios.personas;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema.contable.SistemC.modelo.personas.Personas;
import sistema.contable.SistemC.modelo.personas.PersonasRepository;

/**
 *
 * @author juank
 */
@Service
public class PersonasImpl implements PersonasServicio 
{
    @Autowired 
    private PersonasRepository personasr;

    public PersonasImpl(PersonasRepository personasr) {
        this.personasr = personasr;
    }
    
    

    @Override
    public List<Personas> ListarTodos() 
    {
        return (List<Personas>) personasr.findAll();
    }

    
    @Override
    public Personas guardarpersonas(Personas personas) 
    {
      return personasr.save(personas);          
    }

    @Override
    public List<Personas> editarpersonas(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Personas> eliminararpersonas(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
