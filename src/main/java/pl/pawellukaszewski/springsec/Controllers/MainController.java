package pl.pawellukaszewski.springsec.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "tutaj jest index";
    }

    @GetMapping("/distance")
    @ResponseBody
    public String distance() {
        return "tutaj bedzie index";
    }
}
