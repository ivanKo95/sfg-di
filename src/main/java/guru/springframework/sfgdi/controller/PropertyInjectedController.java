package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
  @Qualifier("propertyInjectedGreetingServiceImpl")
  @Autowired
  GreetingService greetingService;

  public String getGreeting() {
    return greetingService.sayGreeting();
  }
}
