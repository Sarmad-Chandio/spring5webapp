package guru.springframework.spring5webapp.controllers;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConstructorInjectedControllerTest extends TestCase {
    @Autowired
    ConstructorInjectedController constructorInjectedController;



    @Test
    public void testSayHello() {
        System.out.println("ConstructorInjectedControllerTest "+constructorInjectedController.sayHello());
    }
}