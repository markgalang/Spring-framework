package guru.framework.springframework.services;


import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGReetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - SETTER";
    }
}
