package sistema.contable.SistemC.modelo.personas;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juank
 */
@Repository
public interface PersonasRepository extends CrudRepository<Personas, Long>
{
    
}
