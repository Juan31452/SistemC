package sistema.contable.SistemC.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    
}