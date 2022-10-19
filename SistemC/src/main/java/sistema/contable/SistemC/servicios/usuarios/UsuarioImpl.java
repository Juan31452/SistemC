package sistema.contable.SistemC.servicios.usuarios;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import sistema.contable.SistemC.modelo.usuarios.UsuarioRepository;
import sistema.contable.SistemC.modelo.usuarios.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import sistema.contable.SistemC.modelo.usuarios.Roles;

@Service
public class UsuarioImpl implements UsuariosServicio
{
    @Autowired 
    private UsuarioRepository usuarior;

//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;


    public UsuarioImpl(UsuarioRepository usuarior) {
        this.usuarior = usuarior;
    }
    
    @Override
    public Usuarios guardarusuarios(Usuarios usuarios) {
        return usuarior.save(usuarios);
    }
    /*
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuarios usuarios = usuarior.findByemail(email);
		if(usuarios == null) {
			throw new UsernameNotFoundException("Usuario o password inválidos");
		}
		return new User(usuarios.getEmail(),usuarios.getPassword(), mapearAutoridadesRoles(usuarios.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Roles> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombre())).collect(Collectors.toList());
	}
        */
    @Override
    public List<Usuarios> listarUsuarios() {
	return (List<Usuarios>) usuarior.findAll();    
    }
	

}