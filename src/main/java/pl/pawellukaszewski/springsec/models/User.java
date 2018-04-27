package pl.pawellukaszewski.springsec.models;

import org.springframework.stereotype.Component;

@Component //@Component = @Service = @configuration = @Bean =@Repository, robi to samo, czyli zamienia klase w ziarno
public class User {

private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
