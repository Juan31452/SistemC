package sistema.contable.SistemC.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sistema.contable.SistemC.modelo.clientes.Clientes;
import sistema.contable.SistemC.modelo.usuarios.RolesRepository;
import sistema.contable.SistemC.modelo.usuarios.Usuarios;
import sistema.contable.SistemC.servicios.clientes.ClientesImpl;
import sistema.contable.SistemC.servicios.clientes.TipoPersonaImpl;
import sistema.contable.SistemC.servicios.usuarios.UsuarioImpl;

/**
 *
 * @author juank
 */

@Controller
//@RequestMapping("/") // http:localhost:8080/
public class Controlador 
{
    @Autowired
    private ClientesImpl clientesImpl;
    
    @Autowired
    private TipoPersonaImpl tipopersonaImpl;
    
    @Autowired
    private UsuarioImpl usuarioImpl;
    
    @Autowired
    private RolesRepository rolesr;
    
    // login
    @GetMapping("/milogin") // http:localhost:8080/
    public String loginForm() {
        return "login";
    }
    // ingresar admin
    @GetMapping("/adminautenticado") // http:localhost:8080/
    public String ingresar() {
        return "administrador";
    }
    
    // acceso dengado
    @GetMapping("/acceso_denegado") // http:localhost:8080/
    public String accesodenegado() {
        return "acceso_denegado";
    }

    @GetMapping("/registar") // http:locariosalhost:8080/adicionar
    public String adicionausuario(Model model) 
    {
        model.addAttribute("Listarol", rolesr.findAll());
        return "usuarios/adicionar";
    }

    @PostMapping("/guardarusuario") // http:locariosalhost:8080/adicionar
    public String guardarusuario(Usuarios usuarios,Model model) 
    {
        usuarioImpl.guardarusuarios(usuarios);
        return "login";
    }
    
    // listar
    @GetMapping("/listaclientes") // http:localhost:8080/
    public String listaclientes(Model model) 
    {
        model.addAttribute("listado",clientesImpl.ListarTodos());
        return "/clientes/listar";
    }

    @GetMapping("/adicionar") // http:localhost:8080/adicionar
    public String adicionacliente() 
    {
        //model.addAttribute("adiciona", clientesImpl.guardarclientes(clientes));
        return "clientes/adicionar";
    }
    
    @PostMapping("/guardar")
    public String guardar(Clientes clientes, Model modelo) {
        String mensaje1 = "Usuario actualizado con exito!";

        clientesImpl.guardarclientes(clientes);
        modelo.addAttribute("mensaje", mensaje1);
        return "redirect:/listaclientes";//redirect:
    }

    // editar
    @GetMapping("/editarclientes/{id}") // http:localhost:8080/
    public String editar(@PathVariable("id") Long Id ,Model modelo) {
    //     Usuarios usuarios = usuarioImpl.findByIdusuario(Id);
        long miid = Id;
        List<Clientes> milista = clientesImpl.editarclientes(Id);
        

        modelo.addAttribute("editar", milista );
        modelo.addAttribute("id", miid );
        return "clientes/editarclientes";
    }
    
    // eliminar
    @GetMapping("/eliminarclientes/{id}") // http:localhost:8080/
    public String eliminar(@PathVariable("id") Long Id ,Model modelo) {
  
        clientesImpl.deleteClienteById(Id);

        return "redirect:/listaclientes";//redirect:
    }

}
