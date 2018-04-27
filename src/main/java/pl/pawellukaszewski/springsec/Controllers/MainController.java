package pl.pawellukaszewski.springsec.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pawellukaszewski.springsec.models.User;

@Controller
public class MainController {


    User user;

    @Autowired
    public MainController(User user) {
        this.user = user;
    }

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
