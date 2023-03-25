package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingServiceImpl implements GreetingService {
  @Override
  public String sayGreeting() {
    String a = "Property";
    return String.format("Hello World - %s", a);
  }
}
