package ws;

import modelo.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
public class wsUsuarios {
    
    @RequestMapping(value = "login")
    public static Usuario login(@RequestParam("codigoUnico") String codigoUnico)
    {
        Usuario usuarioLogeado = (Usuario) dao.DAOEclipse.findAllByJPQL("SELECT u FROM Usuario u WHERE u.codigoUnico = \"" + codigoUnico + "\"");
        
        return usuarioLogeado;
    }
}
