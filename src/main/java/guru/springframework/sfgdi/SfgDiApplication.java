package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		var run = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) run.getBean("myController");

		var greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("___property");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) run.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("___setter");

		SetterInjectedController setterInjectedController =
				(SetterInjectedController) run.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("___constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) run.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}
}
