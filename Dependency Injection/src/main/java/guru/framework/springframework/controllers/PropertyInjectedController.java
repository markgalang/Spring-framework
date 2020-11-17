package guru.framework.springframework.controllers;

import guru.framework.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("constructorGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
       return greetingService.sayGreeting();
    }
}
