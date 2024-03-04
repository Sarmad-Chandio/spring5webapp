package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		//getting context from main class
		ApplicationContext ctx =SpringApplication.run(Spring5webappApplication.class, args);
		MyController controller=ctx.getBean(MyController.class);

		System.out.println("In main method");

		System.out.println(controller.sayHello());

	}
}
