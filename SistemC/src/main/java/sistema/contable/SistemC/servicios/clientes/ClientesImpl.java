package sistema.contable.SistemC.servicios.clientes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema.contable.SistemC.modelo.clientes.Clientes;
import sistema.contable.SistemC.modelo.clientes.Clientes;
import sistema.contable.SistemC.modelo.clientes.ClientesRepository;

/**
 *
 * @author juank
 */
@Service
public class ClientesImpl implements ClientesServicio 
{
    @Autowired 
    private ClientesRepository clientesr;

    public ClientesImpl(ClientesRepository clientesr) {
        this.clientesr = clientesr;
    }
    
    

    @Override
    public List<Clientes> ListarTodos() 
    {
        return (List<Clientes>) clientesr.findAll();
    }

    
    @Override
    public Clientes guardarclientes(Clientes clientes) 
    {
      return clientesr.save(clientes);          
    }

    @Override
    public List<Clientes> editarclientes(Long id) {
        return clientesr.consultausuario1(id);

    }

    @Override
    public List<Clientes> eliminararclientes(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
