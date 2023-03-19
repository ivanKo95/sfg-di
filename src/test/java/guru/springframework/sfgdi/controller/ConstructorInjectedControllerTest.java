package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.PropertyInjectedGreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
  private ConstructorInjectedController constructorInjectedController;

  @BeforeEach
  void setUp() {
    constructorInjectedController = new ConstructorInjectedController(new PropertyInjectedGreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    Assertions.assertEquals("Hello World - Property", constructorInjectedController.getGreeting());
  }
}
