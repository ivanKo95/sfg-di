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

		MyController myController = (MyController) run.getBean("myController");

		System.out.println("---Profile");
		I18NController i18NController = (I18NController) run.getBean("i18NController");
		System.out.println(i18NController.sayHello());

		System.out.println("--- Primary");
		System.out.println(myController.sayHello());

		System.out.println("___Property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) run.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("___Setter");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) run.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("___Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) run.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
