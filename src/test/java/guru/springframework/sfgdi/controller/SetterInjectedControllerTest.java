package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.PropertyInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
  SetterInjectedController setterInjectedController;

  @BeforeEach
  void setUp() {
    setterInjectedController = new SetterInjectedController();
    setterInjectedController.setGreetingService(new PropertyInjectedGreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(setterInjectedController.getGreeting());
  }
}