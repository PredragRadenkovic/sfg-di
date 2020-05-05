package pr.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pr.springframework.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectionControllerTest {
    ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(
                new ConstructorGreetingService()
        );
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}