package pl.pawellukaszewski.springsec.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pawellukaszewski.springsec.models.nothing.User;

@Controller
@PropertySource("classpath:application.properties")
public class MainController {


    User user;

    @Value("${google.distancematrix.key}")

    String googleKey;

    @Autowired
    public MainController(User user) {
        this.user = user;
    }

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return googleKey;
    }

}
