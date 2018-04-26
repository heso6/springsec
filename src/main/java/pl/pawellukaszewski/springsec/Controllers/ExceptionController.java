package pl.pawellukaszewski.springsec.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {
    @GetMapping("/403")
    @ResponseBody
    public String accessDenied() {
        return "<center><b>Nie masz prawa widziec, co tutaj jest, zaloguj sie</b></center";
    }
}
