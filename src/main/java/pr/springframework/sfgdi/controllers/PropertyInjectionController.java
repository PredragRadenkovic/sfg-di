package pr.springframework.sfgdi.controllers;

import pr.springframework.sfgdi.services.GreetingService;

public class PropertyInjectionController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
