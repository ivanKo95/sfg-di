package guru.springframework.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingServiceImpl implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Hello World - Setter";
  }

  @Override
  public String sayGoodBye() {
    return null;
  }
}
