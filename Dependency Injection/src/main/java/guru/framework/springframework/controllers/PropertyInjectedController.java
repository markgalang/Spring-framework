package guru.framework.springframework.controllers;

import guru.framework.springframework.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
       return greetingService.sayGreeting();
    }
}
