package sistema.contable.SistemC.modelo.clientes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author juank
 */

@Data // se encarga de los getters y setters
@Entity
@Table(name = "tipoPersona")
public class TipoPersona implements Serializable
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idtipo")
  private Long idtipo;
  @Column(name = "descripcion", nullable = false,length = 40)
  private String descripcion;
  
  //@ManyToOne
  //private Personas persona;

      
}
