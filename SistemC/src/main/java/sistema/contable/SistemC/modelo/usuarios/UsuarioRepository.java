package sistema.contable.SistemC.modelo.usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuarios, Long>
{
   public Usuarios findByemail(String email);   
}