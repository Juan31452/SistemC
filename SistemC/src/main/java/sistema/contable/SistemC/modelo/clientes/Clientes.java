package sistema.contable.SistemC.modelo.clientes;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author juank
 */

@Data // se encarga de los getters y setters
@Entity
@Table(name = "clientes")

public class Clientes implements Serializable
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  @Column(name = "cc_nit", nullable = false,length = 40)
  private String cc_nit;        
  @Column(name = "nombres", nullable = false,length = 50)
  private String nombres; 
  @Column(name = "apellidos",nullable = false, length = 50)
  private String apellidos;
  @Column(name = "direccion" ,nullable = false,length = 30)
  private String direccion;
  @Column(name = "correo" ,nullable = false,length = 30)
  private String correo;
  @Column(name = "telefono",length = 30)
  private String telefono;
  @Column(name = "obligacionf",nullable = false, length = 10)
  private String obligacionf;
  
  //@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
  //private Set<TipoPersona> tipos = new HashSet<>() ;

}
