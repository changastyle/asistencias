package ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Redireccionamiento 
{
    @RequestMapping("/") 
    public ModelAndView redirect()
    {
        return new ModelAndView("redireccionamiento");
    }
}
