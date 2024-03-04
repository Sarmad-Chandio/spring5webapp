package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.controllers.MyController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring5webappApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController controller;
	//calling controller, injecting directly object of controller
	@Test
	public void testControllerByInjectingItsObject(){
		System.out.println("testControllerByInjectingItsObject "+controller.sayHello());
	}

	//calling controller method with the help of Application context (injecting  object of application context)
	@Test
	public void testGetControllerFromApplicationContext(){
		MyController controller=applicationContext.getBean(MyController.class);
		System.out.println(" test Case success "+ controller.sayHello());

	}

	@Test
	public void contextLoads() {
	}

}
