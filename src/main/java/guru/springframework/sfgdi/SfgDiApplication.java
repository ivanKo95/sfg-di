package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.I18NController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgDiApplication {
  public static void main(String[] args) {
    var run = SpringApplication.run(SfgDiApplication.class, args);

    var myController = (MyController) run.getBean("myController");

    System.out.println("---Profile");
    var i18NController = (I18NController) run.getBean("i18NController");
    System.out.println(i18NController.sayHello());

    System.out.println("--- Primary");
    System.out.println(myController.sayHello());

    System.out.println("___Property");
    var propertyInjectedController = (PropertyInjectedController) run.getBean("propertyInjectedController");
    System.out.println(propertyInjectedController.getGreeting());

    System.out.println("___Setter");
    var setterInjectedController = (SetterInjectedController) run.getBean("setterInjectedController");
    System.out.println(setterInjectedController.getGreeting());

    System.out.println("___Constructor");
    var constructorInjectedController = (ConstructorInjectedController) run.getBean("constructorInjectedController");
    System.out.println(constructorInjectedController.getGreeting());
  }
}
