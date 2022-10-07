package sistema.contable.SistemC.modelo.personas;

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
@Table(name = "personas")

public class Personas implements Serializable
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idpersonas")
  private Long idpersonas;
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
  @Column(name = "telefono",nullable = false, length = 30)
  private String telefono;
  @Column(name = "tipo",nullable = false, length = 15)
  private String tipo;
  @Column(name = "obligacionf",nullable = false, length = 10)
  private String obligacionf;
  
  //@OneToMany(mappedBy = "persona",cascade = CascadeType.ALL)
  //private Set<TipoPersona> tipos = new HashSet<>() ;

}
