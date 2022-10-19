package sistema.contable.SistemC.modelo.usuarios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Roles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombrerol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrerol() {
		return nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

	public Roles(Long id, String nombre) {
		super();
		this.id = id;
		this.nombrerol = nombrerol;
	}

	public Roles() {
		
	}

	public Roles(String nombre) {
		super();
		this.nombrerol = nombre;
	}    
}