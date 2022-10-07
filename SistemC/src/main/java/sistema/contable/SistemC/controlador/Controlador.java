package sistema.contable.SistemC.controlador;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sistema.contable.SistemC.modelo.personas.TipoPersona;
import sistema.contable.SistemC.servicios.personas.PersonasImpl;
import sistema.contable.SistemC.servicios.personas.TipoPersonaImpl;

/**
 *
 * @author juank
 */

@Controller
@RequestMapping("/") // http:localhost:8080/
public class Controlador 
{
    @Autowired
    private PersonasImpl personasImpl;
    
    @Autowired
    private TipoPersonaImpl tipopersonaImpl;
    
    
    // ingresar
    @GetMapping("") // http:localhost:8080/
    public String ingresar() {
        return "index";
    }

    @GetMapping("/adicionar") // http:localhost:8080/adicionar
    public String adiciona(Model model) 
    {
        model.addAttribute("Listatipo", tipopersonaImpl.ListarTipo());
        return "personas/adicionar";
    }

    
}
