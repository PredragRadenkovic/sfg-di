package pr.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pr.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectionController {
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
