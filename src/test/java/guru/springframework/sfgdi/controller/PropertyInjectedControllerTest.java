package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.PropertyInjectedGreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
  private PropertyInjectedController propertyInjectedController;

  @BeforeEach
  void setUp() {
    propertyInjectedController = new PropertyInjectedController();
    propertyInjectedController.greetingService = new PropertyInjectedGreetingServiceImpl() {
    };
  }

  @Test
  void getGreetingService() {
    Assertions.assertEquals("Hello World - Property1", propertyInjectedController.getGreeting());
  }
}