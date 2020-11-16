package guru.framework.springframework.controllers;

import guru.framework.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectedController {

    private final GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
