package sistema.contable.SistemC.modelo.clientes;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juank
 */
@Repository
public interface ClientesRepository extends CrudRepository<Clientes, Long>
{
   
      @Query (value = "select c.id,c.cc_nit,c.nombres,c.apellidos,c.direccion,c.correo,c.telefono,c.obligacionf"          
          + "  from clientes c where c.id =:miid ", nativeQuery = true)
  public List<Clientes> consultausuario1(@Param("miid") Long id);

}
