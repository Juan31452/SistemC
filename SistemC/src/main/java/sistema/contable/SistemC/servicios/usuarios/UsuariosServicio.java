package sistema.contable.SistemC.servicios.usuarios;

import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;
import sistema.contable.SistemC.modelo.usuarios.Usuarios;

public interface UsuariosServicio { //extends UserDetailsService
    Usuarios guardarusuarios(Usuarios usuarios); 
    List<Usuarios> listarUsuarios();
    
    	
}