package guru.springframework.spring5webapp.service;

public class GreetingServiceImpl implements GreetingService{


    @Override
    public String sayHello() {
        return "Hello from Base service!!! ";
    }
}
