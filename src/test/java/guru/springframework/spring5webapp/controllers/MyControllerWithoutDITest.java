package guru.springframework.spring5webapp.controllers;

import junit.framework.TestCase;
import org.junit.Test;

public class MyControllerWithoutDITest extends TestCase {

    @Test
    public void testSayHello() {
        MyControllerWithoutDI myControllerWithoutDI=new MyControllerWithoutDI();
        System.out.println(myControllerWithoutDI.sayHello());
    }
}