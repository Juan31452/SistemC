package sistema.contable.SistemC.modelo.clientes;


import java.util.List;
//import org.springframework.transaction.annotation.Transactional;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
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
      @Transactional

   
      @Query (value = "select c.id,c.cc_nit,c.nombres,c.apellidos,c.direccion,c.correo,c.telefono,c.obligacionf"          
          + "  from clientes c where c.id =:miid ", nativeQuery = true)
  public List<Clientes> consultausuario1(@Param("miid") Long id);
  
  //@Modifying
  //@Query(value="delete from clientes where id = :miid", nativeQuery =true)
    //public void eliminarcliente(@Param("miid") Long id);
   //  long deleteByid(Long id);   

}
